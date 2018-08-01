package model;

import model.resource.Resource;

public class BookingService {
	
	float cost;
	LanguageType language;
	Booking booking;
	String name;
	Resource car;
	
	public void createBooking(Resource car, LanguageType language, String name){

		this.car = car;
		this.cost = car.getPrice().floatValue();
		this.language = language;
		this.name = name;
		
		if (language == LanguageType.GERMAN) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LanguageType getLanguage() {
		return language;
	}

	public void setLanguage(LanguageType language) {
		this.language = language;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	public Resource getCar() {
		return this.car;
	}

	
}
