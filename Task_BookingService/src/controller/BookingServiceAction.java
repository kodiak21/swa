package controller;

import model.BookingService;

/**<b> Übergeordneter Service</b>: BookingService<br>
 * 
 * <br><b>BookingServiceAction:</b> Interface, wird in allen betreffenden Aktionen des BookingService implementiert
 * 
 * 
 *
 */

public interface BookingServiceAction {
	public BookingService action(BookingService bookingService);
}
