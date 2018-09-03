package actions;

import model.LanguageType;
import model.StatisticService;
import view.FareWellStatisticView;

/**<b> Übergeordneter Service</b>: StatisticService<br>
 * <b> verbundene Views</b>: FareWellStatisticView<br>
 * <br><b>FareWellStatisticAction:</b> Der Kunde wird verabschiedet bei Abbruch und Beenden des StatisticService und Gesamtprogramm
 * 
 * 
 *
 */

public class FareWellStatisticAction implements StatisticServiceAction {

	private FareWellStatisticView fareWellStatisticView;
	
	public FareWellStatisticAction() {
		this.fareWellStatisticView = new FareWellStatisticView();
	}
	
	@Override
	public StatisticService action(StatisticService statisticService, LanguageType language) {
		if(language ==LanguageType.GERMAN) {
			fareWellStatisticView.showViewGer();
			System.exit(0);
		}else if(language==LanguageType.ENGLISH) {
			fareWellStatisticView.showViewEng();
			System.exit(0);
		}
		return statisticService;
	}

}
