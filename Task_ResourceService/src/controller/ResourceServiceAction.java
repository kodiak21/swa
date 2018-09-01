package controller;

import java.io.IOException;

import model.LanguageType;
import model.ResourceService;
import model.equipment.ChildSeat;
import model.equipment.TopBox;
import model.resource.Resource;

/**<b> Übergeordneter Service</b>: ResourceService<br>
 * 
 * <br><b>ResourceServiceAction:</b> Interface, wird in allen betreffenden Aktionen des ResourceService implementiert
 * 
 * 
 *
 */

public interface ResourceServiceAction {

	public ResourceService action(ResourceService resourceService, LanguageType languageType) throws IOException;

}
