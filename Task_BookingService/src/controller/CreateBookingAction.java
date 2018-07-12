package controller;

import de.leuphana.swa.resourceService.resource.Car;
import model.BookingService;
import model.Languages;
import view.QuestionLanguageView;

public class CreateBookingAction implements BookingServiceAction{
	
	Car car;
	Languages language;
	
	public CreateBookingAction(Car car) {
		this.car=car;
	}
	
	@Override
	public BookingService action(BookingService bookingService) {
		QuestionLanguageView questionLanguageView = new QuestionLanguageView();
		if (questionLanguageView.showView()==1) {
			language = Languages.GERMAN;
		} else {
			language = Languages.ENGLISH;
		}

		bookingService.createBooking(car, language);

		return bookingService;
	}
	
	
}
