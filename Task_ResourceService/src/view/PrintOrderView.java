package view;

import java.math.BigDecimal;

import model.CarBrandType;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class PrintOrderView {

	public void showGer(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice,
			int numberTopBox, int numberChildSeats, CarBrandType carBrandType) {
		
		System.out.println("Ihre Bestellung:");
		if (resource != null) {
			System.out.println("Auto der Marke: " + carBrandType);
			if (topBox != null) {
				topBox.getSelectedResourceGer(resource, numberChildSeats);
				if (childSeat != null) {
					childSeat.getSelectedResourceGer(resource, numberChildSeats);
					System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice())));
				}
			} else if (topBox == null) {
				if (childSeat != null) {
					childSeat.getSelectedResourceGer(resource, numberChildSeats);
					System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("Zu zahlender Betrag: " + (resource.getPrice()));
				}
			}
		} 
		
	}

	public void showEng(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice,
			int numberTopBox, int numberChildSeats, CarBrandType carBrandType) {
		System.out.println("Your Order:");
		if (resource != null) {
			System.out.println("Car with CarBrand: " + carBrandType);
			if (topBox != null) {
				topBox.getSelectedResourceGer(resource, numberChildSeats);
				if (childSeat != null) {
					childSeat.getSelectedResourceGer(resource, numberChildSeats);
					System.out.println("Total costs: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("Total costs: " + (resource.getPrice().add(topBox.getPrice())));
				}
			} else if (topBox == null) {
				if (childSeat != null) {
					childSeat.getSelectedResourceGer(resource, numberChildSeats);
					System.out.println("Total costs: " + (resource.getPrice().add(childSeatPrice)));
				} else if (childSeat == null) {
					System.out.println("Total costs: " + (resource.getPrice()));
				}
			}
		} 
	}

}
