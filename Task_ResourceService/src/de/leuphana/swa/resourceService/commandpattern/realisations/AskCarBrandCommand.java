package de.leuphana.swa.resourceService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.ResourceCommand;
import de.leuphana.swa.resourceService.view.ResourceView;

public class AskCarBrandCommand implements ResourceCommand{

	private ResourceView resourceView;

	public AskCarBrandCommand(final ResourceView resourceView) {
		this.resourceView = resourceView;
	}
	
	@Override
	public void voidExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int intExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String stringExecute() throws IllegalArgumentException, IOException {
		String name = resourceView.askCarBrand();
		return name;
	}

}
