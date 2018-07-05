package de.leuphana.swa.resourceService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.realisations.AskCarBrandCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskCarOrderCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskChildSeatOrderCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskNumberChildSeatCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskTopBoxOrderCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.PrintMenuCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.PrintOrderCommand;
import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Car;
import de.leuphana.swa.resourceService.resource.Resource;
import de.leuphana.swa.resourceService.view.ResourceView;

public class ResourceCommandController {

	// Controller mit Command Pattern

	public static void main(final String[] args) throws IllegalArgumentException, IOException {

		Resource resource = new Car();
		resource.setPrice(400);

		TopBox topbox = new TopBox(resource);
		topbox.setPrice(resource.getPrice() + 120);

		ChildSeat childSeat = new ChildSeat(resource);
		childSeat.setPrice(resource.getPrice() + 50);	
		
		final ResourceView rv = new ResourceView();
		
		int max = 0;
		String name = null;

		final ResourceCommand printMenu = new PrintMenuCommand(rv, resource, topbox, childSeat);
		final ResourceCommand askCarOrder = new AskCarOrderCommand(rv);
		final ResourceCommand askCarBrand = new AskCarBrandCommand(rv);
		final ResourceCommand askTopBoxOrder = new AskTopBoxOrderCommand(rv);
		final ResourceCommand askChildSeatOrder = new AskChildSeatOrderCommand(rv);
		final ResourceCommand askNumberChildSeat = new AskNumberChildSeatCommand(rv);
		
		ResourceCommand printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, max, name);
		
		final OrderResource or = new OrderResource();

		or.storeAndVoidExecute(printMenu);

		int i = or.storeAndIntExecute(askCarOrder);

		if (i == 1) {
			name = or.storeAndStringExecute(askCarBrand);

			int j = or.storeAndIntExecute(askTopBoxOrder);

			if (j == 1) {
				
				int k = or.storeAndIntExecute(askChildSeatOrder);
				
				if (k == 1) {
					
					max = or.storeAndIntExecute(askNumberChildSeat);

					double childSeatTotal = 0;

					childSeat = new ChildSeat(resource);

					childSeat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeat.getPrice();
					}

					childSeat.setPrice(childSeatTotal);
					
					System.out.println(name);
					
					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, max, name);
					
					or.storeAndVoidExecute(printOrder);
					
				} else if (k == 2) {

					childSeat = null;

					max = 0;
					
					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, max, name);
					
					or.storeAndVoidExecute(printOrder);
				}
			} else if (j == 2) {
				topbox = null;

				int k = or.storeAndIntExecute(askChildSeatOrder);

				if (k == 1) {
					max = or.storeAndIntExecute(askNumberChildSeat);

					double childSeatTotal = 0;

					childSeat = new ChildSeat(resource);

					childSeat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeat.getPrice();
					}

					childSeat.setPrice(childSeatTotal);
					
					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, max, name);
					
					or.storeAndVoidExecute(printOrder);

				} else if (k == 2) {

					childSeat = null;

					max = 0;
					
					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, max, name);
					
					or.storeAndVoidExecute(printOrder);
				}

			}

		} else if(i==2){
			resource = null;

			topbox = null;

			childSeat = null;

			max = 0;

			name = null;
			
			printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, max, name);

			or.storeAndVoidExecute(printOrder);
		}

	}
}
