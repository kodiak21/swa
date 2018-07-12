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

	static float resourcePrice = 500;
	static float topBoxPrice = 120;
	static float childSeatPrice = 50;

	public static void main(final String[] args) throws IllegalArgumentException, IOException {

		final ResourceView rescourceView = new ResourceView();

		final OrderResource orderRescource = new OrderResource();

		Resource resource = new Car();
		TopBox topbox = new TopBox(resource);
		ChildSeat childSeat = new ChildSeat(resource);
		
		final ResourceCommand setPrice = new SetPriceCommand(rescourceView, resource, topbox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);

		orderRescource.storeAndVoidExecute(setPrice);

		int max = 0;
		String name = null;
		
		float childSeatTotal = 0;

		final ResourceCommand printMenu = new PrintMenuCommand(rescourceView, resource, topbox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);
		final ResourceCommand askCarOrder = new AskCarOrderCommand(rescourceView);
		final ResourceCommand askCarBrand = new AskCarBrandCommand(rescourceView);
		final ResourceCommand askTopBoxOrder = new AskTopBoxOrderCommand(rescourceView);
		final ResourceCommand askChildSeatOrder = new AskChildSeatOrderCommand(rescourceView);
		final ResourceCommand askNumberChildSeat = new AskNumberChildSeatCommand(rescourceView);

		ResourceCommand printOrder = new PrintOrderCommand(rescourceView, resource, topbox, childSeat, childSeatPrice, max, name);

		orderRescource.storeAndVoidExecute(printMenu);

		int i = orderRescource.storeAndIntExecute(askCarOrder);

		if (i == 1) {
			name = orderRescource.storeAndStringExecute(askCarBrand);

			int j = orderRescource.storeAndIntExecute(askTopBoxOrder);

			if (j == 1) {

				int k = orderRescource.storeAndIntExecute(askChildSeatOrder);

				if (k == 1) {

					max = orderRescource.storeAndIntExecute(askNumberChildSeat);
					
					childSeat = new ChildSeat(resource);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeatPrice;
					}
					
					childSeatPrice = childSeatTotal;
					
					printOrder = new PrintOrderCommand(rescourceView, resource, topbox, childSeat, childSeatPrice, max, name);

					orderRescource.storeAndVoidExecute(printOrder);

				} else if (k == 2) {

					childSeat = null;

					printOrder = new PrintOrderCommand(rescourceView, resource, topbox, childSeat, childSeatPrice, max, name);

					orderRescource.storeAndVoidExecute(printOrder);
				}
			} else if (j == 2) {
				topbox = null;

				int k = orderRescource.storeAndIntExecute(askChildSeatOrder);

				if (k == 1) {
					max = orderRescource.storeAndIntExecute(askNumberChildSeat);
					
					childSeat = new ChildSeat(resource);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeatPrice;
					}
					
					childSeatPrice = childSeatTotal;
					
					printOrder = new PrintOrderCommand(rescourceView, resource, topbox, childSeat, childSeatPrice, max, name);

					orderRescource.storeAndVoidExecute(printOrder);

				} else if (k == 2) {

					childSeat = null;

					printOrder = new PrintOrderCommand(rescourceView, resource, topbox, childSeat, childSeatPrice, max, name);

					orderRescource.storeAndVoidExecute(printOrder);
				}

			}

		} else if (i == 2) {
			resource = null;

			topbox = null;

			childSeat = null;

			printOrder = new PrintOrderCommand(rescourceView, resource, topbox, childSeat, childSeatPrice, max, name);

			orderRescource.storeAndVoidExecute(printOrder);
		}

	}
}
