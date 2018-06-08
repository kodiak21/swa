package de.leuphana.swa.bookingService;

public class BookingBuilder implements Builder{

	private Booking booking;
	
	
	
	public BookingBuilder() {
        booking = new Booking();
    }

	
	@Override
	public Booking build() {
		return booking;
	}

	@Override
	public BookingBuilder setHeader(BookingType bookingType) {
		
		switch(bookingType) {
		case GERMAN:
			booking.setHeader("Guten Tag, Herr Slotos");
			break;
		case ENGLISH:
			booking.setHeader("Dear Mr. Slotos");
			break;
		}
		
		return this;
		
	}

	@Override
	public BookingBuilder setBody(BookingType bookingType) {
		
		switch(bookingType) {
		case GERMAN:
			booking.setBody("Sie haben das folgende Auto "
					+ "mit folgender Ausstattung bestellt: ");
			break;
		case ENGLISH:
			booking.setBody("You ordered the following car with the according equiment: ");
			break;
		}
		
		return this;
	}

	@Override
	public Builder setFooter(BookingType bookingType) {
		
		switch(bookingType) {
		case GERMAN:
			booking.setFooter("Ihre Bestellung kostet: ");
			break;
		case ENGLISH:
			booking.setFooter("Total costs are: ");
			break;
		}
		
		return this;
	}

	
}
