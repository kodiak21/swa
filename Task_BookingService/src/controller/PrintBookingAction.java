package controller;

import model.BookingService;
import model.LanguageType;
import view.PrintBookingView;

public class PrintBookingAction implements BookingServiceAction {

	PrintBookingView printBookingView;
	
	@Override
	public BookingService action(BookingService bookingService) {
		printBookingView = new PrintBookingView();
		if (bookingService.getBooking()==null) {
			if(bookingService.getLanguage()==LanguageType.GERMAN) {
				printBookingView.showViewGerDel(bookingService);
			}else {
				printBookingView.showViewEngDel(bookingService);
			}
		} else {
			if(bookingService.getLanguage()==LanguageType.GERMAN) {
				printBookingView.showViewGer(bookingService);
			}else {
				printBookingView.showViewEng(bookingService);
			}
		}

		return bookingService;
	}

}