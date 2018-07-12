package model;

import de.leuphana.swa.resourceService.resource.Resource;

public class BookingBodyGerman extends BookingBody {
	
	Resource car;
	
	public BookingBodyGerman (Resource car) {
		this.car = car;
	}
	public String printBody () {
		return car.toString();
	}
}
