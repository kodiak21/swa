package model;

import java.util.Stack;

abstract public class User {
	
	static int nextUserId = 1;
	int userId;
	Person person;
	Account account;
	
	abstract Stack<User> printUserInformation();
	abstract public int countUser();
	
	protected User(Person person) {
		this.userId = nextUserId++;
		this.person = person;
		this.account = new Account(userId);
	}
	
	public int getUserId() {
		return userId;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Account getAccount() {
		return account;
	}

}
