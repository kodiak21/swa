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
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if (languageType == LanguageType.GERMAN) {
			resourceService.setConfirmAnswer(askDeleteResourceView.showViewGer());
			resourceService.deleteResource();
		} else if (languageType == LanguageType.ENGLISH) {
			resourceService.setConfirmAnswer(askDeleteResourceView.showViewEng());
			resourceService.deleteResource();
		}
		return resourceService;
	}

}
