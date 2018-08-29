package view;

import model.Person;
import model.PersonType;

public class PrintPersonView {
	public void showViewGer(Person person) {
		System.out.println("\t**********************************");
		if (person.getPersonType() == PersonType.LEGALPERSON){
			System.out.println("\tSie vertreten ein Unternehmen.");
			System.out.println("\tDessen Name ist "+person.getName());
		} else {
			System.out.println("\tDu bist eine Privatperson");
			System.out.println("\tDein Name ist "+person.getName());
		}
		System.out.println("\t**********************************");
		System.out.println("");
		
	}
	public void showViewEng(Person person) {
		System.out.println("\t**********************************");
		if (person.getPersonType() == PersonType.LEGALPERSON){
			System.out.println("\tYou represent a company.");
			System.out.println("\tWhich has the name "+person.getName());
		} else {
			System.out.println("\tYou are a private person");
			System.out.println("\tYour name is "+person.getName());
		}
		System.out.println("\t**********************************");
		System.out.println("");
	}
}
