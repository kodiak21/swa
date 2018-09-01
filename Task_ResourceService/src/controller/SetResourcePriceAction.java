package controller;

import java.math.BigDecimal;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Car;
import model.resource.Resource;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * 
 * <br>
 * <b>SetResourcePriceAction:</b> Setzen der jeweiligen Preise für die angebotenen Produkte<br> 
 * 
 * 
 *
 */

public class SetResourcePriceAction implements ResourceServiceAction {

	ResourceService resourceService = new ResourceService();

	Resource resource = null;
	TopBox topBox = null;
	ChildSeat childSeat = null;

	BigDecimal resourcePrice = new BigDecimal("400");
	BigDecimal topBoxPrice = new BigDecimal("120");
	BigDecimal childSeatPrice = new BigDecimal("50");

	@Override
	public ResourceService action(ResourceService resourceService, LanguageType languageType) {

		if (resource == null && topBox == null && childSeat == null) {

			resource = new Car();
			topBox = new TopBox(resource);
			childSeat = new ChildSeat(resource);

			resource.setPrice(resourcePrice);

			topBox.setPrice(topBoxPrice);

			childSeat.setPrice(childSeatPrice);

			resourceService.setCarResource(resource);
			resourceService.setTopBoxResource(topBox);
			resourceService.setChildSeatResource(childSeat);
		}else if(resource != null || topBox != null || childSeat != null) {
			resource = resourceService.getCarResource();
			topBox = resourceService.getTopBoxResource();
			childSeat = resourceService.getChildSeatResource();
			
			
				resource.setPrice(resourcePrice);
		
			
			if(topBox!=null)
				topBox.setPrice(topBoxPrice);
			
			if(childSeat!=null)
			childSeat.setPrice(childSeatPrice);

			resourceService.setCarResource(resource);
			resourceService.setTopBoxResource(topBox);
			resourceService.setChildSeatResource(childSeat);
		}

		return resourceService;
	}

}
