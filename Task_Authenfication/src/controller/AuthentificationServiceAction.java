package controller;

import model.AuthentificationService;

/**<b> Übergeordneter Service</b>: AuthentificationService<br>
 * 
 * <br><b>AuthentificationServiceAction:</b> Interface, wird in allen betreffenden Aktionen des AuthentificationService implementiert
 * 
 * 
 *
 */

public interface AuthentificationServiceAction {
	public AuthentificationService action(AuthentificationService authentificationService);
}
