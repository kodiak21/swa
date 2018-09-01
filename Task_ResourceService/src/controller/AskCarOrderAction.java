package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskCarOrderView;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * <b> verbundene Views</b>: AskCarOrderView<br>
 * <br>
 * <b>AskCarOrderAction:</b> Abfrage ob Kunde Auto bestellen möchte<br> 
 * 
 * 
 *
 */

public class AskCarOrderAction implements ResourceServiceAction {

	AskCarOrderView askCarOrderView;
	LanguageType languageType;

	public AskCarOrderAction() throws IllegalArgumentException, IOException {
		this.askCarOrderView = new AskCarOrderView();
	}

	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) {
		if (languageType == LanguageType.GERMAN) {
			resourceService.setCarResourceAnswer(askCarOrderView.showViewGer());
		} else if (languageType == LanguageType.ENGLISH) {
			resourceService.setCarResourceAnswer(askCarOrderView.showViewEng());
		}

		resourceService.setCarResource(resourceService.createCarResource());
		return resourceService;
	}

}
