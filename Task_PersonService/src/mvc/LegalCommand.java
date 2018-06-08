package mvc;

public class LegalCommand implements Command {

	private User theUser;
	private String name;
	
	public LegalCommand(final User theUser, final String name) {
	      this.theUser = theUser;
	      this.name = name;
	   }

	
	@Override
	public void execute() {
		theUser.legalUserCreated(name);
	}

}
