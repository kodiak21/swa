package de.leuphana.swa.bookingService;

public class Client {

	public static void main(String[] args) {
		
		BookingBuilderGerman builderG = new BookingBuilderGerman();
		BookingBuilderEnglish builderE = new BookingBuilderEnglish();
		
		String car = "Mercedes";
		int cost = 1000;
		
		Booking bookingG = builderG	.setHeader()
									.setBody(car)
									.setFooter(cost)
									.build();
		Booking bookingE = builderE	.setHeader()
									.setBody(car)
									.setFooter(cost)
									.build();
		Booking bookingG2 = builderG.build();
		Booking bookingE2 = builderE.build();
		System.out.println(bookingG);
		System.out.println("");
		System.out.println(bookingE);
		System.out.println("");
		System.out.println(bookingG2);
		System.out.println("");
		System.out.println(bookingE2);
	}

}
