package controller;

import model.OrganisationService;

/**<b> Übergeordneter Service</b>: OrganisationService<br>
 * 
 * <br><b>OrganisationServiceAction:</b> Interface, wird in allen betreffenden Actions implementiert
 * 
 * 
 *
 */

public interface OrganisationServiceAction {
		public OrganisationService action(OrganisationService organisationService);
}
