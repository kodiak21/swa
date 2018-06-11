package de.leuphana.swa.authentificationService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AuthentificationMethodFactory {

	private static String password = "1234";

	private static boolean isAuthenficated = true;

	public static AuthenficationMethod getAuthenticationMethod(CredentialType credentialType) {
		switch (credentialType) {
		case USERNAME:
			return createUserName();
		case FINGERPRINT:
			return createFingerPrint();
		case EYESCAN:
			return createEyeScan();
		default:
			return null;
		}
	}

	private static AuthenficationMethod createEyeScan() {
		return new EyeScanStrategy();
	}

	private static AuthenficationMethod createFingerPrint() {
		return new FingerPrintStrategy();
	}

	private static AuthenficationMethod createUserName() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("Enter password");
			String input = br.readLine();

			if (input.equals(password)) {

				System.out.println("Identified by UserName");

			} else {
				isAuthenficated = false;
				System.out.println("Wrong Password");
			}
		} catch (Exception e) {

		}

		return new UserNameStrategy();
	}

}
