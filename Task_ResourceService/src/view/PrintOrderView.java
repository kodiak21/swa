package view;

import java.math.BigDecimal;

import model.CarBrandType;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class PrintOrderView {

	public void showGer(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice,
			int numberTopBox, int numberChildSeats, CarBrandType carBrandType) {
		System.out.println("\t**********************************");
		System.out.println("\tIhre Bestellung:");
		if (resource != null) {
			System.out.println("\tAuto der Marke: " + carBrandType);
			if (topBox != null) {
				System.out.print("\t");
				topBox.getSelectedResourceGer(resource, numberChildSeats);
				if (childSeat != null) {
					System.out.print("\t");
					childSeat.getSelectedResourceGer(resource, numberChildSeats);
					System.out.println("\tZu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("\tZu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice())));
				}
			} else if (topBox == null) {
				if (childSeat != null) {
					System.out.print("\t");
					childSeat.getSelectedResourceGer(resource, numberChildSeats);
					System.out.println("\tZu zahlender Betrag: " + (resource.getPrice().add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("\tZu zahlender Betrag: " + (resource.getPrice()));
				}
			}
		} 
		System.out.println("\t**********************************");
		System.out.println("");
		
	}

	public void showEng(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice,
			int numberTopBox, int numberChildSeats, CarBrandType carBrandType) {
		System.out.println("\t**********************************");
		System.out.println("\tYour Order:");
		if (resource != null) {
			System.out.println("\tCar with CarBrand: " + carBrandType);
			if (topBox != null) {
				System.out.print("\t");
				topBox.getSelectedResourceEng(resource, numberChildSeats);
				if (childSeat != null) {
					System.out.print("\t");
					childSeat.getSelectedResourceEng(resource, numberChildSeats);
					System.out.println("\tTotal costs: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("\tTotal costs: " + (resource.getPrice().add(topBox.getPrice())));
				}
			} else if (topBox == null) {
				if (childSeat != null) {
					System.out.print("\t");
					childSeat.getSelectedResourceEng(resource, numberChildSeats);
					System.out.println("\tTotal costs: " + (resource.getPrice().add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("\tTotal costs: " + (resource.getPrice()));
				}
			}
		} 
		System.out.println("\t**********************************");
		System.out.println("");
	}

}
