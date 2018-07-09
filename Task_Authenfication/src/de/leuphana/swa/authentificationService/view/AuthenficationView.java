package de.leuphana.swa.authentificationService.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.leuphana.swa.authentificationService.AuthenficationStrategy;
import de.leuphana.swa.personService.PersonType;

public class AuthenficationView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int printAuthentificateChoice(PersonType personType, String name) throws IOException {

		System.out.println("Person with name: " + name + " should be identified by");
		if(personType==PersonType.NATURALPERSON) {
			System.out.println("1: Username");
			System.out.println("2: Eyescan");
			System.out.println("3: Fingerprint");
		}else if(personType==PersonType.LEGALPERSON) {
			System.out.println("1: Username");
		}
		
		int i = Integer.parseInt(br.readLine());
		
		return i;
	}
	
	public void printAuthentificationStrategy(AuthenficationStrategy method) {
		method.authenficateSubject();
	}


}
