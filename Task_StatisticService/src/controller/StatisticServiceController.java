package controller;

import java.util.List;

import model.LanguageType;
import model.Payment;
import model.StatisticService;

public class StatisticServiceController {
	
	public StatisticService statisticCommand (List<Payment> payments, LanguageType language) {
		StatisticService statisticService = new StatisticService();
		
		CreateStatisticAction createStatisticAction = new CreateStatisticAction(payments);
		statisticService = createStatisticAction.action(statisticService, language);
		
		DeleteStatisticAction deleteStatisticAction = new DeleteStatisticAction();
		statisticService = deleteStatisticAction.action(statisticService, language);
		
		PrintStatisticAction printStatisticAction = new PrintStatisticAction();
		statisticService = printStatisticAction.action(statisticService, language);
		return statisticService;
	}
}
