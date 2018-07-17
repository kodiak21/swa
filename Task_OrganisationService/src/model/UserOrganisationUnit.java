package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class UserOrganisationUnit extends User {

	LinkedList<User> users = new LinkedList<User>();
	
	public UserOrganisationUnit(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Stack<User> printUserInformation() {
		Stack<User> answer = new Stack<User>();
		answer.push(this);
		
		Iterator<User> userIterator = users.iterator();
		while (userIterator.hasNext()) {
			User user = userIterator.next();
			Stack<User> userReturn = new Stack<User>();
			userReturn = user.printUserInformation();
			while (!userReturn.isEmpty()) {
				answer.push(userReturn.pop());
			}
		}	
		return answer;
	}
	
	@Override
	public int countUser() {
		int count = 0;
		for (User user: users) {
			count += user.countUser();
		}
		return count;
	}
	
	public void add(User user) {
		this.users.add(user);
	}
	
	public void remove(User user) {
			this.users.remove(user);
	}

}
