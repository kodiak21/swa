package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionConfirmView {
	public int showView() {

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
				System.out.println("Deine Authentifizierungsdaten wurden gelöscht.");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showView();
		}
	}
}
