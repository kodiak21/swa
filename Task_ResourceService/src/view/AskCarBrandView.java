package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskCarBrandView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name = null;
	
	public int showViewGer() throws IOException {
		System.out.println("Wählen Sie die gewünschte Automarke");
		System.out.println("1: BMW");
		System.out.println("2: Mercedes");
		System.out.println("3: Audi");
		System.out.println("4: Volkswagen");
		
		int answer = Integer.parseInt(br.readLine());
		
		return answer;
		
	}

	public int showViewEng() throws IOException {
		System.out.println("Please choose your favorite CarBrand");
		System.out.println("1: BMW");
		System.out.println("2: Mercedes");
		System.out.println("3: Audi");
		System.out.println("4: Volkswagen");
		
		int answer = Integer.parseInt(br.readLine());
		
		return answer;
		
	}

}
