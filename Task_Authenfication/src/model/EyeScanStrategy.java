package model;

public class EyeScanStrategy implements AuthentificationStrategy {
	
	String textGer = "Identifiziert ueber EyeScan";
	String textEng = "Identified by EyeScan";
	
	public boolean authenficateSubjectGer() {
		boolean isAuthenficated = true;
		System.out.println(textGer);
		return isAuthenficated;
	}
	
	public boolean authenficateSubjectEng() {
		boolean isAuthenficated = true;
		System.out.println(textEng);
		return isAuthenficated;
	}

	@Override
	public CredentialType getCredentialType() {
		return CredentialType.EYESCAN;
	}
}
