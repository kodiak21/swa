package de.leuphana.swa.resourceService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.ResourceCommand;
import de.leuphana.swa.resourceService.view.ResourceView;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class AskCarOrderCommand implements ResourceCommand {

	private ResourceView resourceView;
	
	public AskCarOrderCommand(final ResourceView resourceView) {
		this.resourceView = resourceView;
	}

	@Override
	public void voidExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int intExecute() throws IllegalArgumentException, IOException {
		int i = resourceView.askCarOrder();
		return i;
	}

	@Override
	public String stringExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
