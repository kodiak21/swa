package controller;

import model.LanguageType;
import model.StatisticService;

public interface StatisticServiceAction {
	public StatisticService action(StatisticService statisticService, LanguageType language);
}
