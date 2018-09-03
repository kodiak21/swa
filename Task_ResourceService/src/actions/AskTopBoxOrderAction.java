package actions;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskTopBoxView;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * <b> verbundene Views</b>: AskTopBoxView<br>
 * <br>
 * <b>AskTopBoxOrderAction:</b> Abfrage ob Kunde Dachgepäckträger bestellen möchte<br> 
 * 
 * 
 *
 */


public class AskTopBoxOrderAction implements ResourceServiceAction {

	LanguageType languageType;
	AskTopBoxView askTopBoxView;

	public AskTopBoxOrderAction() throws IllegalArgumentException, IOException {
		this.askTopBoxView = new AskTopBoxView();
	}

	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if (languageType == LanguageType.GERMAN) {
			resourceService.setTopBoxResourceAnswer(askTopBoxView.showViewGer());
			if (resourceService.getTopBoxResourceAnswer() == 1) {
				resourceService.setTopBoxResource(resourceService.createTopBoxResource());
			} else if (resourceService.getTopBoxResourceAnswer() == 2) {
				resourceService.setTopBoxResource(null);
			}
		} else if (languageType == LanguageType.ENGLISH) {
			resourceService.setTopBoxResourceAnswer(askTopBoxView.showViewEng());
			if (resourceService.getTopBoxResourceAnswer() == 1) {
				resourceService.setTopBoxResource(resourceService.createTopBoxResource());
			} else if (resourceService.getTopBoxResourceAnswer() == 2) {
				resourceService.setTopBoxResource(null);
			}

		}

		return resourceService;
	}

}
