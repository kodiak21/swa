package controller;

import model.AuthentificationService;
import model.LanguageType;
import model.Person;
import view.QuestionConfirmView;

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

		if (person.getLanguage() == LanguageType.GERMAN) {
			int answer = questionConfirmView.showViewGer();

			switch (answer) {
			case 1:
				break;
			case 2:
				authentificationService.deleteAuthentification();
				break;
			default:
				break;
			}
		}else if(person.getLanguage() == LanguageType.ENGLISH) {
			int answer = questionConfirmView.showViewEng();

			switch (answer) {
			case 1:
				break;
			case 2:
				authentificationService.deleteAuthentification();
				break;
			default:
				break;
			}
		}
		return authentificationService;
	}

}
