package model;

public class AuthentificationService {
	
	Person person;
	AuthentificationStrategy authentificationStrategy;
	
	CredentialType credentialType;
	LanguageType languageType;
	int deleteAnswer;
	int passwordAnswer;
	int createAnswer;
	String password;

	public void createAuthentification(CredentialType credentialType, Person person, AuthentificationService authentificationService) {
		this.person = person;
		this.authentificationStrategy = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person, authentificationService);
	}
	
	public AuthentificationStrategy getAuthentificationStrategy() {
		return this.authentificationStrategy;
	}

	public boolean authentificateSubject() {
		
		if(person.getLanguageType()==LanguageType.GERMAN) {
			return authentificationStrategy.authenficateSubjectGer();
		}else if(person.getLanguageType() == LanguageType.ENGLISH) {
			return authentificationStrategy.authenficateSubjectEng();
		}
		return true;
	}
	
	public void deleteAuthentification() {
		this.authentificationStrategy = null;
	}

	public void setDeleteAnswer(int deleteAnswer) {
		this.deleteAnswer = deleteAnswer;
		
	}
	
	public int getDeleteAnswer() {
		return deleteAnswer;
	}

	public void setPasswordAnswer(int passwordAnswer) {
		this.passwordAnswer= passwordAnswer;
		
	}
	
	public int getPasswordAnswer() {
		return passwordAnswer;
	}

	public void setCreateAnswer(int createAnswer) {
		this.createAnswer = createAnswer;
		
	}
	
	public int getCreateAnswer() {
		return createAnswer;
	}

	public void setPassword(String password) {
		this.password = password;
		
	}
	
	public String getPassword() {
		return password;
	}
	
}
