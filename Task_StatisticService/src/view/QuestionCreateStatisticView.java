package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionCreateStatisticView {
	public int showViewLanguageGer(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tWelche Art der Statistik moechten Sie einsehen?");
		System.out.println("1: Statistik ueber englische Verkaeufe");
		System.out.println("2: Statistik ueber deutsche Verkaeufe");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("\tIhre Eingabe war ungueltig");
			e.getMessage();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tIhre Eingabe war ungueltig");
			return showViewLanguageGer();
		}
	}
	public int showViewLanguageEng(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tWhat kind of statistics would you like to see ?");
		System.out.println("1: Statistics of englisch sellings");
		System.out.println("2: Statistics of german sellings");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("\tInvalid Entry");
			e.getMessage();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tInvalid Entry");
			return showViewLanguageEng();
		}
	}
	public int showViewPaytypeGer(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tVon welchem Bezahltyp moechten Sie die Statistik einsehen?");
		System.out.println("1: Statistik ueber MoneyWallet-Verkaeufe");
		System.out.println("2: Statistik ueber PayPal-Verkaeufe");
		System.out.println("3: Statistik ueber GoogleWallet-Verkaeufe");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("\tDeine Eingabe war ungueltig");
			e.getMessage();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tDeine Eingabe war ungueltig");
			return showViewLanguageGer();
		}
	}
	public int showViewPaytypeEng(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tWhich payment statistics would you like to see ?");
		System.out.println("1: Statistics of moneyWallet payments");
		System.out.println("2: Statistics of payPal payments");
		System.out.println("3: Statistics of googleWallet payments");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("\tInvalid Entry");
			e.getMessage();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tInvalid Entry");
			return showViewLanguageEng();
		}
	}
}
