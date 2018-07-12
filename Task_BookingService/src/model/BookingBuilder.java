package model;

import de.leuphana.swa.resourceService.resource.Resource;

public interface BookingBuilder {
		
	Booking build();
	
	BookingBuilder setHeader(String name);
	BookingBuilder setBody(Resource car);
	BookingBuilder setFooter(float cost);
	
}
