package controller;

import java.io.IOException;
import java.math.BigDecimal;

import model.BookingService;
import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;

public class ResourceServiceController {

	private LanguageType languageType;

	public ResourceService resourcePlanning(LanguageType languageType) throws IllegalArgumentException, IOException {

		ResourceService resourceService = new ResourceService();

		SetResourcePriceAction setResourcePriceAction = new SetResourcePriceAction();
		
		FareWellResourceAction fareWellResourceAction = new FareWellResourceAction();
		
		PrintMenuResourceAction printMenuResourceAction = new PrintMenuResourceAction();
		resourceService = setResourcePriceAction.action(resourceService, languageType);
		resourceService = printMenuResourceAction.action(resourceService, languageType);

		resourceService = setResourcePriceAction.action(resourceService, languageType);
		
		AskCarOrderAction askCarOrderAction = new AskCarOrderAction();
		resourceService = askCarOrderAction.action(resourceService, languageType);
		
		if (resourceService.getCarResourceAnswer() == 1) {
			AskCarBrandAction askCarBrandAction = new AskCarBrandAction();
			resourceService = askCarBrandAction.action(resourceService, languageType);

			AskTopBoxOrderAction askTopBoxOrderAction = new AskTopBoxOrderAction();
			resourceService = askTopBoxOrderAction.action(resourceService, languageType);

			if (resourceService.getTopBoxResourceAnswer() == 1) {
				AskNumberTopBoxAction askNumberTopBoxAction = new AskNumberTopBoxAction();
				resourceService = askNumberTopBoxAction.action(resourceService, languageType);
			}

			AskChildSeatOrderAction askChildSeatOrderAction = new AskChildSeatOrderAction();
			resourceService = askChildSeatOrderAction.action(resourceService, languageType);

			if (resourceService.getChildSeatResourceAnswer() == 1) {
				AskNumberChildSeatAction askNumberChildSeatAction = new AskNumberChildSeatAction();
				resourceService = askNumberChildSeatAction.action(resourceService, languageType);
			}
			
			PrintOrderResourceAction printOrderResourceAction = new PrintOrderResourceAction(
					resourceService.getChildSeatQuantity(),
					resourceService.getCarResource(),
					resourceService.getTopBoxResource(),
					resourceService.getChildSeatResource(),
					resourceService.getCarBrand());
			resourceService = setResourcePriceAction.action(resourceService, languageType);
			resourceService = printOrderResourceAction.action(resourceService, languageType);
			
			AskDeleteResourceAction askDeleteResourceAction = new AskDeleteResourceAction();
			resourceService = askDeleteResourceAction.action(resourceService, languageType);
			if(resourceService.getConfirmAnswer()==2) {
				
				resourceService = fareWellResourceAction.action(resourceService, languageType);
			}
		}else if(resourceService.getCarResourceAnswer()==2) {
			
			resourceService = fareWellResourceAction.action(resourceService, languageType);
			
		}
		
		return resourceService;
	}

}
