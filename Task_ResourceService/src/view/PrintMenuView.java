package view;

import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public class PrintMenuView {

	public void showGer(Resource resource, TopBox topBox, ChildSeat childSeat) {
		System.out.println("\t**********************************");
		System.out.println("\tIhre Auswahl:");
		System.out.println("\tAuto : " + resource.getPrice());
		System.out.println("\tDachgepaecktraeger : " + topBox.getPrice());
		System.out.println("\tKindersitz : " + childSeat.getPrice());
		System.out.println("\t**********************************");
		System.out.println("");
	}
	
	public void showEng(Resource resource, TopBox topBox, ChildSeat childSeat) {
		System.out.println("\t**********************************");
		System.out.println("\tYour choices: ");
		System.out.println("\tCar : " + resource.getPrice());
		System.out.println("\tTopBox : " + topBox.getPrice());
		System.out.println("\tChildSeat : " + childSeat.getPrice());
		System.out.println("\t**********************************");
		System.out.println("");
	}
}
