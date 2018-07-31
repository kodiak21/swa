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
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if (languageType == LanguageType.GERMAN) {
			resourceService.setTopBoxResourceAnswer(askTopBoxView.showViewGer());
			if (resourceService.getTopBoxResourceAnswer() == 1) {
				resourceService.setTopBoxResource(resourceService.createTopBoxResource());
			} else if (resourceService.getTopBoxResourceAnswer() == 2) {
				resourceService.setTopBoxResource(null);
			}
		} else if (languageType == LanguageType.ENGLISH) {
			resourceService.setTopBoxResourceAnswer(askTopBoxView.showViewEng());
			if (resourceService.getTopBoxResourceAnswer() == 1) {
				resourceService.setTopBoxResource(resourceService.createTopBoxResource());
			} else if (resourceService.getTopBoxResourceAnswer() == 2) {
				resourceService.setTopBoxResource(null);
			}

		}

		

		return resourceService;
	}

	public AskTopBoxView returnView() {
		return askTopBoxView;
	}

}
