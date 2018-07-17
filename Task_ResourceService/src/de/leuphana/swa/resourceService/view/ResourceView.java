package de.leuphana.swa.resourceService.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class ResourceView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void printMenu(Resource resource, TopBox topbox, ChildSeat childseat, double resourcePrice, double topboxPrice, double childSeatPrice) {
		System.out.println("Prices:");
		System.out.println("Car: " + resourcePrice);
		System.out.println("additional TopBox: " + topboxPrice);
		System.out.println("additional ChildSeat: " + childSeatPrice);
	}

	public int askCarOrder() throws IllegalArgumentException, IOException {

		int j = 0;

		while (j != 1 && j != 2) {
			try {
				System.out.println("Do you want to order a car ?");
				System.out.println("1: yes");
				System.out.println("2: no");
				try {
					j = Integer.parseInt(br.readLine());
				}catch(IOException e) {
					e = new IOException("Wrong Number, try again !");
					System.out.println(e.getMessage());
				}
			} catch (IllegalArgumentException e) {
				e = new IllegalArgumentException("Wrong Input, try again !");
				System.out.println(e.getMessage());
			}
		}

		return j;

	}
	
	public String askCarBrand() throws IOException {
		
		System.out.println("Which car Brand ?");
		
		String name = br.readLine();
		
		return name;
	}
	
	public int askTopBoxOrder() throws IOException {

		int i = 0;

		while (i != 1 && i != 2) {
			try {
				System.out.println("Do you want to order an additional TopBox ?");
				System.out.println("1: yes");
				System.out.println("2: no");

				i = Integer.parseInt(br.readLine());

			} catch (IllegalArgumentException e) {
				e = new IllegalArgumentException("Wrong Input, try again");
				System.out.println(e.getMessage());
			}
		}

		if(i==1) {
			askNumberTopBox();
		}

		return i;
	}

	// Begrenzung auf einen Dachgepächträger pro Auto
	// TODO geh�rt in den Controller, nicht view

	public void askNumberTopBox() throws IOException {
		System.out.println("How many TopBoxes needed ?");

		int i = 0;

		while (i != 1) {
			try {
				System.out.println("Only 1 TopBox for a car allowed!");
				System.out.println("How many TopBoxes needed ?");

				i = Integer.parseInt(br.readLine());
			}catch(IllegalArgumentException e) {
				e = new IllegalArgumentException("Wrong Input, try again");
				System.out.println(e.getMessage());
			}
		}
	}

	public int askChildSeatOrder() throws IOException {

		int i = 0;

		while(i!=1 && i!=2)
		try {
			System.out.println("ChildSeat(s) needed ?");
			System.out.println("1: yes");
			System.out.println("2: no");
			i = Integer.parseInt(br.readLine());
		} catch (IllegalArgumentException e) {
			e = new IllegalArgumentException("Wrong Input, try again");
			System.out.println(e.getMessage());
		}
		
		return i;

	}

	public int askNumberChildSeat() throws NumberFormatException, IOException {
		

		int max = 0;

		try {
			System.out.println("How many ChildSeat(s) are needed ?");
			max = Integer.parseInt(br.readLine());

		} catch (IllegalArgumentException e) {
			e = new IllegalArgumentException("Wrong Input, try again");
			System.out.println(e.getMessage());
		}

		return max;
	}

	public void printOrder(Resource resource, TopBox topbox, ChildSeat childSeat, double childSeatPrice, int max, String name) {
		if (resource != null && topbox != null && childSeat != null) {

			System.out.println("Your Order:");
			resource.getSelectedResource();
			System.out.println("Car Brand: " + name);
			System.out.print(1);
			topbox.getSelectedResource();
			System.out.print(max);
			childSeat.getSelectedResource();
			System.out.println("Cost: " + (resource.getPrice() + topbox.getPrice() + childSeatPrice));

		} else if (resource != null && topbox == null && childSeat != null) {

			System.out.println("Your Order:");
			resource.getSelectedResource();
			System.out.println("Car Brand: " + name);
			System.out.print(max);
			childSeat.getSelectedResource();

			System.out.println("Cost: " + (resource.getPrice() + childSeatPrice));
		} else if (resource != null && topbox != null && childSeat == null) {

			System.out.println("Your Order:");
			resource.getSelectedResource();
			System.out.println("Car Brand: " + name);
			System.out.print(1);
			topbox.getSelectedResource();

			System.out.println("Cost: " + (resource.getPrice() + topbox.getPrice()));
		} else if (resource != null && topbox == null && childSeat == null) {
			System.out.println("Your Order:");
			resource.getSelectedResource();
			System.out.println("Car Brand: " + name);
			System.out.println("Cost: " + resource.getPrice());
		} else if (resource == null && topbox == null && childSeat == null) {
			System.out.println("Your Order:");
			System.out.println("No car ordered !");
		}
	}

	public void setResourcePrice(Resource resource, TopBox topbox, ChildSeat childseat, float resourcePrice, float topBoxPrice, float childSeatPrice) {
		resource.setPrice(resourcePrice);
		topbox.setPrice(topBoxPrice);
		childseat.setPrice(childSeatPrice);
	}

}
