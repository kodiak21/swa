package mvc;

public class CarTopBoxChildSeatCommand implements Command {
	
	@Override
	public void execute(ResourcePicked resourcePicked) {
		resourcePicked.carwithTopBoxChildSeatOrdered();

	}

}
