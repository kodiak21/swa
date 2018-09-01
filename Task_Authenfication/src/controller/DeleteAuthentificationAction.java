package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.QuestionConfirmView;

/**<b> Übergeordneter Service</b>: AuthentificationService<br>
 * <b> verbundene Views</b>: QuestionConfirmView<br>
 * <br>
 * <b>DeleteAuthentificationAction:</b> Abfrage ob Auswahl des Kunden korrekt ist<br>
 * 
 * 
 * 
 *
 */

public class DeleteAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	QuestionConfirmView questionConfirmView;

	public DeleteAuthentificationAction(Person person) {
		this.person = person;
		this.questionConfirmView = new QuestionConfirmView();
	}

	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {

		QuestionConfirmView questionConfirmView = new QuestionConfirmView();

		if (person.getLanguageType() == LanguageType.GERMAN) {
			authentificationService.setDeleteAnswer(questionConfirmView.showViewGer());
		}else if(person.getLanguageType() == LanguageType.ENGLISH) {
			authentificationService.setDeleteAnswer(questionConfirmView.showViewEng());
		}
		
		int answer = authentificationService.getDeleteAnswer();
		
		switch (answer) {
		case 1:
			break;
		case 2:
			authentificationService.deleteAuthentification();
			break;
		default:
			break;
		}
		
		return authentificationService;
	}

}
