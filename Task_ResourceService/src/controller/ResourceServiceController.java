package controller;

import java.io.IOException;
import java.math.BigDecimal;

import actions.AskCarBrandAction;
import actions.AskCarOrderAction;
import actions.AskChildSeatOrderAction;
import actions.AskDeleteResourceAction;
import actions.AskNumberChildSeatAction;
import actions.AskTopBoxOrderAction;
import actions.FareWellResourceAction;
import actions.PrintMenuResourceAction;
import actions.PrintOrderResourceAction;
import actions.SetResourcePriceAction;
import model.BookingService;
import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * 
 * <br><b>ResourceServiceController:</b> Controller, der alle ResourceService bezogenen Aktionen verwaltet<br> 
 * 
 * <br><b>verwaltete Aktionen:</b> Funktionen werden in den einzelnen Klassen erläutert<br>
 *
 *
 * <br> - SetResourcePriceAction
 * <br> - PrintMenuResourceAction
 * <br> - AskCarOrderAction
 * <br> - AskCarBrandAction
 * <br> - AskTopBoxOrderAction
 * <br> - AskChildSeatOrderAction
 * <br> - AskNumberChildSeatAction
 * <br> - PrintOrderResourceAction
 * <br> - AskDeleteResourceAction
 * <br> - FareWellResourceAction
 * 
 *
 */
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
