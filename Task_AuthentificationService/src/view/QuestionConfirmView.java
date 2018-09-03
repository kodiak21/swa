package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionConfirmView {
	public int showViewGer() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("\tSind Sie mit Ihren Angaben zufrieden?");
		System.out.println("1: Angaben stimmen ueberein");
		System.out.println("2: Angaben verwerfen");
		System.out.println("3: Angaben aendern");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if (answer.equals("2")) {
				System.out.println("\tIhre Authentifizierungsdaten wurden geloescht.");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tIhre Eingabe war ungueltig");
			return showViewGer();
		}
	}
	
	public int showViewEng() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("\tAre you satisfied with your choice ?");
		System.out.println("1: Confirm Choice");
		System.out.println("2: Delete Choice");
		System.out.println("3: Change Choice");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if (answer.equals("2")) {
				System.out.println("\tYour authentification data have been deleted !");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tInvalid Input");
			return showViewEng();
		}
	}
}

