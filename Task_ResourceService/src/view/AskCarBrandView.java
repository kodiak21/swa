package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskCarBrandView {

	public int showViewGer() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;

		System.out.println("Waehlen Sie die gewünschte Automarke");
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

		if (answer == 1 || answer == 2 || answer == 3 || answer == 4) {
			return answer;
		} else {
			System.out.println("Ihre Eingabe war ungueltig ");
			return showViewGer();
		}

	}

	public int showViewEng() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;

		System.out.println("Please choose your favorite CarBrand");
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
		
		if (answer == 1 || answer == 2 || answer == 3 || answer == 4) {
			return answer;
		} else {
			System.out.println("Wrong Entry ");
			return showViewEng();
		}

	}

}
