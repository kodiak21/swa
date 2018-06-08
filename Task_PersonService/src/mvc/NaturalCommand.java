package mvc;

import de.leuphana.swa.personService.Person;

public class NaturalCommand implements Command {

	private User theUser;
	private String name;

	public NaturalCommand(final User theUser, final String name) {
		this.theUser = theUser;
		this.name = name;
	}

	@Override
	public void execute() {
		theUser.naturalUserCreated(name);

	}

}
