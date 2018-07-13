package controller;

import de.leuphana.swa.resourceService.resource.Car;
import model.BookingService;
import model.LanguageType;
import view.QuestionLanguageView;

public class CreateBookingAction implements BookingServiceAction{
	
	Car car;
	LanguageType language;
	
	public CreateBookingAction(Car car) {
		this.car = car;
	}
	
	@Override
	public BookingService action(BookingService bookingService) {
		QuestionLanguageView questionLanguageView = new QuestionLanguageView();
		if (questionLanguageView.showView()==1) {
			language = LanguageType.GERMAN;
		} else {
			language = LanguageType.ENGLISH;
		}

		bookingService.createBooking(car, language);

		return bookingService;
	}
	
	
}
