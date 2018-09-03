package controller;

import java.util.List;

import actions.CreateStatisticAction;
import actions.DeleteStatisticAction;
import actions.FareWellStatisticAction;
import actions.PrintStatisticAction;
import model.LanguageType;
import model.Payment;
import model.StatisticService;

/**<b> Übergeordneter Service</b>: StatisticService<br>
 * 
 * <br><b>StatisticServiceController:</b> Controller, der alle StatisticService bezogenen Aktionen verwaltet<br> 
 * 
 * <br><b>verwaltete Aktionen:</b> Funktionen werden in den einzelnen Klassen erläutert<br>
 *
 *<br> - CreateStatisticAction
 *<br> - PrintStatisticAction
 *<br> - DeleteStatisticAction
 *<br> - FareWellStatisticAction
 * 
 * 
 *
 */


public class StatisticServiceController {
	
	public StatisticService statisticCommand (List<Payment> payments, LanguageType language) {
		StatisticService statisticService = new StatisticService();
		
		CreateStatisticAction createStatisticAction = new CreateStatisticAction(payments);
		statisticService = createStatisticAction.action(statisticService, language);
		
		PrintStatisticAction printStatisticAction = new PrintStatisticAction();
		statisticService = printStatisticAction.action(statisticService, language);
		
		DeleteStatisticAction deleteStatisticAction = new DeleteStatisticAction();
		statisticService = deleteStatisticAction.action(statisticService, language);

		if(statisticService.getDeleteAnswer()==2) {
			FareWellStatisticAction fareWellStatisticAction = new FareWellStatisticAction();
			statisticService = fareWellStatisticAction.action(statisticService, language);
		}
		
		return statisticService;
	}
}
