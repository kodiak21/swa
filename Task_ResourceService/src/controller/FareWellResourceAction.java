package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import view.FareWellView;

public class FareWellResourceAction implements ResourceServiceAction{
	
	private FareWellView fareWellView;

	public FareWellResourceAction() {
		this.fareWellView = new FareWellView();
	}

	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			fareWellView.showViewGer();
			System.exit(0);
		}else if(languageType == LanguageType.ENGLISH) {
			fareWellView.showViewEng();
			System.exit(0);
		}
		
		return resourceService;
	}

}
