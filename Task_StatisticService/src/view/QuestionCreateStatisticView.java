package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionCreateStatisticView {
	public int showViewLanguageGer(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Welche Art der Statistik möchten Sie einsehen?");
		System.out.println("1: Statistik ueber englische Verkäufe");
		System.out.println("2: Statistik ueber deutsche Verkäufe");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("Deine Eingabe war ungueltig");
			e.getMessage();
		}
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showViewLanguageGer();
		}
	}
	public int showViewLanguageEng(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Welche Art der Statistik möchten Sie einsehen?");
		System.out.println("1: Statistik ueber englische Verkäufe");
		System.out.println("2: Statistik ueber deutsche Verkäufe");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("Deine Eingabe war ungueltig");
			e.getMessage();
		}
		if (answer.equals("1") || answer.equals("2")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showViewLanguageGer();
		}
	}
	public int showViewPaytypeGer(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Von welchem Bezahltyp möchten Sie die Statistik einsehen?");
		System.out.println("1: Statistik ueber MoneyWallet-Verkaeufe");
		System.out.println("2: Statistik ueber PayPal-Verkaeufe");
		System.out.println("3: Statistik ueber GoogleWallet-Verkaeufe");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("Deine Eingabe war ungueltig");
			e.getMessage();
		}
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showViewLanguageEng();
		}
	}
	public int showViewPaytypeEng(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Von welchem Bezahltyp möchten Sie die Statistik einsehen?");
		System.out.println("1: Statistik ueber MoneyWallet-Verkaeufe");
		System.out.println("2: Statistik ueber PayPal-Verkaeufe");
		System.out.println("3: Statistik ueber GoogleWallet-Verkaeufe");
	
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("Deine Eingabe war ungueltig");
			e.getMessage();
		}
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungueltig");
			return showViewLanguageEng();
		}
	}
}
