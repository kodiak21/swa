package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

public interface ResourceServiceAction {

	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException;

}
