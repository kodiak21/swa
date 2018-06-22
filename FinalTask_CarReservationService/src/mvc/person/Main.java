package mvc.person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mvc.organisation.CommandGroup;
import mvc.organisation.UserGroup;
import mvc.organisation.UserGroupCommand;

public class Main {

	// Main nach Command Pattern

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name");
		String name = br.readLine();

		System.out.println("The user named " + name + " can be a natural or a legal person");
		System.out.println("1: natural person");
		System.out.println("2: legal person");

		System.out.println("Enter Choice:");
		Integer i = Integer.parseInt(br.readLine());

		final User user = new User();

		final Command natural = new NaturalCommand(user, name);
		final Command legal = new LegalCommand(user, name);
		final UserCreation userC = new UserCreation();

		switch (i) {
		case 1:
			userC.storeAndExecute(natural);
			break;
		case 2:
			userC.storeAndExecute(legal);
			break;
		default:
			System.err.println("Argument \"1\" or \"2\" is required.");
			System.exit(-1);
		}
	}
}
