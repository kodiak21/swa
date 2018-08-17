package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskPassWordView {

	public int showViewGer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("Möchtest Du Dein Passwort aendern ?");
		System.out.println("1: Ja");
		System.out.println("2: Nein");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showViewGer();
		}
		
	}

	public int showViewEng() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("Would you like to change your password ?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Your Entry was invalid");
			return showViewEng();
		}
		
	}

}
