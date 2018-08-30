package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.AuthentificationService;

public class EnterPasswordAuthentificationView {

	private String password;
	private int failedTries;
	private int aims = 1;

	public void showViewGer(AuthentificationService authentificationService) {

		password = authentificationService.getPassword();

		failedTries = authentificationService.getFailedTries();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("\tGeben Sie bitte Ihr Passwort ein");

		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		if (answer.equals(password)) {
			System.out.println("\t**********************************");
			System.out.println("\tkorrektes Passwort eingegeben");
			System.out.println("\t**********************************");
		} else {
			if (aims < failedTries) {
				System.out.println("\t**********************************");
				System.out.println("\tFalsches Passwort");
				System.out.println("\t**********************************");
				aims++;
				showViewGer(authentificationService);
			} else if (aims == failedTries) {
				System.out.println("\t**********************************");
				System.out.println("\tIhr Account wurde kurzfristig gesperrt.");
				System.out.println("\tBitte wenden Sie sich an den Kundenservice.");
				System.out.println("\tVielen Dank für Ihr Verstaendnis");
				System.out.println("");
				System.out.println("\t**********************************");	
				System.exit(0);
			}

		}

	}

	public void showViewEng(AuthentificationService authentificationService) {
		password = authentificationService.getPassword();

		failedTries = authentificationService.getFailedTries();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("\tPlease enter your password");

		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		if (answer.equals(password)) {
			System.out.println("\t**********************************");
			System.out.println("\tThe entered password is correct");
			System.out.println("\t**********************************");
		} else {
			if (aims < failedTries) {
				System.out.println("\t**********************************");
				System.out.println("\tWrong password");
				System.out.println("\t**********************************");
				aims++;
				showViewEng(authentificationService);
			}else if(aims==failedTries) {
				System.out.println("\t**********************************");
				System.out.println("\tYour account has temporarily been closed.");
				System.out.println("\tPlease contact your local admin.");
				System.out.println("\tThank you for your understanding");
				System.out.println("");
				System.out.println("\t**********************************");
				System.exit(0);
			}
		}

	}

}
