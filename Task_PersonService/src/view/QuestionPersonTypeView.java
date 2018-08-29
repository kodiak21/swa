package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionPersonTypeView {
	public int showViewGer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tWo sollen wir dich einteilen?");
		System.out.println("1: Natuerliche Person");
		System.out.println("2: Juristische Person");
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
			System.out.println("\tDeine Eingabe war ungueltig");
			return showViewGer();
		}
	}
	public int showViewEng() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tWhat is your status?");
		System.out.println("1: Natural person");
		System.out.println("2: Legal person");
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
			System.out.println("\tInvalid input");
			return showViewEng();
		}
	}

}
