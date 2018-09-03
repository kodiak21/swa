package actions;

import model.BookingService;
import model.LanguageType;
import view.FareWellBookingView;

/**<b> Übergeordneter Service</b>: BookingService<br>
 * <b> verbundene Views</b>: FareWellBookingView<br>
 * <br><b>FareWellBookingAction:</b> Der Kunde wird verabschiedet bei Abbruch des BookingService
 * 
 * 
 *
 */


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
