package de.leuphana.swa.resourceService.controller;

import java.io.IOException;

import de.leuphana.swa.resourceService.view.ResourceView;
import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Car;
import de.leuphana.swa.resourceService.resource.Resource;

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

		TopBox topbox = new TopBox(resource);
		topbox.setPrice(topBoxPrice);

		ChildSeat childseat = new ChildSeat(resource);
		childseat.setPrice(childSeatPrice);
		
		resourceView.printMenu(resource, topbox, childseat, resourcePrice, topBoxPrice, childSeatPrice);
		
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

					childseat = new ChildSeat(resource);

					childseat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childseat.getPrice();
					}

					childseat.setPrice(childSeatTotal);

					resourceView.printOrder(resource, topbox, childseat, childSeatTotal, max, name);
				} else if (k == 2) {

					childseat = null;

					int max = 0;

					resourceView.printOrder(resource, topbox, childseat, 0, max, name);
				}

			} else if (j == 2) {

				topbox = null;

				int k = resourceView.askChildSeatOrder();

				if (k == 1) {
					int max = resourceView.askNumberChildSeat();

					float childSeatTotal = 0;

					childseat = new ChildSeat(resource);

					childseat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childseat.getPrice();
					}

					childseat.setPrice(childSeatTotal);

					resourceView.printOrder(resource, topbox, childseat, 0, max, name);
				} else if (k == 2) {

					topbox = null;

					childseat = null;

					int max = 0;

					resourceView.printOrder(resource, topbox, childseat, 0, max, name);
				}

			}
		} else {

			resource = null;

			topbox = null;

			childseat = null;

			int max = 0;
			
			String name = null;

			resourceView.printOrder(resource, topbox, childseat, 0, max, name);

		}

	}
}
