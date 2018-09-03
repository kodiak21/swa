package actions;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskChildSeatView;
import view.AskTopBoxView;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * <b> verbundene Views</b>: AskChildSeatView<br>
 * <br>
 * <b>AskChildSeatOrderAction:</b> Abfrage ob Kunde Kindersitze bestellen möchte<br> 
 * 
 * 
 *
 */

public class AskChildSeatOrderAction implements ResourceServiceAction {

	LanguageType languageType;
	AskChildSeatView askChildSeatView;
	
	public AskChildSeatOrderAction() throws IllegalArgumentException, IOException {
		this.askChildSeatView = new AskChildSeatView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			resourceService.setChildSeatResourceAnswer(askChildSeatView.showViewGer());
			if(resourceService.getChildSeatResourceAnswer()==1) {
				resourceService.setChildSeatResource(resourceService.createChildSeatResource());
			}else if(resourceService.getChildSeatResourceAnswer()==2) {
				resourceService.setChildSeatResource(null);
			}	
		}else if(languageType == LanguageType.ENGLISH) {
			resourceService.setChildSeatResourceAnswer(askChildSeatView.showViewEng());
			if(resourceService.getChildSeatResourceAnswer()==1) {
				resourceService.setChildSeatResource(resourceService.createChildSeatResource());
			}else if(resourceService.getChildSeatResourceAnswer()==2) {
				resourceService.setChildSeatResource(null);
			}	
		}
		
		
		
		return resourceService;
	}

}
