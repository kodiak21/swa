package de.leuphana.swa.personService;

public class Client {
	
	//PersonService nach Method Factory Pattern
	
	public static void main(String[] args) {
		
		String name = "John Moeller";		
		PersonType personType = PersonType.LEGALPERSON;		
		
		
		//Controllpatter
		//CreatePerson (PersonType, String name);
		UserFactory userfactory = new UserFactory();
		Person p = userfactory.createPerson(personType,name);
		

		//return person;
		//DeletePerson(Person p);
		// p = null;
		
		//PrintPerson();
		System.out.println(p.getPersonType());		
		System.out.println("name of person " + p.getName());
	}
}
