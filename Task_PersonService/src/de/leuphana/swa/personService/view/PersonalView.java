package de.leuphana.swa.personService.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;

public class PersonalView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	PersonType personType = null; 
	
	public int askDeletePerson(String name) throws IOException {
		
		System.out.println("What should be done with Customer " + name);
		System.out.println("1: Create Person Instance");
		System.out.println("2: Delete Person Instance");
		System.out.println("3: Print Person Instance Information");
		
		int i = Integer.parseInt(br.readLine());
		
		return i;
	}
	
	public void confirmCreatePerson(String name) {
		System.out.println("Person Instance with name: " + name + " has been created");
	}
	
	public void confirmDeletePerson(String name) {
		System.out.println("Person Instance with name: " + name + " has been deleted");
	}
	
	public String askName() throws IOException {
		System.out.println("Write Customer's name");
		
		String name = br.readLine();
		
		return name;
	}
	
	public PersonType askPersonType() throws IOException {
		
		System.out.println("Is Customer a");
		System.out.println("1: Natural");
		System.out.println("2: Legal");
		
		int i = Integer.parseInt(br.readLine());
		
		if(i==1) {
			personType = PersonType.NATURALPERSON;
		}else if(i==2) {
			personType = PersonType.LEGALPERSON;
		}
		return personType;
		
	}
	
	public void printInfo(Person p) {
		if(p!=null) {
			System.out.println("Name of Person " + p.getName());
			System.out.println("Type: " + p.getPersonType());
		}else if(p==null){
			System.out.println("Person doesn't exist!");
		}
	}
	
}
