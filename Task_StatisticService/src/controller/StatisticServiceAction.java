package controller;

import model.PersonService;
import model.StatisticService;

public interface StatisticServiceAction {
	public StatisticService action(StatisticService statisticService, PersonService personService);
}
