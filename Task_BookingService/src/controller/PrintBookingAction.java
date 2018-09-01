package controller;

import model.BookingService;
import model.LanguageType;
import view.PrintBookingView;

/**<b> Übergeordneter Service</b>: BookingService<br>
 * <b> verbundene Views</b>: PrintBookingView<br>
 * <br>
 * <b>PrintBookingAction:</b> Ausgabe der ermittelten Werte
 * 
 *
 */

public class PrintBookingAction implements BookingServiceAction {

	PrintBookingView printBookingView;
	
	@Override
	public BookingService action(BookingService bookingService) {
		printBookingView = new PrintBookingView();
		if (bookingService.getBooking()==null) {
			if(bookingService.getLanguageType()==LanguageType.GERMAN) {
				printBookingView.showViewGerDel(bookingService);
			}else {
				printBookingView.showViewEngDel(bookingService);
			}
		} else {
			if(bookingService.getLanguageType()==LanguageType.GERMAN) {
				printBookingView.showViewGer(bookingService);
			}else {
				printBookingView.showViewEng(bookingService);
			}
		}

		return bookingService;
	}

}
