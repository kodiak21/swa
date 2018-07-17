package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskTopBoxView;

public class AskTopBoxOrderAction implements ResourceServiceAction {

	LanguageType languageType;
	AskTopBoxView askTopBoxView;
	
	public AskTopBoxOrderAction() throws IllegalArgumentException, IOException {
		this.askTopBoxView = new AskTopBoxView();
	}
	
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox, int numberChildSeats) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			askTopBoxView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			askTopBoxView.showViewEng();
		}
		
		return resourceService;
	}

	public AskTopBoxView returnView() {
		return askTopBoxView;
	}
	
}
