package views;

import model.Person;
import model.PersonType;

public class PrintPersonView {
	public void showViewGer(Person person) {
		if (person.getPersonType() == PersonType.LEGALPERSON){
			System.out.println("Sie vertreten ein Unternehmen.");
			System.out.println("Dessen Name ist "+person.getName());
		} else {
			System.out.println("Du bist eine Privatperson");
			System.out.println("Dein Name ist "+person.getName());
		}
		
	}
	public void showViewEng(Person person) {
		if (person.getPersonType() == PersonType.LEGALPERSON){
			System.out.println("You represent a company.");
			System.out.println("Which has the name "+person.getName());
		} else {
			System.out.println("You are a private person");
			System.out.println("Your name is "+person.getName());
		}
		
	}
}
