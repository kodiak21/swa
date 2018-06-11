package de.leuphana.swa.authentificationService;

public class EyeScanStrategy implements AuthenficationMethod {
	
	String text = "Idenfified by EyeScan";
	
	public boolean authenficateSubject(boolean isAuthenficated) {
		return isAuthenficated;
	}

	public String toString() {
		return text.toString();	
	}

	
	

}
