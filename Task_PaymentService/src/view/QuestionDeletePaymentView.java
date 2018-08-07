package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionDeletePaymentView {
	public int showViewGer() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("Bist du mit deinen Angaben zufrieden?");
		System.out.println("1: Angaben stimmen ueberein");
		System.out.println("2: Angaben verwerfen");
		System.out.println("3: Angaben aendern");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if (answer.equals("2")) {
				System.out.println("Deine Zahlungsangaben werden geloescht.");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showViewGer();
		}
	}

	public int showViewEng() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("Are the provided information correct ?");
		System.out.println("1: Yes continue");
		System.out.println("2: No delete");
		System.out.println("3: No change");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if (answer.equals("2")) {
				System.out.println("Your payment details have been deleted");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("No valid input");
			return showViewEng();
		}
	}
}
