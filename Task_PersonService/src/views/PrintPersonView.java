package views;

import model.Person;
import model.PersonType;

public class PrintPersonView {
	public void showView(Person person) {
		if (person.getPersonType() == PersonType.LEGALPERSON){
			System.out.println("Sie vertreten ein Unternehmen.");
			System.out.println("Dessen Name ist "+person.getName());
		} else {
			System.out.println("Du bist eine Privatperson");
			System.out.println("Dein Name ist "+person.getName());
		}
		
	}
}
