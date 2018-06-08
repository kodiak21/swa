package mvc;

public class CarCommand implements Command {
	
	@Override
	public void execute(ResourcePicked resourcePicked) {
		
		resourcePicked.carOrdered();

	}

	

}
