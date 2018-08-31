package controller;

import java.util.List;

import model.LanguageType;
import model.Payment;
import model.StatisticService;
import view.QuestionCreateStatisticView;

public class CreateStatisticAction implements StatisticServiceAction {

	List<Payment> payments;
	
	public CreateStatisticAction(List<Payment> payments) {
		this.payments = payments;
	}
	
	@Override
	public StatisticService action(StatisticService statisticService, LanguageType language) {
		int answer;
		
		QuestionCreateStatisticView view = new QuestionCreateStatisticView();
		
		if(language==LanguageType.GERMAN) {
			answer = view.showViewLanguageGer();
		} else {
			answer = view.showViewLanguageEng();
		}
//		Englisch wurde ausgewaehlt
		if (answer == 1) {
			if(language==LanguageType.GERMAN) {
				answer = view.showViewPaytypeGer();
			} else {
				answer = view.showViewPaytypeEng();
			}
			switch (answer) {
			case 1:	
//				MoneyWallet
				statisticService.setEnglishBookingsPaidByMoneyWallet(payments);
				break;
			case 2:	
//				Paypal
				statisticService.setEnglishBookingsPaidByPayPal(payments);
				break;
			case 3:	
//				GogleWallet
				statisticService.setEnglishBookingsPaidByGoogleWallet(payments);
				break;
			}
//		Deutsch wurde ausgewaehlt
		}else {
			if(language==LanguageType.GERMAN) {
				answer = view.showViewPaytypeGer();
			} else {
				answer = view.showViewPaytypeEng();
			}
			switch (answer) {
			case 1:	
//				MoneyWallet
				statisticService.setGermanBookingsPaidByMoneyWallet(payments);
				break;
			case 2:	
//				Paypal
				statisticService.setGermanBookingsPaidByPayPal(payments);
				break;
			case 3:	
//				GogleWallet
				statisticService.setGermanBookingsPaidByGoogleWallet(payments);
				break;
			}
		}

		return statisticService;
	}
}
