package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskCarBrandView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name = null;
	
	public String showViewGer() throws IOException {
		System.out.println("Welcher Markenname ?");
		
		String carName = br.readLine();
		
		return carName;
		
	}

	public String showViewEng() throws IOException {
		System.out.println("Which car Brand ?");
		
		String carName = br.readLine();
		
		return carName;
		
	}

}
