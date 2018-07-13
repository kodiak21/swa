package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionPaymentView {
	
		public int showView(){
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String answer = null;
			
			System.out.println("Wie moechtest du zahlen?");
			System.out.println("1: PayPal");
			System.out.println("2: GoogleWallet");
			System.out.println("3: MoneyWallet");
			try {
				answer = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(answer);
			if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
				return Integer.parseInt(answer);
			} else {
				System.out.println("Deine Eingabe war ungueltig");
				return showView();
			}
		}
			
}
