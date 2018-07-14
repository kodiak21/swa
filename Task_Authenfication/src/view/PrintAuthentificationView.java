package view;

import model.AuthentificationStrategy;

public class PrintAuthentificationView {

	private AuthentificationStrategy authentificationStrategy;

	public void showViewGer( AuthentificationStrategy authentificationStrategy) {

		System.out.println(authentificationStrategy.authenficateSubjectGer());

	}
	
	public void showViewEng( AuthentificationStrategy authentificationStrategy) {

		System.out.println(authentificationStrategy.authenficateSubjectEng());

	}
}
