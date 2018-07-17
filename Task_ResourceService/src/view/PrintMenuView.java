package view;

import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class PrintMenuView {

	public void showGer(Resource resource, TopBox topBox, ChildSeat childSeat) {

		System.out.println("Unsere Auswahl:");
		System.out.println("Auto : " + resource.getPrice());
		System.out.println("Dachgepaecktraeger : " + topBox.getPrice());
		System.out.println("Kindersitz : " + childSeat.getPrice());
	}
	
	public void showEng(Resource resource, TopBox topBox, ChildSeat childSeat) {

		System.out.println("Your choices: ");
		System.out.println("Car : " + resource.getPrice());
		System.out.println("TopBox : " + topBox.getPrice());
		System.out.println("ChildSeat : " + childSeat.getPrice());
	}
}
