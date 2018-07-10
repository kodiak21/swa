package de.leuphana.swa.resourceService.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskCarOrderView {
	
	public AskCarOrderView() throws IllegalArgumentException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;

		while (answer != 1 && answer != 2) {
			try {
				System.out.println("Do you want to order a car ?");
				System.out.println("1: yes");
				System.out.println("2: no");
				try {
					answer = Integer.parseInt(br.readLine());
				}catch(IOException e) {
					e = new IOException("Wrong Number, try again !");
					System.out.println(e.getMessage());
				}
			} catch (IllegalArgumentException e) {
				e = new IllegalArgumentException("Wrong Input, try again !");
				System.out.println(e.getMessage());
			}
		}

	}
}
