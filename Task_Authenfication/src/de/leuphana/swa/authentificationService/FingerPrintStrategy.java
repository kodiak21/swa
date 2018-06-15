package de.leuphana.swa.authentificationService;

public class FingerPrintStrategy implements AuthenficationMethod {
	
	String text = "Idenfified by Fingerprint";

	public boolean authenficateSubject(){
		boolean isAuthenficated = true;
		System.out.println(text);
		return isAuthenficated;
	}
	

}
