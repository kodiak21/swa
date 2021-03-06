package actions;

import model.LanguageType;
import model.StatisticService;
import view.PrintStatisticView;

/**<b> Übergeordneter Service</b>: StatisticService<br>
 * <b> verbundene Views</b>: PrintStatisticView<br>
 * <br>
 * <b>PrintStatisticAction:</b> Ausgabe der jeweiligen Statistik<br>
 * 
 * 
 * 
 * 
 * 
 *
 */


public class PrintStatisticAction implements StatisticServiceAction {

	@Override
	public StatisticService action(StatisticService statisticService, LanguageType language) {
		PrintStatisticView printStatisticView = new PrintStatisticView();
		if(language ==LanguageType.GERMAN) {
			printStatisticView.showViewGer(statisticService.getBookingCount(), statisticService.getPayAmountTotal(), statisticService.getPaymentType(), statisticService.getLanguageType());
		}else {
			printStatisticView.showViewEng(statisticService.getBookingCount(), statisticService.getPayAmountTotal(), statisticService.getPaymentType(), statisticService.getLanguageType());
		}
		return statisticService;
	}

}
