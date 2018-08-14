package controller;

import model.BookingService;
import model.LanguageType;
import view.FareWellBookingView;

public class FareWellBookingAction implements BookingServiceAction {

	private FareWellBookingView fareWellBookingView;

	public FareWellBookingAction() {
		this.fareWellBookingView = new FareWellBookingView();
	}

	
	@Override
	public BookingService action(BookingService bookingService) {
		if(bookingService.getLanguageType()== LanguageType.GERMAN) {
			fareWellBookingView.showViewGer();
			System.exit(0);
		}else if(bookingService.getLanguageType() == LanguageType.ENGLISH) {
			fareWellBookingView.showViewEng();
			System.exit(0);
		}
		
		return bookingService;
	}

}
