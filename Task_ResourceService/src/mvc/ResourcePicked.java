package mvc;

import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.SetTopBox;
import de.leuphana.swa.resourceService.resource.Car;

public class ResourcePicked {

	private de.leuphana.swa.resourceService.resource.Resource resource = new Car();
	
	public void carOrdered() {    	
		System.out.println("Car is ordered");
		System.out.println("the price is " + resource.getPrice());
	}

	public void carwithSetTopOrdered() {
		resource = new SetTopBox(resource);
		System.out.println("Car with TopBox is ordered");
		System.out.println("the price is " + resource.getPrice());
		
	}
	
	public void carwithChildSeatOrdered() {
		resource = new ChildSeat(resource);
		System.out.println("Car with ChildSeat is ordered");
		System.out.println("the price is " + resource.getPrice());
		
	}
	
	public void carwithTopBoxChildSeatOrdered() {
		resource = new ChildSeat(new SetTopBox(resource));
		System.out.println("Car with ChildSeat and TopBox is ordered");
		System.out.println("the price is " + resource.getPrice());
		
	}
}
