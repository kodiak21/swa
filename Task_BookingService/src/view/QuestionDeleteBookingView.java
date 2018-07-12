package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionDeleteBookingView {
	public int showViewGer(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Stimmen diese Angaben mit Ihren überein?");
		System.out.println("1: Angaben stimmen überein");
		System.out.println("2: Angaben wieder verwerfen");
		System.out.println("3: Angaben ändern");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
			if ( answer.equals("2")){
				System.out.println("Ihre Buchung wird storniert.");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("Deine Eingabe war ungültig");
			return showViewGer();
		}
	}
	public int showViewEng(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		
		System.out.println("Are the positions correct?");
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
				System.out.println("Your booking was cancelled");
			}
			return Integer.parseInt(answer);
		} else {
			System.out.println("WrongInput");
			return showViewEng();
		}
	}
}
