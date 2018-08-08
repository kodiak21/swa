package model;

public class BookingBodyGerman extends BookingBody {
	
	CarBrandType carBrandType;

	public BookingBodyGerman (CarBrandType carBrandType) {
		this.carBrandType = carBrandType;
	}
	
	public CarBrandType printBody () {
		return carBrandType;
	}
}
