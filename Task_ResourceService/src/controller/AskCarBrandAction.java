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
	
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			resourceService.setCarName(askCarBrandView.showViewGer());
		}else if(languageType == LanguageType.ENGLISH) {
			resourceService.setCarName(askCarBrandView.showViewEng());
		}
		return resourceService;
	}

	
}
