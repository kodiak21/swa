package controller;

import java.util.List;

import model.LanguageType;
import model.Payment;
import model.StatisticService;
import view.QuestionDeleteBookingView;

public class DeleteStatisticAction implements StatisticServiceAction {

	@Override
	public StatisticService action(StatisticService statisticService, LanguageType language) {
		List<Payment> payments;
		int answer;
		
		QuestionDeleteBookingView view = new QuestionDeleteBookingView();
		payments = statisticService.getPayments();
		
		if(language==LanguageType.GERMAN) {
			answer = view.showViewGer();
		} else {
			answer = view.showViewEng();
		}
		
		
		switch (answer) {
		case 1:	
			break;
		case 2:	
			statisticService.deleteStatistic();
			break;
		case 3:	
			statisticService.deleteStatistic();
			StatisticServiceController ssc = new StatisticServiceController();
			statisticService = ssc.statisticCommand(payments, language);
			break;
		default: break;
		}

		return statisticService;
	}

}
