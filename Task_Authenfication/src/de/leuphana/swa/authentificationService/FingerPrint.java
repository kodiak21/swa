package de.leuphana.swa.authentificationService;

public class FingerPrint implements AuthenficationMethod {

	String text = "Idenfified by Fingerprint";

	@Override
	public void authenficateSubject() {

		System.out.println(text);

	}
	
	public String toString() {
		return text.toString();	
	}

}
