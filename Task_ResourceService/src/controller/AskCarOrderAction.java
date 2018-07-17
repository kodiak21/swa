package controller;

import java.io.IOException;


import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskCarOrderView;

public class AskCarOrderAction implements ResourceServiceAction {

	AskCarOrderView askCarOrderView;
	LanguageType languageType;
	
	public AskCarOrderAction() throws IllegalArgumentException, IOException {
		this.askCarOrderView = new AskCarOrderView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox, int numberChildSeats) {
		if(languageType == LanguageType.GERMAN) {
			askCarOrderView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			askCarOrderView.showViewEng();
		}
		
		return resourceService;
	}
	
	public AskCarOrderView returnView() {
		return askCarOrderView;
	}

}
