package model;

public class BookingBodyEnglish extends BookingBody {
	
	CarBrandType carBrandType;

	public BookingBodyEnglish (CarBrandType carBrandType ) {
		this.carBrandType = carBrandType;
	}
	
	public CarBrandType printBody () {
		return carBrandType;
	}
}
