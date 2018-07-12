package model;

import de.leuphana.swa.resourceService.resource.Resource;

public class BookingBodyEnglish extends BookingBody {
	
	Resource car;
	
	public BookingBodyEnglish (Resource car) {
		this.car = car;
	}
	
	public String printBody () {
		return car.toString();
	}
}
