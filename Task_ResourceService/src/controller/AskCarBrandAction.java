package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskCarBrandView;

public class AskCarBrandAction implements ResourceServiceAction {

	AskCarBrandView askCarBrandView;

	public AskCarBrandAction() {
		this.askCarBrandView = new AskCarBrandView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox, int numberChildSeats) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			askCarBrandView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			askCarBrandView.showViewEng();
		}
		return resourceService;
	}

	
}
