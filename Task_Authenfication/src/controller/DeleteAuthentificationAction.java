package controller;

import model.AuthentificationService;
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
		int answer = 0;

		QuestionConfirmView view = new QuestionConfirmView();
		
		answer = view.showView();

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
