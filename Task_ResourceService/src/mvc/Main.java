package mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	//Main nach Command Pattern
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("The following cars could be ordered");
		System.out.println("1: normal Car");
		System.out.println("2: Car with Top Box");
		System.out.println("3: Car with ChildSeat");
		System.out.println("4: Car with CildSeat and TopBox");

		System.out.println("Enter Choice:");
		Integer i = Integer.parseInt(br.readLine());

		final ResourcePicked resourcePicked = new ResourcePicked();

		final Command carNormal = new CarCommand();
		final Command carTopBox = new CarTopBoxCommand();
		final Command carChildSeat = new CarChildSeatCommand();
		final Command carTopBoxChildSeat = new CarTopBoxChildSeatCommand();

		final ResourceCreation resourceC = new ResourceCreation();

		switch (i) {
		case 1:
			resourceC.storeAndExecute(carNormal, resourcePicked);
			break;
		case 2:
			resourceC.storeAndExecute(carTopBox, resourcePicked);
			break;
		case 3:
			resourceC.storeAndExecute(carChildSeat, resourcePicked);
			break;
		case 4:
			resourceC.storeAndExecute(carTopBoxChildSeat, resourcePicked);
			break;
		default:
			System.err.println("Argument \"1\" , \"2\" , \"3\" or \"4\" is required.");
			System.exit(-1);
		}
	}
}
