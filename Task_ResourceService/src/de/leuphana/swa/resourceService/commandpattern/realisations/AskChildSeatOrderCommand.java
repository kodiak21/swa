package de.leuphana.swa.resourceService.commandpattern.realisations;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.ResourceCommand;
import de.leuphana.swa.resourceService.view.ResourceView;

public class AskChildSeatOrderCommand implements ResourceCommand {

	private ResourceView resourceView;

	public AskChildSeatOrderCommand(final ResourceView resourceView) {
		this.resourceView = resourceView;
	}

	@Override
	public void voidExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int intExecute() throws IllegalArgumentException, IOException {
		int k = resourceView.askChildSeatOrder();
		return k;
	}

	@Override
	public String stringExecute() throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
