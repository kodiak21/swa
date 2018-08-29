package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetPasswordView {

	public String showViewGer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = null;

		System.out.println("\tGeben Sie Ihr neues Passwort ein");
		try {
			password = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		return password;
	}

	public String showViewEng() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = null;

		System.out.println("\tPlease enter the new password");
		try {
			password = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		return password;
		
	}

}
