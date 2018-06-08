package mvc.organisation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// Main nach Command Pattern

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("New UserGroup");
		System.out.println("Enter name");
		String name = br.readLine();

		System.out.println("Enter Id");
		Integer i = Integer.parseInt(br.readLine());

		final UserGroup userGroup = new UserGroup();

		final CommandGroup userGroupCreated = new UserGroupCommand(userGroup, name, i);

		final UserGroupCreation userGC = new UserGroupCreation();
		userGC.storeAndExecute(userGroupCreated);

	}
}
