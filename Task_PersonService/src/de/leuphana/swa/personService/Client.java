package de.leuphana.swa.personService;

public class Client {
	
	//PersonService nach Method Factory Pattern
	
	public static void main(String[] args) {
		
		String name = "John Moeller";
		
		PersonType personType = PersonType.LEGALPERSON;
		
		UserFactory userfactory = new UserFactory();
		
		Person p = userfactory.createPerson(personType,name);
		
		System.out.println(p.getPersonType(personType));
		
		System.out.println("name of person " + p.getName());
	}
}
