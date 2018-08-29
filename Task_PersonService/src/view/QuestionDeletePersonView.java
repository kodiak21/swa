package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionDeletePersonView {
public int showViewGer(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tStimmen diese Angaben mit Ihren ueberein?");
		System.out.println("1: Angaben stimmen ueberein");
		System.out.println("2: Angaben wieder verwerfen");
		System.out.println("3: Angaben aendern");

		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("Deine Eingabe war ungueltig");
			e.getMessage();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if ( answer.equals("2")){
				System.out.println("\tIhre Angaben wurden geloescht");
				System.out.println("");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("\tDeine Eingabe war ungueltig");
			System.out.println("");
			return showViewGer();
		}
	}
	public int showViewEng(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("\tAre the positions correct?");
		System.out.println("1: Yes continue");
		System.out.println("2: No delete");
		System.out.println("3: No change");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if ( answer.equals("2")){
				System.out.println("Your inputs have been deleted");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("WrongInput");
			return showViewEng();
		}
	}
}
