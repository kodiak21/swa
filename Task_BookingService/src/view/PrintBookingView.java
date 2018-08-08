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
			
			System.out.println("");
			System.out.println(header.printHeader()+",");
			System.out.println("danke, dass Sie sich fuer eines unserer Autos entschieden haben.");
			System.out.println("Wir hoffen sie geniessen den Wagen der Marke "+body.printBody());
			System.out.println("Er wird Sie nur "+footer.printFooter()+" im Monat kosten.");
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
		
		System.out.println("");
		System.out.println(header.printHeader()+",");
		System.out.println("thank you for booking one of our cars.");
		System.out.println("We hope you enjoy your car of the brand "+body.printBody());
		System.out.println("It will cost you "+footer.printFooter()+" a month.");
		System.out.println("");
		
	}
	public void showViewGerDel(BookingService bookingService) {
		System.out.println("Aktuell keine Buchung bei uns vorhanden.");
	}
	public void showViewEngDel(BookingService bookingService) {
		System.out.println("There is no open booking for you in our system.");
	}
}
