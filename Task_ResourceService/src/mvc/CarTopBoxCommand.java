package mvc;

public class CarTopBoxCommand implements Command {
	
	@Override
	public void execute(ResourcePicked resourcePicked) {
		
		resourcePicked.carwithSetTopOrdered();

	}

}
