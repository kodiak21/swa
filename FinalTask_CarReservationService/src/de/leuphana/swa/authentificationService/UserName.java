package de.leuphana.swa.authentificationService;

public class UserName implements AuthenficationMethod{

	String text = "Idenfified by Username";
	
	@Override
	public void authenficateSubject() {
		
		System.out.println(text);
		
	}
	
	public String toString() {
		return text.toString();	
	}

}
