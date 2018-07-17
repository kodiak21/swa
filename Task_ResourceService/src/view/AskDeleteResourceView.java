package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskDeleteResourceView {
public int showViewGer(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Sind Sie mit der Bestellung einverstanden ?");
		System.out.println("1: Angaben stimmen ueberein");
		System.out.println("2: Angaben wieder verwerfen");
		System.out.println("3: Angaben aendern");

		try {
			answer = br.readLine();
		} catch (IOException e) {
			e = new IOException("Ihre Eingabe war ungueltig");
			e.getMessage();
		}
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if ( answer.equals("2")){
				System.out.println("Ihre Bestellung wird storniert.");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("Ihre Eingabe war ungueltig");
			return showViewGer();
		}
	}
	public int showViewEng(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Are these positions correct?");
		System.out.println("1: Yes continue");
		System.out.println("2: No delete");
		System.out.println("3: No change");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if ( answer.equals("2")){
				System.out.println("Your order was cancelled");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("Wrong Input");
			return showViewEng();
		}
	}
}

