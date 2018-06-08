package de.leuphana.swa.bookingService;

public class Client {

	//BookingService nach Builder Pattern
	
	private BookingBuilder builder;

	public Client(final BookingBuilder builder) {
		this.builder = builder;
	}

	public Booking construct() {
        return builder.setHeader(BookingType.ENGLISH)
                      .setBody(BookingType.ENGLISH)
                      .setFooter(BookingType.ENGLISH)
                      .build();
    }

	
	public static void main(String[] args) {
		
		final BookingBuilder builder = new BookingBuilder();

        final Client bookingBuilder = new Client(builder);

        System.out.println(bookingBuilder.construct());
	}

}
