package de.leuphana.swa.statisticService;

abstract class Visitor {

	abstract void visit(EnglishBooking eb);
	abstract void visit(GermanBooking gb);
	
}
