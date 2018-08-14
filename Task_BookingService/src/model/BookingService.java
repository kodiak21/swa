package model;

import java.math.BigDecimal;

public class BookingService {
	
	BigDecimal cost;
	LanguageType languageType;
	Booking booking;
	String name;
	CarBrandType carBrandType;
	int deleteAnswer;
	
	public void createBooking(BigDecimal cost, LanguageType languageType, String name, CarBrandType carBrandType){

		this.cost = cost;
		this.languageType = languageType;
		this.name = name;
		this.carBrandType = carBrandType;
		
		if (languageType == LanguageType.GERMAN) {
			BookingBuilderGerman builderG = new BookingBuilderGerman();
			booking = builderG	.setHeader(name)
								.setBody(carBrandType)
								.setFooter(cost)
								.build();
		} else {
			BookingBuilderEnglish builderE = new BookingBuilderEnglish();
			booking = builderE	.setHeader(name)
								.setBody(carBrandType)
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

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LanguageType getLanguageType() {
		return languageType;
	}

	public void setLanguage(LanguageType language) {
		this.languageType = language;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	public CarBrandType getCarBrandType() {
		return carBrandType;
	}
	
	public void setCarBrandType(CarBrandType carBrandType) {
		this.carBrandType = carBrandType;
	}

	public int getDeleteAnswer() {
		return deleteAnswer;
	}
	
	public void setDeleteAnswer(int deleteAnswer) {
		this.deleteAnswer = deleteAnswer;
	}
	
}
