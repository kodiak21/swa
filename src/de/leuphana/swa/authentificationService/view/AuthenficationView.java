package de.leuphana.swa.authentificationService.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import model.PersonType;

public class AuthenficationView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int printAuthentificateChoice(PersonType personType, String name) throws IOException {

		int answer = 0;
		
		System.out.println("Person with name: " + name + " should be identified by");
		if(personType==PersonType.NATURALPERSON) {
			System.out.println("1: Username");
			System.out.println("2: Eyescan");
			System.out.println("3: Fingerprint");
			answer = Integer.parseInt(br.readLine());
		}else if(personType==PersonType.LEGALPERSON) {
			System.out.println("Username");
			answer = 1;
		}
		
		return answer;
	}
	
	public void printAuthentificationStrategy(AuthenficationStrategy method) {
		method.authenficateSubject();
	}


}
