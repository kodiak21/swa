package de.leuphana.swa.resourceService.commandpattern;

import java.io.IOException;

import de.leuphana.swa.resourceService.commandpattern.realisations.AskCarBrandCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskCarOrderCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskChildSeatOrderCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskNumberChildSeatCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.AskTopBoxOrderCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.PrintMenuCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.PrintOrderCommand;
import de.leuphana.swa.resourceService.commandpattern.realisations.SetPriceCommand;

import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Car;
import de.leuphana.swa.resourceService.resource.Resource;
import de.leuphana.swa.resourceService.view.ResourceView;

public class ResourceCommandController {

	// Controller mit Command Pattern

	static double resourcePrice = 500;
	static double topBoxPrice = 120;
	static double childSeatPrice = 50;

	public static void main(final String[] args) throws IllegalArgumentException, IOException {

		final ResourceView rv = new ResourceView();

		final OrderResource or = new OrderResource();

		Resource resource = new Car();
		TopBox topbox = new TopBox(resource);
		ChildSeat childSeat = new ChildSeat(resource);
		
		final ResourceCommand setPrice = new SetPriceCommand(rv, resource, topbox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);

		or.storeAndVoidExecute(setPrice);

		int max = 0;
		String name = null;
		
		double childSeatTotal = 0;

		final ResourceCommand printMenu = new PrintMenuCommand(rv, resource, topbox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);
		final ResourceCommand askCarOrder = new AskCarOrderCommand(rv);
		final ResourceCommand askCarBrand = new AskCarBrandCommand(rv);
		final ResourceCommand askTopBoxOrder = new AskTopBoxOrderCommand(rv);
		final ResourceCommand askChildSeatOrder = new AskChildSeatOrderCommand(rv);
		final ResourceCommand askNumberChildSeat = new AskNumberChildSeatCommand(rv);

		ResourceCommand printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, childSeatPrice, max, name);

		or.storeAndVoidExecute(printMenu);

		int i = or.storeAndIntExecute(askCarOrder);

		if (i == 1) {
			name = or.storeAndStringExecute(askCarBrand);

			int j = or.storeAndIntExecute(askTopBoxOrder);

			if (j == 1) {

				int k = or.storeAndIntExecute(askChildSeatOrder);

				if (k == 1) {

					max = or.storeAndIntExecute(askNumberChildSeat);
					
					childSeat = new ChildSeat(resource);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeatPrice;
					}
					
					childSeatPrice = childSeatTotal;
					
					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, childSeatPrice, max, name);

					or.storeAndVoidExecute(printOrder);

				} else if (k == 2) {

					childSeat = null;

					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, childSeatPrice, max, name);

					or.storeAndVoidExecute(printOrder);
				}
			} else if (j == 2) {
				topbox = null;

				int k = or.storeAndIntExecute(askChildSeatOrder);

				if (k == 1) {
					max = or.storeAndIntExecute(askNumberChildSeat);
					
					childSeat = new ChildSeat(resource);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeatPrice;
					}
					
					childSeatPrice = childSeatTotal;
					
					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, childSeatPrice, max, name);

					or.storeAndVoidExecute(printOrder);

				} else if (k == 2) {

					childSeat = null;

					printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, childSeatPrice, max, name);

					or.storeAndVoidExecute(printOrder);
				}

			}

		} else if (i == 2) {
			resource = null;

			topbox = null;

			childSeat = null;

			printOrder = new PrintOrderCommand(rv, resource, topbox, childSeat, childSeatPrice, max, name);

			or.storeAndVoidExecute(printOrder);
		}

	}
}
