package model;

import java.math.BigDecimal;

public class BookingBuilderEnglish implements BookingBuilder{

	Booking booking;
	BookingHeader header;
	BookingBody body;
	BookingFooter footer;
	
	public BookingBuilderEnglish() {
		booking = new Booking();
		setHeader("");
		setBody();
		setFooter(new BigDecimal("0"));
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
	public BookingBuilder setBody() {
			body = new BookingBodyEnglish();
			booking.setBody(body);
			return this;
	}

	@Override
	public BookingBuilder setFooter(BigDecimal cost) {
			footer = new BookingFooterEnglish(cost);
			booking.setFooter(footer);
			return this;
	}
}