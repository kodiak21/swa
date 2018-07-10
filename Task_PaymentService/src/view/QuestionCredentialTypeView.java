package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionCredentialTypeView {
	
	public int showView(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Wie möchtest du dich authentifizieren?");
		System.out.println("1: Fingerprint");
		System.out.println("2: Passwort");
		System.out.println("3: Eyescan");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(answer);
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungültig");
			return showView();
		}
		
	}
}
