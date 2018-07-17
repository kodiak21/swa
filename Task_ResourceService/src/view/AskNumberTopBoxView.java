package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskNumberTopBoxView {
	
	public int showViewGer() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("Wie viele Dachgepaecktraeger ?");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (answer.equals("1")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Nur ein Dachgepaecktraeger pro Auto erlaubt");
			return showViewGer();
		}
	}
	
	public int showViewEng() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;

		System.out.println("How many TopBoxes ?");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (answer.equals("1")) {
			return Integer.parseInt(answer);
		} else {
			System.out.println("Only one TopBox per car allowed");
			return showViewEng();
		}
	}
}
