package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionLanguageView{
	
	public int showView() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		System.out.println("Herzlich Willkommen beim AutoService OlAnDa");
		System.out.println("Bitte waehlen Sie die Sprache aus");
		System.out.println("Welcome to our CarService OlAnDa");
		System.out.println("Please choose language");
		System.out.println("1: GER");
		System.out.println("2: USA");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(answer);
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Ihre Eingabe war ungueltig");
			System.out.println("Your Entry is not valid");
			return showView();
		}
	}
}
