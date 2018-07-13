package controller;

import model.BookingService;
import model.LanguageType;
import view.QuestionDeleteBookingView;

public class DeleteBookingAction implements BookingServiceAction {
	
	@Override
	public BookingService action(BookingService bookingService) {
		
		int answer=0;
		
		QuestionDeleteBookingView view = new QuestionDeleteBookingView();
		if(bookingService.getLanguage()==LanguageType.GERMAN) {
			answer = view.showViewGer();
		} else {
			answer = view.showViewEng();
		}
		
		
		switch (answer) {
		case 1:	
			break;
		case 2:	
			bookingService.deleteBooking();
			break;
		case 3:	
			BookingServiceController bsc = new BookingServiceController();
			bookingService.setBooking(bsc.bookingCommand().getBooking());
			break;
		default: break;
		}

		return bookingService;
	}

}
