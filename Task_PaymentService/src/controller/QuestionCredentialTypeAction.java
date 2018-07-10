package controller;

import de.leuphana.swa.authentificationService.CredentialType;
import model.PaymentService;
import view.QuestionCredentialTypeView;

public class QuestionCredentialTypeAction implements PaymentServiceAction{

	public PaymentService action(PaymentService paymentService) {
		
	int answer=0;	
	QuestionCredentialTypeView view = new QuestionCredentialTypeView();
	CredentialType credentialType = null;
	answer = view.showView();
	
	switch (answer) {
	case 1:	credentialType = CredentialType.FINGERPRINT; break;
	case 2:	credentialType = CredentialType.USERNAME; break;
	case 3:	credentialType = CredentialType.EYESCAN; break;
	default: action(paymentService);
	}
	paymentService.setCredentialType(credentialType);
	return paymentService;
	}

}
