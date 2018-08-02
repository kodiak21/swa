package view;

import java.math.BigDecimal;

import model.CarBrandType;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class PrintOrderView {

	public void showGer(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice, int numberTopBox, int numberChildSeats, CarBrandType carBrandType) {
		
		System.out.println("Ihre Bestellung:");
		if(resource !=null && topBox!=null && childSeat != null) {
			System.out.println("Auto der Marke: " + carBrandType);
			topBox.getSelectedResourceGer(resource, numberChildSeats);
			childSeat.getSelectedResourceGer(resource, numberChildSeats);
			System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
		}else if(resource !=null && topBox!=null && childSeat == null) {
			System.out.println("Auto der Marke: " + carBrandType);
			topBox.getSelectedResourceGer(resource, numberChildSeats);
			System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(topBox.getPrice())));
		}else if(resource !=null && topBox==null && childSeat != null) {
			System.out.println("Auto der Marke: " + carBrandType);
			childSeat.getSelectedResourceGer(resource, numberChildSeats);
			System.out.println("Zu zahlender Betrag: " + (resource.getPrice().add(childSeatPrice)));
		}else if(resource !=null && topBox==null && childSeat == null){
			System.out.println("Auto der Marke: " + carBrandType);
			System.out.println("Zu zahlender Betrag: " + (resource.getPrice()));
		}else if(resource ==null && topBox==null && childSeat == null) {
			System.out.println("keine Bestellung aufgenommen !");
		}
		
	}

	public void showEng(Resource resource, TopBox topBox, ChildSeat childSeat, BigDecimal childSeatPrice,
			int numberTopBox, int numberChildSeats, CarBrandType carBrandType) {
		System.out.println("Your Order:");
		if (resource != null && topBox != null && childSeat != null) {
			System.out.println("Car with BrandName: " + carBrandType);
			topBox.getSelectedResourceEng(resource, numberChildSeats);
			childSeat.getSelectedResourceEng(resource, numberChildSeats);
			System.out.println("Total costs: " + (resource.getPrice().add(topBox.getPrice()).add(childSeatPrice)));
		} else if (resource != null && topBox != null && childSeat == null) {
			System.out.println("Car with BrandName: " + carBrandType);
			topBox.getSelectedResourceEng(resource, numberChildSeats);
			System.out.println("Total costs: " + (resource.getPrice().add(topBox.getPrice())));
		} else if (resource != null && topBox == null && childSeat != null) {
			System.out.println("Car with BrandName: " + carBrandType);
			childSeat.getSelectedResourceEng(resource, numberChildSeats);
			System.out.println("Total costs: " + (resource.getPrice().add(childSeatPrice)));
		} else if (resource != null && topBox == null && childSeat == null) {
			System.out.println("Car with BrandName: " + carBrandType);
			System.out.println("Total costs: " + (resource.getPrice()));
		} else if (resource == null && topBox == null && childSeat == null) {
			System.out.println("No Car ordered !");
		}

	}

}
