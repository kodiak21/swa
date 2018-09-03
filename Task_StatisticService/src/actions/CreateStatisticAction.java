package actions;

import java.util.List;

import model.LanguageType;
import model.Payment;
import model.StatisticService;
import view.QuestionCreateStatisticView;

/**<b> Übergeordneter Service</b>: StatisticService<br>
 * <b> verbundene Views</b>: QuestionCreateStatisticView<br>
 * 
 * <br><b>CreateStatisticAction:</b> Erzeugung einer Statistik nach Auswahl<br>
 * 
 * 
 * @param languageType - Sprachauswahl
 *
 */

public class CreateStatisticAction implements StatisticServiceAction {

	List<Payment> payments;
	
	public CreateStatisticAction(List<Payment> payments) {
		this.payments = payments;
	}
	
	@Override
	public StatisticService action(StatisticService statisticService, LanguageType language) {
		int answer;
		
		QuestionCreateStatisticView questionCreateStatisticView = new QuestionCreateStatisticView();
		
		if(language==LanguageType.GERMAN) {
			answer = questionCreateStatisticView.showViewLanguageGer();
		} else {
			answer = questionCreateStatisticView.showViewLanguageEng();
		}
//		Englisch wurde ausgewaehlt
		if (answer == 1) {
			if(language==LanguageType.GERMAN) {
				answer = questionCreateStatisticView.showViewPaytypeGer();
			} else {
				answer = questionCreateStatisticView.showViewPaytypeEng();
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
				answer = questionCreateStatisticView.showViewPaytypeGer();
			} else {
				answer = questionCreateStatisticView.showViewPaytypeEng();
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
