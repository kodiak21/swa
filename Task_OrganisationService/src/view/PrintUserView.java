package view;

import model.User;

public class PrintUserView {
	public void showViewGer(User user) {
		System.out.println("Deine Kunden-ID ist: " + user.getUserId());

	}
	
	public void showViewEng(User user) {
		System.out.println("Your customer Id is: " + user.getUserId());

	}
}
