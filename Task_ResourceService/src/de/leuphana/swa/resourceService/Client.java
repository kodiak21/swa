package de.leuphana.swa.resourceService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.TopBox;
import de.leuphana.swa.resourceService.resource.Car;
import de.leuphana.swa.resourceService.resource.Resource;

public class Client {

	// ResourceService nach Decorator Pattern

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Resource resource = new Car();

		System.out.println("Prices:");
		System.out.println("Car: 400");
		System.out.println("additional TopBox: 120");
		System.out.println("additional ChildSeat: 50");

		System.out.println("Do you want to order a car ?");
		System.out.println("1: yes");
		System.out.println("2: no");

		int i = Integer.parseInt(br.readLine());

		//Bestellung Auto
		
		switch (i) {
		case 1:
			break;
		case 2:
			System.out.println("No car ordered !");
			return;
		default:
			break;
		}
		
		//Bestellung Dachgepaecktraeger

		System.out.println("Top Box needed ?");
		System.out.println("1: yes");
		System.out.println("2: no");

		i = Integer.parseInt(br.readLine());

		switch (i) {
		case 1:

			System.out.println("How many TopBoxes needed ?");
			int j = Integer.parseInt(br.readLine());

			//Begrenzung Dachgepaecktraeger auf 1 pro Auto
			
			while (j != 1) {
				System.out.println("Only 1 TopBox for a car allowed!");
				System.out.println("How many TopBoxes needed ?");
				j = Integer.parseInt(br.readLine());
			}

			if (j == 1) {

				//Hinzufuegen Dachgepaecktaeger zu Auto
				
				resource = new TopBox(resource);

				//Abfrage Kindersitze
				
				System.out.println("ChildSeat(s) needed ?");
				System.out.println("1: yes");
				System.out.println("2: no");

				int k = Integer.parseInt(br.readLine());

				switch (k) {
				case 1:
					
					//Anzahl Kindersitze
					
					System.out.println("How many ChildSeat(s) are needed ?");
					int max = Integer.parseInt(br.readLine());

					for (int count = 1; count <= max; count++) {
						resource = new ChildSeat(resource);
					}

					//Ausdruck Order
					
					System.out.println("Your Order: ");
					resource.getSelectedResource();
					System.out.println("Total Costs: " + resource.getPrice() + " Euro ");

					//Abfrage ob Order korrekt ist
					
					System.out.println("Is Order correct?");
					System.out.println("1: Yes");
					System.out.println("2: No");

					Integer input = Integer.parseInt(br.readLine());
					
					
					if (input == 2) {
					
						//Soll Dachgepaecktraeger entfernt werden aus Order
						
						System.out.println("Should TopBox be removed ?");
						System.out.println("1: Yes");
						System.out.println("2: No");

						Integer in = Integer.parseInt(br.readLine());
						
						//Zusammenbau Auto nur mit Kindersitzen
						
						if (in == 1) {

							resource = new Car();

							for (int count = 1; count <= max; count++) {
								resource = new ChildSeat(resource);
							}

						} else if (in == 2) {
							
							//Abfrage Anzahl Kindersitze
							
							System.out.println("Should Number of Childseats be changed ?(" + max + " at the moment");
							System.out.println("1: Yes");
							System.out.println("2: No");

							input = Integer.parseInt(br.readLine());

							if (input == 1) {
								System.out.println("How many ChildSeats ");

								int anz = Integer.parseInt(br.readLine());

								resource = new TopBox(new Car());

								for (int count = 1; count <= anz; count++) {
									resource = new ChildSeat(resource);
								}

							}

						}
						
					}else if(i==1) {
						
						
						
						
					}

					break;
				case 2:
					
					
					
					break;
				default:
					break;
				}

				System.out.println("Your Order: ");
				resource.getSelectedResource();
				System.out.println("Total Costs: " + resource.getPrice() + " Euro ");
				System.out.println("Order will be send to Booking Service");
				break;

			}
			break;
		case 2:
			
			//Auto ohne Dachgepaecktraeger
			
			resource = new Car();

			//Abfrage Kindersitze
			
			System.out.println("ChildSeat(s) needed ?");
			System.out.println("1: yes");
			System.out.println("2: no");

			int k = Integer.parseInt(br.readLine());

			switch (k) {
			case 1:
				System.out.println("How many ChildSeat(s) are needed ?");
				int max = Integer.parseInt(br.readLine());

				for (int count = 1; count <= max; count++) {
					resource = new ChildSeat(resource);
				}

				System.out.println("Your Order: ");
				resource.getSelectedResource();
				System.out.println("Total Costs: " + resource.getPrice() + " Euro ");

				//ist Order korrekt
				
				System.out.println("Is Order correct?");
				System.out.println("1: Yes");
				System.out.println("2: No");

				Integer input = Integer.parseInt(br.readLine());

				if (input == 2) {
					
					//Hinzufuegen Dachgepaecktraeger
					
					System.out.println("Should TopBox be added ?");
					System.out.println("1: Yes");
					System.out.println("2: No");

					Integer in = Integer.parseInt(br.readLine());
					if (in == 1) {

						resource = new TopBox(new Car());

						System.out.println("Should Number of Childseats be changed ?(" + max + " at the moment");
						System.out.println("1: Yes");
						System.out.println("2: No");

						input = Integer.parseInt(br.readLine());

						if (input == 1) {
							System.out.println("How many ChildSeats ");

							int anz = Integer.parseInt(br.readLine());
							
							if(in==1) {
								resource = new TopBox(new Car());
								for (int count = 1; count <= anz; count++) {
									resource = new ChildSeat(resource);
								}
							}else {
								resource = new Car();
								for (int count = 1; count <= anz; count++) {
									resource = new ChildSeat(resource);
								}
							}

						}

						System.out.println("Total Costs: " + resource.getPrice() + " Euro ");
					} else if (in == 2) {
						
						//Aenderung der Kindersitzanzahl 
						
						System.out.println("Should Number of Childseats be changed ?(" + max + " at the moment");
						System.out.println("1: Yes");
						System.out.println("2: No");

						input = Integer.parseInt(br.readLine());

						if (input == 1) {
							System.out.println("How many ChildSeats ");

							int anz = Integer.parseInt(br.readLine());

							if(in==1) {
								resource = new TopBox(new Car());
								for (int count = 1; count <= anz; count++) {
									resource = new ChildSeat(resource);
								}
							}else {
								resource = new Car();
								for (int count = 1; count <= anz; count++) {
									resource = new ChildSeat(resource);
								}
							}
							
						}

					}
				}

				break;
			case 2:
				break;
			default:
				break;
			}

			System.out.println("Your Order: ");
			resource.getSelectedResource();
			System.out.println("Total Costs: " + resource.getPrice() + " Euro ");

			break;
		default:
			break;
		}

	}
}
