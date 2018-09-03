package actions;

import actions.OrganisationServiceAction;
import model.LanguageType;
import model.OrganisationService;
import view.PrintUserView;

public class PrintUserAction implements OrganisationServiceAction {

	@Override
	public OrganisationService action(OrganisationService organisationService) {
		PrintUserView printUserView = new PrintUserView();
		if (organisationService.getUser().getPerson().getLanguageType() == LanguageType.GERMAN) {
			printUserView.showViewGer(organisationService.getUser());
		}else if(organisationService.getUser().getPerson().getLanguageType() == LanguageType.ENGLISH) {
			printUserView.showViewEng(organisationService.getUser());
		}
		return organisationService;
	}

}
