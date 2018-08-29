package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionDeleteStatisticView {
public int showViewGer(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tWaehlen Sie weitere anzuzeigenden Statistiken?");
		System.out.println("1: Statistiken anzeigen");
		System.out.println("2: Programm beenden");

		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("\tDeine Eingabe war ungueltig");
			e.getMessage();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tIhre Eingabe war ungueltig");
			return showViewGer();
		}
	}
	public int showViewEng(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tPlease choose another statistics?");
		System.out.println("1: Show statistics");
		System.out.println("2: End programm");
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
			System.out.println("\tWrong Input");
			return showViewEng();
		}
	}
}
