package model;

public class FingerPrintStrategy implements AuthentificationStrategy {
	
	String textGer = "Idenfiziert ueber Fingerprint";
	String textEng = "Identified by Fingerprint";

	public boolean authenficateSubjectGer(){
		boolean isAuthenficated = true;
		System.out.println(textGer);
		return isAuthenficated;
	}
	
	public boolean authenficateSubjectEng(){
		boolean isAuthenficated = true;
		System.out.println(textEng);
		return isAuthenficated;
	}

	@Override
	public CredentialType getCredentialType() {
		return CredentialType.FINGERPRINT;
	}
	

}
