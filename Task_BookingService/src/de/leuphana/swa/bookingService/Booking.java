package de.leuphana.swa.bookingService;

public class Booking {
	private String header;
	private String body;
	private String footer;
	
	public String getHeader() {
		return header;
	}
	
	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}
	
	@Override
    public String toString() {
        return "Booking:\n" + header + "\n" + body + "\n" + footer; 
    }
	
	
}
