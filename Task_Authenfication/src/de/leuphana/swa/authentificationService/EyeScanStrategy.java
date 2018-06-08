package de.leuphana.swa.authentificationService;

public class EyeScanStrategy implements AuthenficationMethod {

	private boolean isAuthenficated;
	
	String text = "Idenfified by EyeScan";
	
	@Override
	public boolean authenficateSubject() {
		System.out.println(text);
		return isAuthenficated;
	}

	public String toString() {
		return text.toString();	
	}
	

}
