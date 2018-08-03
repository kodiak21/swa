package controller;

import model.LanguageType;
import model.PersonService;
import model.StatisticService;
import view.PrintStatisticView;

public class PrintStatisticAction implements StatisticServiceAction {

	@Override
	public StatisticService action(StatisticService statisticService, PersonService personService) {
		PrintStatisticView printStatisticView = new PrintStatisticView();
		if(personService.getPerson().getLanguage() ==LanguageType.GERMAN) {
			printStatisticView.showViewGer(statisticService.getBookingCount(), statisticService.getPayAmountTotal(), statisticService.getPaymentType(), statisticService.getLanguageType());
		}else {
			printStatisticView.showViewEng(statisticService.getBookingCount(), statisticService.getPayAmountTotal(), statisticService.getPaymentType(), statisticService.getLanguageType());
		}
		return statisticService;
	}

}
