package model;

import de.leuphana.swa.resourceService.resource.Resource;

public class BookingService {
	
	float cost;
	Languages language;
	Booking booking;
	
	//TODO Hard Coded
	String name = "Mustermann";
	
	public void createBooking(Resource car, Languages language){

		this.cost = car.getPrice();
		this.language = language;
		
		if (language == Languages.GERMAN) {
			BookingBuilderGerman builderG = new BookingBuilderGerman();
			booking = builderG	.setHeader(name)
								.setBody(car)
								.setFooter(cost)
								.build();
		} else {
			BookingBuilderEnglish builderE = new BookingBuilderEnglish();
			booking = builderE	.setHeader(name)
								.setBody(car)
								.setFooter(cost)
								.build();
		}
	}

	public Booking printBooking() {
		return this.booking;
	}
	
	public void deleteBooking() {
		this.booking = null;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Languages getLanguage() {
		return language;
	}

	public void setLanguage(Languages language) {
		this.language = language;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
