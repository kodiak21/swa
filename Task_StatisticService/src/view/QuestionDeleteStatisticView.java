package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionDeleteStatisticView {
public int showViewGer(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Wählen Sie weitere anzuzeigenden Statistiken?");
		System.out.println("1: Statistiken anzeigen");
		System.out.println("2: Programm beenden");

		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("Deine Eingabe war ungueltig");
			e.getMessage();
		}
		if (answer.equals("1") || answer.equals("2")) {
			if ( answer.equals("2")){
				System.out.println("Es wird keine Statistik erstellt");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showViewGer();
		}
	}
	public int showViewEng(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Please choose another statistic?");
		System.out.println("1: Show statistics");
		System.out.println("2: End programm");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (answer.equals("1") || answer.equals("2")) {
			if ( answer.equals("2")){
				System.out.println("No statistics will be created");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("Wrong Input");
			return showViewEng();
		}
	}
}
