package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskCarOrderView {

	public int showViewGer() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("\tMoechten Sie ein Auto bestellen ?");
		System.out.println("1: Ja");
		System.out.println("2: Nein");
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
			System.out.println("");
			return showViewGer();
		}
	}
	
	public int showViewEng() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("\tWould you like to order a car ?");
		System.out.println("1: Yes");
		System.out.println("2: No");
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
			System.out.println("\tInvalid Input");
			System.out.println("");
			return showViewEng();
		}
	}

	
	
}
