package model.equipment;

import model.resource.Resource;

public abstract class Equipment implements Resource{
	protected Resource resource;
	
	public Equipment(Resource resource) {
		this.resource = resource;
	}
}
