package model;

import java.util.Stack;

public class UserIndividual extends User{
	
	public UserIndividual(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	Stack<User> printUserInformation() {
		Stack<User> answer = new Stack<User>();
		answer.push(this);
		return answer;
	}

	@Override
	public int countUser() {
		// TODO Auto-generated method stub
		return 1;
	}

}
