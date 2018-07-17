package model;



public interface AuthentificationStrategy {
	
	public boolean authenficateSubjectGer();

	public boolean authenficateSubjectEng();
	
	public CredentialType getCredentialType();
}
