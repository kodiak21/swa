package controller;

import java.util.List;

import model.LanguageType;
import model.Payment;
import model.PersonService;
import model.StatisticService;
import view.QuestionDeleteBookingView;

public class DeleteStatisticAction implements StatisticServiceAction {

	@Override
	public StatisticService action(StatisticService statisticService, PersonService personService) {
		List<Payment> payments;
		LanguageType languageType;
		int answer;
		
		QuestionDeleteBookingView view = new QuestionDeleteBookingView();
		payments = statisticService.getPayments();
		languageType = personService.getPerson().getLanguageType();
		
		if(languageType==LanguageType.GERMAN) {
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
//			StatisticServiceController ssc = new StatisticServiceController();
//			statisticService = ssc.bookingCommand();
			System.out.println("NOCH NICHT IMPLEMENTIERT");
			break;
		default: break;
		}

		return statisticService;
	}

}
