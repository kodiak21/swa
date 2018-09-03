package actions;

import java.math.BigDecimal;

import model.BookingService;
import model.CarBrandType;
import model.LanguageType;

/**<b> Übergeordneter Service</b>: BookingService<br>
 * 
 * <br>
 * <b>CreateBookingAction:</b> Ein Bookingobjekt wird erzeugt
 * 
 * @param price - Betrag des jeweiligen Bookings
 * @param language - Sprachauswahl
 * @param name - Name des Kunden
 * @param carBrandType - gewählte Automarke
 * 
 *
 */

public class CreateBookingAction implements BookingServiceAction{
	
	BigDecimal price;
	LanguageType language;
	String name;
	CarBrandType carBrandType;
	
	public CreateBookingAction(BigDecimal price, LanguageType language, String name, CarBrandType carBrandType) {
		this.language = language;
		this.price = price;
		this.name = name;
		this.carBrandType = carBrandType;
	}
	
	@Override
	public BookingService action(BookingService bookingService) {

		bookingService.createBooking(price, language, name, carBrandType);

		return bookingService;
	}
	
	
}
