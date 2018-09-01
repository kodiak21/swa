package controller;

import java.io.IOException;

import model.CarBrandType;
import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskCarBrandView;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * <b> verbundene Views</b>: AskCarBrandView<br>
 * <br>
 * <b>AskCarBrandAction:</b> Abfrage der Automarke falls Auto bestellt<br> 
 * 
 * @param carBrandAnswer - Kundenauswahl
 *
 */

public class AskCarBrandAction implements ResourceServiceAction {

	AskCarBrandView askCarBrandView;
	private int carBrandAnswer;

	public AskCarBrandAction() {
		this.askCarBrandView = new AskCarBrandView();
	}

	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {

		CarBrandType carBrandType;

		if (languageType == LanguageType.GERMAN) {
			resourceService.setCarBrandAnswer(askCarBrandView.showViewGer());

		} else if (languageType == LanguageType.ENGLISH) {
			resourceService.setCarBrandAnswer(askCarBrandView.showViewEng());
		}

		carBrandAnswer = resourceService.getCarBrandAnswer();

		switch (carBrandAnswer) {
		case 1:
			carBrandType = CarBrandType.BMW;
			resourceService.setCarBrandType(carBrandType);
			break;
		case 2:
			carBrandType = CarBrandType.MERCEDES;
			resourceService.setCarBrandType(carBrandType);
			break;
		case 3:
			carBrandType = CarBrandType.AUDI;
			resourceService.setCarBrandType(carBrandType);
			break;

		case 4:
			carBrandType = CarBrandType.VOLKSWAGEN;
			resourceService.setCarBrandType(carBrandType);
			break;
		default:
			break;

		}

		return resourceService;
	}

}
