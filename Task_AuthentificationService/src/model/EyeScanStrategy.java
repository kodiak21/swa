package model;

public class EyeScanStrategy implements AuthentificationStrategy {
	
	public boolean authenficateSubjectGer() {
		boolean isAuthentificated = true;
		return isAuthentificated;
	}
	
	public boolean authenficateSubjectEng() {
		boolean isAuthentificated = true;
		return isAuthentificated;
	}

	@Override
	public CredentialType getCredentialType() {
		return CredentialType.EYESCAN;
	}
}
