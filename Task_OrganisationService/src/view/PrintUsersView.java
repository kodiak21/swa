package view;

import java.util.Stack;

import model.User;

public class PrintUsersView {
	
	User user;
	
	public void showView(Stack<User> users) {
		System.out.println("Aktuelle Statistik der registrierten Nutzer:");
		Stack<User> usersReverse = new Stack<User>();
		while (!users.isEmpty()) {
			usersReverse.push(users.pop());
		}
		while (!usersReverse.isEmpty()) {
			user = usersReverse.pop();
			if (user.getClass().getSimpleName().equals("UserIndividual")) {
				System.out.println("-Name: "+user.getPerson().getName());
				System.out.println("-Id: "+user.getUserId());
			} else {
				System.out.println("");
				System.out.println("Name: "+user.getPerson().getName());
				System.out.println("Anzahl: "+user.countUser());
			}
		}
	}
}
