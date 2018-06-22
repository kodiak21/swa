package mvc.person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import de.leuphana.swa.authentificationService.AuthenficationMethod;
import de.leuphana.swa.authentificationService.AuthentificationMethodFactory;
import de.leuphana.swa.authentificationService.CredentialType;
import mvc.organisation.CommandGroup;
import mvc.organisation.UserGroup;
import mvc.organisation.UserGroupCommand;
import mvc.organisation.UserGroupCreation;

public class MainSuper {

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
		
		System.out.println("New UserGroup");
		System.out.println("Enter name");
		String nameGroup = br.readLine();

		System.out.println("Enter Id");
		i = Integer.parseInt(br.readLine());

		final UserGroup userGroup = new UserGroup();

		final CommandGroup userGroupCreated = new UserGroupCommand(userGroup, nameGroup, i);

		final UserGroupCreation userGC = new UserGroupCreation();
		userGC.storeAndExecute(userGroupCreated);
		
		System.out.println("Should " + name + " be added to Group " + nameGroup );
		System.out.println("1: yes");
		System.out.println("2: no");

		System.out.println("Enter Choice:");
		i = Integer.parseInt(br.readLine());

		List<User> users = new ArrayList<User>();
		
		switch (i) {
		case 1:
			users.add(user);
			System.out.println(name + " added to Group " + nameGroup);
			break;
		case 2:
			System.out.println(name + " not added to Group " + nameGroup);
			break;
		default:
			System.err.println("Argument \"1\" or \"2\" is required.");
			System.exit(-1);
		}
		
		System.out.println("Authentification ");
		System.out.println(name + " can be authenficated by ");
		System.out.println("1: Username ");
		System.out.println("2: FingerPrint ");
		System.out.println("3: EyeScan ");
		
		System.out.println("Enter Choice:");
		i = Integer.parseInt(br.readLine());
		
		CredentialType credentialType;
		AuthenficationMethod text;
		
		switch(i) {
		case 1: 
			credentialType = CredentialType.USERNAME;	
			text = AuthentificationMethodFactory.getAuthenticationMethod(credentialType);
			System.out.println(name + " is " + text);
			break;
		case 2:
			credentialType = CredentialType.FINGERPRINT;	
			text = AuthentificationMethodFactory.getAuthenticationMethod(credentialType);
			System.out.println(name + " is " + text);
			break;
		case 3:
			credentialType = CredentialType.EYESCAN;
			text = AuthentificationMethodFactory.getAuthenticationMethod(credentialType);
			System.out.println(name + " is " + text);
			break;
		default:
			System.err.println("Argument \"1\" , \"2\" or \"3\" is required.");
			System.exit(-1);
		}
		
	}
}
