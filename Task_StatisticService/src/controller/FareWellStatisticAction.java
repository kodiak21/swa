package controller;

import model.LanguageType;
import model.StatisticService;
import view.FareWellStatisticView;

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
