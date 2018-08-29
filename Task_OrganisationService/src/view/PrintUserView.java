package view;

import model.User;

public class PrintUserView {
	public void showViewGer(User user) {
		System.out.println("\t**********************************");
		System.out.println("\tDeine Kunden-ID ist: " + user.getUserId());
		System.out.println("\t**********************************");
		System.out.println("");

	}
	
	public void showViewEng(User user) {
		System.out.println("\t**********************************");
		System.out.println("\tYour customer Id is: " + user.getUserId());
		System.out.println("\t**********************************");
		System.out.println("");
	}
}
