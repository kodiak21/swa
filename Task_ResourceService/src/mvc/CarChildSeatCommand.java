package mvc;

public class CarChildSeatCommand implements Command {
	
	@Override
	public void execute(ResourcePicked resourcePicked) {
		
		resourcePicked.carwithChildSeatOrdered();

	}

}
