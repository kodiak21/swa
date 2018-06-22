package de.leuphana.swa.bookingService;

public class BookingBuilderEnglish implements BookingBuilder{

	Booking booking;
	BookingHeader header;
	BookingBody body;
	BookingFooter footer;
	
	public BookingBuilderEnglish() {
		booking = new Booking();
		setHeader();
		setBody("nothing");
		setFooter(0);
    }

	@Override
	public Booking build() {
		Booking returnedBooking = this.booking;
		return returnedBooking;
	}

	@Override
	public BookingBuilder setHeader() {
			header = new BookingHeaderEnglish();
			booking.setHeader(header);
			return this;
	}

	@Override
	public BookingBuilder setBody(String car) {
			body = new BookingBodyEnglish(car);
			booking.setBody(body);
			return this;
	}

	@Override
	public BookingBuilder setFooter(int cost) {
			footer = new BookingFooterEnglish(cost);
			booking.setFooter(footer);
			return this;
	}
}