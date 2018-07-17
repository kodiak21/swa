package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskNumberTopBoxView;

public class AskNumberTopBoxAction implements ResourceServiceAction {

	LanguageType languageType;
	AskNumberTopBoxView askNumberTopBoxView;
	
	public AskNumberTopBoxAction() throws IllegalArgumentException, IOException {
		this.askNumberTopBoxView = new AskNumberTopBoxView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox,int numberChildSeats) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			askNumberTopBoxView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			askNumberTopBoxView.showViewEng();
		}
		
		return resourceService;
	}

}
