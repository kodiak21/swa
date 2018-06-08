package mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	//Main nach Command Pattern
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("New UserGroup");
		System.out.println("Enter name");
		String name = br.readLine();

		System.out.println("Enter Id");
		Integer i = Integer.parseInt(br.readLine());

		final UserGroup user = new UserGroup();

		final Command userGroupCreated = new UserGroupCommand(user, name, i);

		final UserGroupCreation userGC = new UserGroupCreation();

		userGC.storeAndExecute(userGroupCreated);

	}
}
