package de.leuphana.swa.authentificationService;

public class EyeScan implements AuthenficationMethod {

	String text = "Idenfified by EyeScan";
	
	@Override
	public void authenficateSubject() {
		System.out.println(text);
	}

	public String toString() {
		return text.toString();	
	}
	

}
