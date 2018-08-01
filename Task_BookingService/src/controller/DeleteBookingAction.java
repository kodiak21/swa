package controller;

import model.BookingService;
import model.LanguageType;
import model.resource.Resource;
import view.QuestionDeleteBookingView;

public class DeleteBookingAction implements BookingServiceAction {
	
	@Override
	public BookingService action(BookingService bookingService) {
		
		int answer = 0;
		LanguageType language;
		String name;
		Resource car;
		
		QuestionDeleteBookingView view = new QuestionDeleteBookingView();
		language=bookingService.getLanguage();
		name = bookingService.getName();
		car = bookingService.getCar();
		
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
			bookingService.setBooking(bsc.bookingCommand(language, name, car).getBooking());
			break;
		default: break;
		}

		return bookingService;
	}

}
