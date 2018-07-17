package controller;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;
import view.PrintMenuView;

public class PrintMenuResourceAction implements ResourceServiceAction {

	PrintMenuView printMenuView;
	Resource resource;
	TopBox topBox;
	ChildSeat childSeat;
	
	public PrintMenuResourceAction() {
		this.printMenuView = new PrintMenuView();
		resource = new Car();
		topBox = new TopBox(resource);
		childSeat = new ChildSeat(resource);
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox, ChildSeat childSeat, LanguageType languageType, int numberTopBox,int numberChildSeats) {
		if(languageType == LanguageType.GERMAN) {
			printMenuView.showGer(resource, topBox, childSeat);
		}else if(languageType == LanguageType.ENGLISH) {
			printMenuView.showEng(resource, topBox, childSeat);
		}
		
		return resourceService;
	}

}
