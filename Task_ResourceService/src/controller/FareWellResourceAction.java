package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import view.FareWellResourceView;

public class FareWellResourceAction implements ResourceServiceAction{
	
	private FareWellResourceView fareWellResourceView;

	public FareWellResourceAction() {
		this.fareWellResourceView = new FareWellResourceView();
	}

	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException {
		if(languageType == LanguageType.GERMAN) {
			fareWellResourceView.showViewGer();
			System.exit(0);
		}else if(languageType == LanguageType.ENGLISH) {
			fareWellResourceView.showViewEng();
			System.exit(0);
		}
		
		return resourceService;
	}

}
