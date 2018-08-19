package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import view.UserStrategyView;

public class UserNameStrategy implements AuthentificationStrategy {

	private String password;
	private boolean isAuthentificated;
	private int failedTries;
	private UserStrategyView userStrategyView;

	private int count = 0;

	public UserNameStrategy(String password, int failedTries) {
		this.password = password;
		this.failedTries = failedTries;
		this.isAuthentificated = false;
		this.userStrategyView = new UserStrategyView();
	}

	@Override
	public boolean authenficateSubjectGer() {
		String inputPassword;

		userStrategyView.askPasswordGer();

		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			inputPassword = br.readLine();

			if (inputPassword.equals(password)) {
				isAuthentificated = true;
			} else {

				userStrategyView.falsePasswordGer();

				count++;

				if (count < failedTries) {
					authenficateSubjectGer();
				} else if (count == failedTries) {

					userStrategyView.closedAccountGer();

				}

			}

		} catch (Exception e) {

		}
		return isAuthentificated;

	}

	@Override
	public boolean authenficateSubjectEng() {
		String inputPassword;

		userStrategyView.askPasswordEng();

		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			inputPassword = br.readLine();

			if (inputPassword.equals(password)) {
				isAuthentificated = true;
			} else {

				userStrategyView.falsePassWordEng();

				count++;
				if (count < failedTries) {
					authenficateSubjectEng();
				} else if (count == failedTries) {

					userStrategyView.closedAccountEng();

				}

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
