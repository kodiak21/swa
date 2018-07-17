package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskChildSeatView;
import view.AskTopBoxView;

public class AskChildSeatOrderAction implements ResourceServiceAction {

	LanguageType languageType;
	AskChildSeatView askChildSeatView;
	
	public AskChildSeatOrderAction() throws IllegalArgumentException, IOException {
		this.askChildSeatView = new AskChildSeatView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox,int numberChildSeats) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			askChildSeatView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			askChildSeatView.showViewEng();
		}
		
		return resourceService;
	}

}
