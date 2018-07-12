package model;

import de.leuphana.swa.resourceService.resource.Resource;

public class BookingBuilderGerman implements BookingBuilder{

	Booking booking;
	BookingHeader header;
	BookingBody body;
	BookingFooter footer;
	
	public BookingBuilderGerman() {
		booking = new Booking();
		setHeader("");
		setBody(null);
		setFooter(0);
    }

	@Override
	public Booking build() {
		Booking returnedBooking = this.booking;
		return returnedBooking;
	}

	@Override
	public BookingBuilder setHeader(String name) {
			header = new BookingHeaderGerman(name);
			booking.setHeader(header);
			return this;
	}

	@Override
	public BookingBuilder setBody(Resource car) {
			body = new BookingBodyGerman(car);
			booking.setBody(body);
			return this;
	}

	@Override
	public BookingBuilder setFooter(float cost) {
			footer = new BookingFooterGerman(cost);
			booking.setFooter(footer);
			return this;
	}
}