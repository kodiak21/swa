package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionLanguageView{
	
	public int showView() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Aus welchem Land bist du?");
		System.out.println("Where are you from?");
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
			System.out.println("Deine Eingabe war ungueltig");
			return showView();
		}
	}
}
