package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public abstract class Equipment implements Resource{
	protected Resource resource;
	
	public Equipment(Resource resource) {
		this.resource = resource;
	}
}
