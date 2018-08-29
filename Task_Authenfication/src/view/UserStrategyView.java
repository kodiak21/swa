package view;

public class UserStrategyView {

	public void askPasswordGer() {
		System.out.println("\tGeben Sie Ihr Passwort ein:");
		
	}
	
	public void askPasswordEng() {
		System.out.println("\tEnter your password:");
	}

	public void falsePasswordGer() {
		System.out.println("\tFalsches Passwort");
		
	}
	
	public void falsePassWordEng() {
		System.out.println("\tWrong password!");
		
	}

	public void closedAccountGer() {
		System.out.println("\tIhr Account wurde kurzfristig gesperrt.");
		System.out.println("\tBitte wenden Sie sich an den Kundenservice.");
		System.out.println("");
		System.exit(0);
		
	}

	public void closedAccountEng() {
		System.out.println("\tYour account has temporarily been closed.");
		System.out.println("\tPlease contact your local admin.");
		System.out.println("");
		System.exit(0);
		
	}

	

	
	
	

}
