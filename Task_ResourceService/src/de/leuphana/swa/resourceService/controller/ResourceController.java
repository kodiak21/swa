package de.leuphana.swa.resourceService.controller;

import java.io.IOException;

import de.leuphana.swa.resourceService.view.ResourceView;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;

public class ResourceController {

	// ResourceService nach Decorator Pattern

	private static ResourceView resourceView = new ResourceView();

	public static void main(String[] args) throws IOException {

		// Festsetzen Preise
		
		float resourcePrice = 400;
		float topBoxPrice = 120;
		float childSeatPrice = 50;
		
		Resource resource = new Car();
		resource.setPrice(resourcePrice);

		TopBox topBox = new TopBox(resource);
		topBox.setPrice(topBoxPrice);

		ChildSeat childSeat = new ChildSeat(resource);
		childSeat.setPrice(childSeatPrice);
		
		resourceView.printMenu(resource, topBox, childSeat, resourcePrice, topBoxPrice, childSeatPrice);
		
		int i = resourceView.askCarOrder();

		// Bestellung Auto

		if (i == 1) {
			
			// Abfrage Automarke
			
			String name = resourceView.askCarBrand();
			
			// Bestellung Dachgepaecktraeger

			int j = resourceView.askTopBoxOrder();

			if (j == 1) {

				// Abfrage Kindersitze

				int k = resourceView.askChildSeatOrder();

				if (k == 1) {
					
					int max = resourceView.askNumberChildSeat();

					float childSeatTotal = 0;

					childSeat = new ChildSeat(resource);

					childSeat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeat.getPrice();
					}

					childSeat.setPrice(childSeatTotal);

					resourceView.printOrder(resource, topBox, childSeat, childSeatTotal, max, name);
				} else if (k == 2) {

					childSeat = null;

					int max = 0;

					resourceView.printOrder(resource, topBox, childSeat, 0, max, name);
				}

			} else if (j == 2) {

				topBox = null;

				int k = resourceView.askChildSeatOrder();

				if (k == 1) {
					int max = resourceView.askNumberChildSeat();

					float childSeatTotal = 0;

					childSeat = new ChildSeat(resource);

					childSeat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childSeat.getPrice();
					}

					childSeat.setPrice(childSeatTotal);

					resourceView.printOrder(resource, topBox, childSeat, 0, max, name);
				} else if (k == 2) {

					topBox = null;

					childSeat = null;

					int max = 0;

					resourceView.printOrder(resource, topBox, childSeat, 0, max, name);
				}

			}
		} else {

			resource = null;

			topBox = null;

			childSeat = null;

			int max = 0;
			
			String name = null;

			resourceView.printOrder(resource, topBox, childSeat, 0, max, name);

		}

	}
}
