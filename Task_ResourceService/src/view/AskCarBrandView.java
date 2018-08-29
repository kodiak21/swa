package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskCarBrandView {

	public int showViewGer() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;

		System.out.println("\tWaehlen Sie die gewuenschte Automarke");
		System.out.println("1: BMW");
		System.out.println("2: Mercedes");
		System.out.println("3: Audi");
		System.out.println("4: Volkswagen");

		try {
			answer = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("");
		
		if (answer == 1 || answer == 2 || answer == 3 || answer == 4) {
			return answer;
		} else {
			System.out.println("\tIhre Eingabe war ungueltig ");
			System.out.println("");
			return showViewGer();
		}

	}

	public int showViewEng() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;

		System.out.println("\tPlease choose your favorite CarBrand");
		System.out.println("1: BMW");
		System.out.println("2: Mercedes");
		System.out.println("3: Audi");
		System.out.println("4: Volkswagen");

		try {
			answer = Integer.parseInt(br.readLine());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("");
		
		if (answer == 1 || answer == 2 || answer == 3 || answer == 4) {
			return answer;
		} else {
			System.out.println("\tWrong Entry ");
			System.out.println("");
			return showViewEng();
		}

	}

}
