package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;
import view.AskCarBrandView;
import view.AskDeleteResourceView;

public class AskDeleteResourceAction implements ResourceServiceAction {

	AskDeleteResourceView askDeleteResourceView;

	public AskDeleteResourceAction() {
		this.askDeleteResourceView = new AskDeleteResourceView();
	}
	
	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox, int numberChildSeats) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			askDeleteResourceView.showViewGer();
		}else if(languageType == LanguageType.ENGLISH) {
			askDeleteResourceView.showViewEng();
		}
		return resourceService;	}

}
