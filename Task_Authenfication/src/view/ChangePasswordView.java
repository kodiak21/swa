package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.AuthentificationService;

public class ChangePasswordView {

	public String showViewGer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = null;

		System.out.println("Bitte Passwort neu setzen");
		
		try {
			password = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return password;
		
	}

	public String showViewEng() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = null;

		System.out.println("Please change your password");
		
		try {
			password = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return password;
		
	}

}
