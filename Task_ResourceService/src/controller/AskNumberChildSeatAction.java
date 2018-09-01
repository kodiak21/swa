package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskNumberChildSeatView;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * <b> verbundene Views</b>: AskNumberChildSeatView<br>
 * <br>
 * <b>AskNumberChildSeatAction:</b> Abfrage wie viele Kindersitze der Kunde bestellen möchte<br> 
 * 
 * 
 *
 */

public class AskNumberChildSeatAction implements ResourceServiceAction {

	LanguageType languageType;
	AskNumberChildSeatView askNumberChildSeatView;
	
	public AskNumberChildSeatAction() throws IllegalArgumentException, IOException {
		this.askNumberChildSeatView = new AskNumberChildSeatView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			resourceService.setChildSeatQuantity(askNumberChildSeatView.showViewGer());
		}else if(languageType == LanguageType.ENGLISH) {
			resourceService.setChildSeatQuantity(askNumberChildSeatView.showViewEng());
		}
		
		return resourceService;
	}

}
