package controller;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;
import view.PrintMenuView;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * <b> verbundene Views</b>: PrintMenuView<br>
 * <br>
 * <b>PrintMenuResourceAction:</b> Ausgabe des Auswahlmenüs für den Kunden<br> 
 * 
 * 
 *
 */

public class PrintMenuResourceAction implements ResourceServiceAction {

	PrintMenuView printMenuView;
	
	public PrintMenuResourceAction() {
		this.printMenuView = new PrintMenuView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) {
		if(languageType == LanguageType.GERMAN) {
			printMenuView.showGer(resourceService.getCarResource(), resourceService.getTopBoxResource(), resourceService.getChildSeatResource());
		}else if(languageType == LanguageType.ENGLISH) {
			printMenuView.showEng(resourceService.getCarResource(), resourceService.getTopBoxResource(), resourceService.getChildSeatResource());
		}
		
		return resourceService;
	}

}
