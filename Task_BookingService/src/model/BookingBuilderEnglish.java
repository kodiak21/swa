package model;

import de.leuphana.swa.resourceService.resource.Resource;

public class BookingBuilderEnglish implements BookingBuilder{

	Booking booking;
	BookingHeader header;
	BookingBody body;
	BookingFooter footer;
	
	public BookingBuilderEnglish() {
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
			header = new BookingHeaderEnglish(name);
			booking.setHeader(header);
			return this;
	}

	@Override
	public BookingBuilder setBody(Resource car) {
			body = new BookingBodyEnglish(car);
			booking.setBody(body);
			return this;
	}

	@Override
	public BookingBuilder setFooter(float cost) {
			footer = new BookingFooterEnglish(cost);
			booking.setFooter(footer);
			return this;
	}
}