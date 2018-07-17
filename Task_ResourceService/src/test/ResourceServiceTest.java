package test;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.AskDeleteResourceAction;
import controller.PrintMenuResourceAction;
import controller.PrintOrderResourceAction;
import controller.ResourceServiceAction;
import controller.SetResourcePriceAction;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;
import view.AskCarBrandView;
import view.AskCarOrderView;
import view.AskChildSeatView;
import view.AskDeleteResourceView;
import view.AskNumberChildSeatView;
import view.AskNumberTopBoxView;
import view.AskTopBoxView;

class ResourceServiceTest {

	ResourceService resourceService = new ResourceService();
	ResourceServiceAction action;

	Resource resource = new Car();
	TopBox topBox = new TopBox(resource);
	ChildSeat childSeat = new ChildSeat(resource);

	LanguageType languageType = LanguageType.ENGLISH;

	int answer1, answer2, answer3, answer4, answer5;

	String carName;
	int childSeats;
	int numberTopBox;

	@BeforeEach
	void setUp() throws Exception {
		action = new SetResourcePriceAction(resource, topBox, childSeat, new BigDecimal("500.00"),
				new BigDecimal("120.00"), new BigDecimal("40.00"));
		resourceService = action.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox,
				childSeats);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws IllegalArgumentException, IOException {

		SetResourcePriceAction action = new SetResourcePriceAction(resource, topBox, childSeat, new BigDecimal("400"),
				new BigDecimal("120"), new BigDecimal("40"));

		PrintMenuResourceAction action2 = new PrintMenuResourceAction();
		resourceService = action2.action(resourceService, resource, topBox, childSeat, languageType, numberTopBox,
				childSeats);

		AskCarOrderView askCarOrderView = new AskCarOrderView();
		AskCarBrandView askCarBrandView = new AskCarBrandView();
		AskTopBoxView askTopBoxView = new AskTopBoxView();
		AskNumberTopBoxView askNumberTopBoxView = new AskNumberTopBoxView();
		AskNumberChildSeatView askNumberChildSeatView = new AskNumberChildSeatView();
		AskChildSeatView askChildSeatView = new AskChildSeatView();
		
		if (languageType == LanguageType.GERMAN) {

			// Bestellung Auto

			answer1 = askCarOrderView.showViewGer();

			// Antwort Ja

			if (answer1 == 1) {
				resource = new Car();

				// Markenname

				carName = askCarBrandView.showViewGer();

				// Bestellung Dachgepaecktraeger

				answer2 = askTopBoxView.showViewGer();

				// Antwort Ja TopBox

				if (answer2 == 1) {
					topBox = new TopBox(resource);
					answer3 = askNumberTopBoxView.showViewGer();
					numberTopBox = 1;
					// Bestellung Kindersitze

					// Antwort Ja ChildSeats

					answer4 = askChildSeatView.showViewGer();
					if (answer4 == 1) {
						answer5 = askNumberChildSeatView.showViewGer();
						childSeats = answer5;

						childSeat = new ChildSeat(new TopBox(resource));

						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						// Antwort Nein ChildSeat
					} else if (answer4 == 2) {
						childSeats = 0;

						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
					}

					// Antwort Nein TopBox
				} else if (answer2 == 2) {

					numberTopBox = 0;

					topBox.setPrice(BigDecimal.ZERO);

					topBox = null;

					answer4 = askChildSeatView.showViewGer();
					if (answer4 == 1) {
						answer5 = askNumberChildSeatView.showViewGer();
						childSeats = answer5;
						numberTopBox = 1;
						childSeat = new ChildSeat(new TopBox(resource));

						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
					} else if (answer4 == 2) {
						childSeats = 0;
						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
					}
				}

				// Antwort Nein Car
			} else if (answer1 == 2) {
				resource = null;
				topBox = null;
				childSeat = null;
				childSeats = 0;
				numberTopBox = 0;

				PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, answer4, carName);
				resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
						numberTopBox, childSeats);
				AskDeleteResourceAction action4 = new AskDeleteResourceAction();
				resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
						numberTopBox, childSeats);
			}
		} else if (languageType == LanguageType.ENGLISH) {
			// Bestellung Auto

			answer1 = askCarOrderView.showViewEng();

			// Antwort Ja

			if (answer1 == 1) {
				resource = new Car();

				// Markenname

				carName = askCarBrandView.showViewEng();

				// Bestellung Dachgepaecktraeger

				answer2 = askTopBoxView.showViewEng();

				// Antwort Ja TopBox

				if (answer2 == 1) {
					topBox = new TopBox(resource);
					answer3 = askNumberTopBoxView.showViewEng();
					numberTopBox = 1;
					// Bestellung Kindersitze

					// Antwort Ja ChildSeats

					answer4 = askChildSeatView.showViewEng();
					if (answer4 == 1) {
						answer5 = askNumberChildSeatView.showViewEng();
						childSeats = answer5;

						childSeat = new ChildSeat(new TopBox(resource));

						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);

						// Antwort Nein ChildSeat
					} else if (answer4 == 2) {
						childSeats = 0;

						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
					}

					// Antwort Nein TopBox
				} else if (answer2 == 2) {

					numberTopBox = 0;

					topBox.setPrice(BigDecimal.ZERO);

					topBox = null;

					answer4 = askChildSeatView.showViewEng();
					if (answer4 == 1) {
						answer5 = askNumberChildSeatView.showViewEng();
						childSeats = answer5;
						numberTopBox = 1;
						childSeat = new ChildSeat(new TopBox(resource));

						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
					} else if (answer4 == 2) {
						childSeats = 0;
						resourceService = action.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, childSeats, carName);
						resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
						AskDeleteResourceAction action4 = new AskDeleteResourceAction();
						resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
								numberTopBox, childSeats);
					}
				}

				// Antwort Nein Car
			} else if (answer1 == 2) {
				resource = null;
				topBox = null;
				childSeat = null;
				childSeats = 0;
				numberTopBox = 0;

				PrintOrderResourceAction action3 = new PrintOrderResourceAction(1, answer4, carName);
				resourceService = action3.action(resourceService, resource, topBox, childSeat, languageType,
						numberTopBox, childSeats);
				AskDeleteResourceAction action4 = new AskDeleteResourceAction();
				resourceService = action4.action(resourceService, resource, topBox, childSeat, languageType,
						numberTopBox, childSeats);
			}
		}

	}

}
