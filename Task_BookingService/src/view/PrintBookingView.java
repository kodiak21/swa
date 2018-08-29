package view;

import model.Booking;
import model.BookingBodyEnglish;
import model.BookingBodyGerman;
import model.BookingFooterEnglish;
import model.BookingFooterGerman;
import model.BookingHeaderEnglish;
import model.BookingHeaderGerman;
import model.BookingService;

public class PrintBookingView {

	public PrintBookingView() {
		
	}
	public void showViewGer(BookingService bookingService) {
		Booking booking;
		booking = bookingService.getBooking();

			BookingHeaderGerman header;
			header = (BookingHeaderGerman)booking.getHeader();
			BookingBodyGerman body;
			body = (BookingBodyGerman)booking.getBody();
			BookingFooterGerman footer;
			footer = (BookingFooterGerman)booking.getFooter();
			
			System.out.println("\t**********************************");
			System.out.println("\t"+header.printHeader()+",");
			System.out.println("\tdanke, dass Sie sich fuer eines");
			System.out.println("\tunserer Autos entschieden haben.");
			System.out.println("\tWir hoffen sie geniessen");
			System.out.println("\tden Wagen der Marke "+body.printBody());
			System.out.println("\tEr wird Sie nur ");
			System.out.println("\t"+footer.printFooter()+" im Monat kosten.");
			System.out.println("\t**********************************");
			System.out.println("");
	}
	public void showViewEng(BookingService bookingService) {

		Booking booking;
		booking = bookingService.getBooking();
		
		BookingHeaderEnglish header;
		header = (BookingHeaderEnglish)booking.getHeader();
		BookingBodyEnglish body;
		body = (BookingBodyEnglish)booking.getBody();
		BookingFooterEnglish footer;
		footer = (BookingFooterEnglish)booking.getFooter();
		
		System.out.println("\t**********************************");
		System.out.println("\t"+header.printHeader()+",");
		System.out.println("\tthank you for booking");
		System.out.println("\tone of our cars.");
		System.out.println("\tWe hope you enjoy your");
		System.out.println("\tcar of the brand "+body.printBody());
		System.out.println("\tIt will cost you");
		System.out.println("\t"+footer.printFooter()+" a month.");
		System.out.println("\t**********************************");
		System.out.println("");
		
	}
	public void showViewGerDel(BookingService bookingService) {
		System.out.println("\t**********************************");
		System.out.println("\tAktuell keine Buchung bei uns vorhanden.");
		System.out.println("\t**********************************");
		System.out.println("");
	}
	public void showViewEngDel(BookingService bookingService) {
		System.out.println("\t**********************************");
		System.out.println("\tThere is no open booking for you in our system.");
		System.out.println("\t**********************************");
		System.out.println("");
	}
}
