package view;

import java.math.BigDecimal;

import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class PrintOrderView {

	public void showGer(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice, int numberTopBox, int numberChildSeats, String carName) {
		System.out.println("Ihre Bestellung:");
		if(resource !=null && topBox!=null && childSeat != null) {
			System.out.println("Auto der Marke: " + carName);
			topBox.getSelectedResourceGer(resource, numberChildSeats);
			childSeat.getSelectedResourceGer(resource, numberChildSeats);
			System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
		}else if(resource !=null && topBox!=null && childSeat == null) {
			System.out.println("Auto der Marke: " + carName);
			topBox.getSelectedResourceGer(resource, numberChildSeats);
			System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice())));
		}else if(resource !=null && topBox==null && childSeat != null) {
			System.out.println("Auto der Marke: " + carName);
			childSeat.getSelectedResourceGer(resource, numberChildSeats);
			System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(childSeatPrice)));
		}else if(resource ==null && topBox==null && childSeat == null) {
			System.out.println("keine Bestellung aufgenommen !");
		}
		
	}

	public void showEng(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice,
			int numberTopBox, int numberChildSeats, String carName) {
		System.out.println("Your Order:");
		if (resource != null && topBox != null && childSeat != null) {
			System.out.println("Car with BrandName: " + carName);
			topBox.getSelectedResourceEng(resource, numberChildSeats);
			childSeat.getSelectedResourceEng(resource, numberChildSeats);
			System.out.println("Total costs: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
		} else if (resource != null && topBox != null && childSeat == null) {
			System.out.println("Car with BrandName: " + carName);
			topBox.getSelectedResourceEng(resource, numberChildSeats);
			System.out.println("Total costs: " + (resource.getPrice().add(topBox.getPrice())));
		} else if (resource != null && topBox == null && childSeat != null) {
			System.out.println("Car with BrandName: " + carName);
			childSeat.getSelectedResourceEng(resource, numberChildSeats);
			System.out.println("Total costs: " + (resource.getPrice().add(childSeatPrice)));
		} else if (resource == null && topBox == null && childSeat == null) {
			System.out.println("No Car ordered !");
		}

	}

}
