package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskCarBrandView;
import view.AskDeleteResourceView;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * <b> verbundene Views</b>: AskDeleteResourceView<br>
 * <br>
 * <b>AskDeleteResourceAction:</b> Bestätigung der Eingaben<br> 
 * 
 * 
 *
 */

public class AskDeleteResourceAction implements ResourceServiceAction {

	AskDeleteResourceView askDeleteResourceView;

	public AskDeleteResourceAction() {
		this.askDeleteResourceView = new AskDeleteResourceView();
	}

	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {

		int answer = 0;

		if (languageType == LanguageType.GERMAN) {
			resourceService.setConfirmAnswer(askDeleteResourceView.showViewGer());
			answer = resourceService.getConfirmAnswer();
			switch (answer) {
			case 1:
				break;
			case 2:
				resourceService.deleteResource();
				break;
			case 3:
				ResourceServiceController resourceServiceController = new ResourceServiceController();
				resourceServiceController.resourcePlanning(languageType);
				break;
			default:
				break;
			}
		} else if (languageType == LanguageType.ENGLISH) {
			resourceService.setConfirmAnswer(askDeleteResourceView.showViewEng());
			answer = resourceService.getConfirmAnswer();
			switch (answer) {
			case 1:
				break;
			case 2:
				resourceService.deleteResource();
				break;
			case 3:
				ResourceServiceController resourceServiceController = new ResourceServiceController();
				resourceServiceController.resourcePlanning(languageType);
				break;
			default:
				break;
			}
		}

		return resourceService;
	}

}
