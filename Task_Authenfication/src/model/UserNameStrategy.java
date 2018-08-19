package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import view.UserStrategyView;

public class UserNameStrategy implements AuthentificationStrategy {

	private String password;
	private boolean isAuthentificated;
	private int failedTries;
	private AuthentificationService authentificationService;
	private UserStrategyView userStrategyView;

	private int count = 1;

	public UserNameStrategy(String password, int failedTries, AuthentificationService authentificationService) {
		this.password = password;
		this.isAuthentificated = false;
		this.failedTries = failedTries;
		this.authentificationService = authentificationService;
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

			authentificationService.setFailedTries(count);

			if (inputPassword.equals(password)) {
				isAuthentificated = true;
			} else {

				userStrategyView.falsePasswordGer();

				authentificationService.setFailedTries(count++);

				if (authentificationService.getFailedTries() < failedTries) {
					authenficateSubjectGer();
				} else if (authentificationService.getFailedTries() == failedTries) {

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

			authentificationService.setFailedTries(count);

			if (inputPassword.equals(password)) {
				isAuthentificated = true;
			} else {

				userStrategyView.falsePassWordEng();

				authentificationService.setFailedTries(count++);
				if (authentificationService.getFailedTries() < failedTries) {
					authenficateSubjectEng();
				} else if (authentificationService.getFailedTries() == failedTries) {

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
