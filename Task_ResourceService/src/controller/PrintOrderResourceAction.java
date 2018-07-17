package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;
import view.PrintMenuView;
import view.PrintOrderView;

public class PrintOrderResourceAction implements ResourceServiceAction {

	PrintOrderView printOrderView;
	Resource resource;
	TopBox topBox;
	ChildSeat childSeat;
	LanguageType languageType;
	int numberChildSeats;
	int numberTopBox;
	String carName;
	BigDecimal childSeatPrice = BigDecimal.ZERO;

	public PrintOrderResourceAction(int numberTopBox, int numberChildSeats, String carName) {
		this.printOrderView = new PrintOrderView();
		this.carName = carName;
		this.numberChildSeats = numberChildSeats;
		this.numberTopBox = numberTopBox;
	}

	@Override
	public ResourceService action(ResourceService resourceService, Resource resource, TopBox topBox,
			ChildSeat childSeat, LanguageType languageType, int numberTopBox, int numberChildSeats) throws IOException {
		if (languageType == LanguageType.GERMAN) {
			
			if (childSeat != null) {
				BigDecimal childSeatPrice = childSeat.getPrice();

				BigDecimal amount = new BigDecimal(numberChildSeats);

				BigDecimal total = getTotalChildSeatPrice(childSeatPrice, amount);

				printOrderView.showGer(resource, topBox, childSeat, total, numberTopBox, numberChildSeats, carName);

			} else if (childSeat == null) {
				BigDecimal total = BigDecimal.ZERO;

				printOrderView.showGer(resource, topBox, childSeat, total, numberTopBox, numberChildSeats, carName);

			}
	
		} else if (languageType == LanguageType.ENGLISH) {

			if (childSeat != null) {
				BigDecimal childSeatPrice = childSeat.getPrice();

				BigDecimal amount = new BigDecimal(numberChildSeats);

				BigDecimal total = getTotalChildSeatPrice(childSeatPrice, amount);

				printOrderView.showEng(resource, topBox, childSeat, total, numberTopBox, numberChildSeats, carName);
			}else if (childSeat == null) {
				BigDecimal total = BigDecimal.ZERO;

				printOrderView.showEng(resource, topBox, childSeat, total, numberTopBox, numberChildSeats, carName);

			}
		}

		return resourceService;
	}

	private BigDecimal getTotalChildSeatPrice(BigDecimal childSeatPrice, BigDecimal amount) {

		BigDecimal total = BigDecimal.ZERO;

		total = childSeatPrice.multiply(amount);

		return total;

	}

}
