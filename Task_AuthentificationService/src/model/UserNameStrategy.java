package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserNameStrategy implements AuthentificationStrategy {

	private String password;
	private boolean isAuthentificated;

	public UserNameStrategy(String password) {
		this.password = password;
		this.isAuthentificated = false;
	}

	@Override
	public boolean authenficateSubjectGer() {
		String inputPassword;

		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			inputPassword = br.readLine();

			if (inputPassword.equals(password)) {
				isAuthentificated = true;
			} else {

				authenficateSubjectGer();

			}

		} catch (Exception e) {

		}
		return isAuthentificated;

	}

	@Override
	public boolean authenficateSubjectEng() {
		String inputPassword;

		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			inputPassword = br.readLine();

			if (inputPassword.equals(password)) {
				isAuthentificated = true;
			} else {

				authenficateSubjectEng();

			}
		} catch (Exception e) {

		}

		return isAuthentificated;
	}

	@Override
	public CredentialType getCredentialType() {
		return CredentialType.USERNAME;
	}

}
