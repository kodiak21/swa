package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskNumberChildSeatView;

public class AskNumberChildSeatAction implements ResourceServiceAction {

	LanguageType languageType;
	AskNumberChildSeatView askNumberChildSeatView;
	
	public AskNumberChildSeatAction() throws IllegalArgumentException, IOException {
		this.askNumberChildSeatView = new AskNumberChildSeatView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox, int numberChildSeats) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			askNumberChildSeatView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			askNumberChildSeatView.showViewEng();
		}
		
		return resourceService;
	}

}
