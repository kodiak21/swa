package controller;

import java.math.BigDecimal;

import model.BookingService;
import model.CarBrandType;
import model.LanguageType;
import view.QuestionDeleteBookingView;

/**<b> Übergeordneter Service</b>: BookingService<br>
 * <b> verbundene Views</b>: QuestionDeleteBookingView<br>
 * <br><b>DeleteBookingAction:</b> Ein Bookingobjekt wird auf Anfrage gelöscht
 * 
 * @param answer - Kundenauswahl 
 * 
 *
 */

public class DeleteBookingAction implements BookingServiceAction {
	
	@Override
	public BookingService action(BookingService bookingService) {
		
		int answer = 0;
		LanguageType language;
		String name;
		BigDecimal cost;
		CarBrandType carBrandType = null;
		
		QuestionDeleteBookingView questionDeleteBookingView = new QuestionDeleteBookingView();
		language=bookingService.getLanguageType();
		name = bookingService.getName();
		cost = bookingService.getCost();
		carBrandType = bookingService.getCarBrandType();
		
		if(language==LanguageType.GERMAN) {
			bookingService.setDeleteAnswer(questionDeleteBookingView.showViewGer());
		} else {
			bookingService.setDeleteAnswer(questionDeleteBookingView.showViewEng());
		}
		
		answer = bookingService.getDeleteAnswer();
		
		switch (answer) {
		case 1:	
			break;
		case 2:	
			bookingService.deleteBooking();
			break;
		case 3:	
			BookingServiceController bookingServiceController = new BookingServiceController();
			bookingService.setBooking(bookingServiceController.bookingCommand(language, name, cost, carBrandType).getBooking());
			break;
		default: break;
		}

		return bookingService;
	}

}
