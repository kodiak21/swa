package controller;

import java.util.List;

import model.LanguageType;
import model.Payment;
import model.StatisticService;
import view.QuestionDeleteStatisticView;

public class DeleteStatisticAction implements StatisticServiceAction {

	@Override
	public StatisticService action(StatisticService statisticService, LanguageType language) {
		List<Payment> payments;

		int answer;
		
		QuestionDeleteStatisticView questionDeleteStatisticView = new QuestionDeleteStatisticView();
		payments = statisticService.getPayments();

		
		if(language==LanguageType.GERMAN) {
			statisticService.setDeleteAnswer(questionDeleteStatisticView.showViewGer());
		} else {
			statisticService.setDeleteAnswer(questionDeleteStatisticView.showViewEng());
		}
		
		answer = statisticService.getDeleteAnswer();
		
		switch (answer) {
		case 1:	
			statisticService.deleteStatistic();
			StatisticServiceController ssc = new StatisticServiceController();
			statisticService = ssc.statisticCommand(payments, language);
			break;
		case 2:	
			statisticService.deleteStatistic();
			break;
		default: break;
		}

		return statisticService;
	}

}
