package model;

public class EyeScanStrategy implements AuthentificationStrategy {
	
	public boolean authenficateSubjectGer() {
		boolean isAuthenficated = true;
		return isAuthenficated;
	}
	
	public boolean authenficateSubjectEng() {
		boolean isAuthenficated = true;
		return isAuthenficated;
	}

	@Override
	public CredentialType getCredentialType() {
		return CredentialType.EYESCAN;
	}
}
