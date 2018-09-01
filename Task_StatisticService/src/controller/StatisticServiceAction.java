package controller;

import model.LanguageType;
import model.StatisticService;

/**<b> Übergeordneter Service</b>: StatisticService<br>
 * 
 * <br><b>StatisticServiceAction:</b> Interface, wird in allen betreffenden Aktionen des StatisticService implementiert
 * 
 * 
 *
 */

public interface StatisticServiceAction {
	public StatisticService action(StatisticService statisticService, LanguageType language);
}
