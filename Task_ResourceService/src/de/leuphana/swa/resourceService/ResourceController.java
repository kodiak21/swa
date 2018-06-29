package de.leuphana.swa.resourceService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Car;
import de.leuphana.swa.resourceService.resource.Resource;
import de.leuphana.swa.resourceService.resourceView.ResourceView;

public class ResourceController {

	// ResourceService nach Decorator Pattern

	private static ResourceView resourceView = new ResourceView();
	private static String carBrand;

	public static void main(String[] args) throws IOException {

		// Festsetzen Preise
		
		Resource resource = new Car();
		resource.setPrice(400);

		TopBox topbox = new TopBox(resource);
		topbox.setPrice(resource.getPrice() + 120);

		ChildSeat childseat = new ChildSeat(resource);
		childseat.setPrice(resource.getPrice() + 50);
		
		resourceView.printMenu(resource, topbox, childseat);
		
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

					double childSeatTotal = 0;

					childseat = new ChildSeat(resource);

					childseat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childseat.getPrice();
					}

					childseat.setPrice(childSeatTotal);

					resourceView.printOrder(resource, topbox, childseat, max, name);
				} else if (k == 2) {

					childseat = null;

					int max = 0;

					resourceView.printOrder(resource, topbox, childseat, max, name);
				}

			} else if (j == 2) {

				topbox = null;

				int k = resourceView.askChildSeatOrder();

				if (k == 1) {
					int max = resourceView.askNumberChildSeat();

					double childSeatTotal = 0;

					childseat = new ChildSeat(resource);

					childseat.setPrice(50);

					for (int count = 1; count <= max; count++) {
						childSeatTotal += childseat.getPrice();
					}

					childseat.setPrice(childSeatTotal);

					resourceView.printOrder(resource, topbox, childseat, max, name);
				} else if (k == 2) {

					topbox = null;

					childseat = null;

					int max = 0;

					resourceView.printOrder(resource, topbox, childseat, max, name);
				}

			}
		} else {

			resource = null;

			topbox = null;

			childseat = null;

			int max = 0;
			
			String name = null;

			resourceView.printOrder(resource, topbox, childseat, max, name);

		}

	}
}
