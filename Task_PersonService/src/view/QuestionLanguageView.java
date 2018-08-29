package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionLanguageView{
	
	public int showView() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		System.out.println("\t**********************************");
		System.out.println("\tWillkommen beim AutoService OlAnDa");
		System.out.println("\tBitte waehlen Sie die Sprache aus");
		System.out.println("");
		System.out.println("\tWelcome to our CarService OlAnDa");
		System.out.println("\tPlease choose language");
		System.out.println("\t**********************************");
		System.out.println("");
		System.out.println("1: GER");
		System.out.println("2: USA");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tIhre Eingabe war ungueltig");
			System.out.println("\tYour Entry is not valid");
			System.out.println("");
			return showView();
		}
	}
}
