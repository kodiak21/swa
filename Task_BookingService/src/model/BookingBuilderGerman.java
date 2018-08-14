package model;

import java.math.BigDecimal;

public class BookingBuilderGerman implements BookingBuilder{

	Booking booking;
	BookingHeader header;
	BookingBody body;
	BookingFooter footer;
	CarBrandType carBrandType;
	
	public BookingBuilderGerman() {
		booking = new Booking();
		setHeader("");
		setBody(carBrandType);
		setFooter(new BigDecimal("0"));
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
	public BookingBuilder setBody(CarBrandType carBrandType) {
			body = new BookingBodyGerman(carBrandType);
			booking.setBody(body);
			return this;
	}

	@Override
	public BookingBuilder setFooter(BigDecimal cost) {
			footer = new BookingFooterGerman(cost);
			booking.setFooter(footer);
			return this;
	}
}