package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserNameStrategy implements AuthentificationStrategy {

	private String password;
	private boolean isAuthenficated;

	public UserNameStrategy(String password) {
		this.password = password;
		this.isAuthenficated = false;
	}

	@Override
	public boolean authenficateSubjectGer() {
		String inputPassword;

		System.out.println("Geben Sie Ihr Passwort ein:");
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			inputPassword = br.readLine();
			if (inputPassword.equals(password)) {
				isAuthenficated = true;
			} else {
				System.out.println("Falsches Passwort");
				authenficateSubjectGer();
			}
		} catch (Exception e) {
		}

		return isAuthenficated;
	}

	@Override
	public boolean authenficateSubjectEng() {
		String inputPassword;

		System.out.println("Enter your password:");
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			inputPassword = br.readLine();
			if (inputPassword.equals(password)) {
				isAuthenficated = true;
			} else {
				System.out.println("Wrong password!");
				authenficateSubjectEng();
			}
		} catch (Exception e) {
		}

		return isAuthenficated;
	}

	@Override
	public CredentialType getCredentialType() {
		return CredentialType.USERNAME;
	}

}
