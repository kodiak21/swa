package view;

public class UserStrategyView {

	public void askPasswordGer() {
		System.out.println("Geben Sie Ihr Passwort ein:");
		
	}
	
	public void askPasswordEng() {
		System.out.println("Enter your password:");
	}

	public void falsePasswordGer() {
		System.out.println("Falsches Passwort");
		
	}
	
	public void falsePassWordEng() {
		System.out.println("Wrong password!");
		
	}

	public void closedAccountGer() {
		System.out.println("Ihr Account wurde kurzfristig gesperrt.");
		System.out.println("Bitte wenden Sie sich an den Kundenservice.");
		System.exit(0);
		
	}

	public void closedAccountEng() {
		System.out.println("Your account has temporarily been closed.");
		System.out.println("Please contact your local admin.");
		System.exit(0);
		
	}

	

	
	
	

}
