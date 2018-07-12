package model;

public class Booking {
	private BookingHeader header;
	private BookingBody body;
	private BookingFooter footer;
	
//Liste implementieren für Statistics
//static List<Booking> bookingsDone = new ArrayList<>();

	public BookingHeader getHeader() {
		return header;
	}
	
	public void setHeader(BookingHeader header) {
		this.header = header;
	}

	public BookingBody getBody() {
		return body;
	}

	public void setBody(BookingBody body) {
		this.body = body;
	}

	public BookingFooter getFooter() {
		return footer;
	}

	public void setFooter(BookingFooter footer) {
		this.footer = footer;
	}
	
	@Override
    public String toString() {
        return "Booking:\n" + header.printHeader() + "\n" + body.printBody() + "\n" + footer.printFooter(); 
    }
	
	
}
