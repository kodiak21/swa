package de.leuphana.swa.resourceService;

import de.leuphana.swa.resourceService.equipment.ChildSeat;
import de.leuphana.swa.resourceService.equipment.SetTopBox;
import de.leuphana.swa.resourceService.resource.Car;
import de.leuphana.swa.resourceService.resource.Resource;

public class Client {

	//ResourceService nach Decorator Pattern
	
	public static void main(String[] args) {
		
		Resource resource = new Car();
		
		resource = new SetTopBox(new ChildSeat(resource));
		
		resource.getSelectedResource();
		
		System.out.println(" Total Costs: "+ resource.getPrice() + " Euro"); 
		
	}

}
