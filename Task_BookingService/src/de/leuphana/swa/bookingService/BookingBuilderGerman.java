package de.leuphana.swa.bookingService;

public class BookingBuilderGerman implements BookingBuilder{

	Booking booking;
	BookingHeader header;
	BookingBody body;
	BookingFooter footer;
	
	public BookingBuilderGerman() {
		booking = new Booking();
		setHeader();
		setBody("nichts");
		setFooter(0);
    }

	@Override
	public Booking build() {
		Booking returnedBooking = this.booking;
		return returnedBooking;
	}

	@Override
	public BookingBuilder setHeader() {
			header = new BookingHeaderGerman();
			booking.setHeader(header);
			return this;
	}

	@Override
	public BookingBuilder setBody(String car) {
			body = new BookingBodyGerman(car);
			booking.setBody(body);
			return this;
	}

	@Override
	public BookingBuilder setFooter(int cost) {
			footer = new BookingFooterGerman(cost);
			booking.setFooter(footer);
			return this;
	}
}