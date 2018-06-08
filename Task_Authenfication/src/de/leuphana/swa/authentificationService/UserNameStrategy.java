package de.leuphana.swa.authentificationService;

public class UserNameStrategy implements AuthenficationMethod{

	private boolean isAuthenficated = true;
	
	String text = "Idenfified by Username";
	
	@Override
	public boolean authenficateSubject() {
		
		System.out.println(text);
		return isAuthenficated;
		
	}
	
	public String toString() {
		return text.toString();	
	}

}
