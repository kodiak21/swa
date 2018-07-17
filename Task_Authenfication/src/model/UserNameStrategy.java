package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserNameStrategy implements AuthentificationStrategy{
	
	private static String password = "1234";
	
	@Override
	public boolean authenficateSubjectGer() {
		String inputPassword;
		boolean isAuthenficated = false;
		
		System.out.println("Geben Sie Ihr Passwort ein:");
        try
        {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            inputPassword = br.readLine();
    		if (inputPassword.equals(password)) {
    			isAuthenficated = true;
    		} else {
    			System.out.println("Falsches Passwort");
    			authenficateSubjectGer();
    			}
        }
        catch(Exception e){
        }

		return isAuthenficated;	
	}
	
	@Override
	public boolean authenficateSubjectEng() {
		String inputPassword;
		boolean isAuthenficated = false;
		
		System.out.println("Enter your password:");
        try
        {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            inputPassword = br.readLine();
    		if (inputPassword.equals(password)) {
    			isAuthenficated = true;
    		} else {
    			System.out.println("Wrong password!");
    			authenficateSubjectGer();
    			}
        }
        catch(Exception e){
        }

		return isAuthenficated;	
	}

	@Override
	public CredentialType getCredentialType() {
		return CredentialType.USERNAME;
	}

}
