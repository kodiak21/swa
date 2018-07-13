package model;

public class FingerPrintStrategy implements AuthentificationStrategy {
	
	String text = "Idenfified by Fingerprint";

	public boolean authenficateSubject(){
		boolean isAuthenficated = true;
		System.out.println(text);
		return isAuthenficated;
	}
	

}
