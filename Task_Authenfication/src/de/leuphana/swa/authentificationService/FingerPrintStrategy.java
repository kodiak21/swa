package de.leuphana.swa.authentificationService;

public class FingerPrintStrategy implements AuthenficationMethod {

	private boolean isAuthenficated = true;
	
	String text = "Idenfified by Fingerprint";

	@Override
	public boolean authenficateSubject() {

		System.out.println(text);
		return isAuthenficated;

	}
	
	public String toString() {
		return text.toString();	
	}

}
