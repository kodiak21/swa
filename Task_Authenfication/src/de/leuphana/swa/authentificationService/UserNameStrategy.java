package de.leuphana.swa.authentificationService;

public class UserNameStrategy implements AuthenficationMethod{
	
	String text = "Idenfified by Username";
	
	@Override
	public boolean authenficateSubject(boolean isAuthenficated) {
		return isAuthenficated;	
	}
	
	public String toString() {
		return text.toString();	
	}

}
