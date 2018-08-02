package controller;

import java.math.BigDecimal;

import model.BookingService;
import model.LanguageType;
import view.QuestionDeleteBookingView;

public class DeleteBookingAction implements BookingServiceAction {
	
	@Override
	public BookingService action(BookingService bookingService) {
		
		int answer = 0;
		LanguageType language;
		String name;
		BigDecimal cost;
		
		QuestionDeleteBookingView view = new QuestionDeleteBookingView();
		language=bookingService.getLanguage();
		name = bookingService.getName();
		cost = bookingService.getCost();
		
		if(language==LanguageType.GERMAN) {
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
			bookingService.setBooking(bsc.bookingCommand(language, name, cost).getBooking());
			break;
		default: break;
		}

		return bookingService;
	}

}
