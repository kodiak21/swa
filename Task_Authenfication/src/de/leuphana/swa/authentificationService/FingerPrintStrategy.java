package de.leuphana.swa.authentificationService;

public class FingerPrintStrategy implements AuthenficationMethod {
	
	String text = "Idenfified by Fingerprint";

	public boolean authenficateSubject(boolean isAuthenficated){
		return isAuthenficated;
	}
	
	public String toString() {
		return text.toString();	
	}

}
