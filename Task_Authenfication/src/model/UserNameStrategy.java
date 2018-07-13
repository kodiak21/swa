package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserNameStrategy implements AuthentificationStrategy{
	
	String text = "Idenfified by Username";
	
	private static String password = "1234";
	
	@Override
	public boolean authenficateSubject() {
		String inputPassword;
		boolean isAuthenficated = false;
		
		System.out.println("Enter your password:");
        try
        {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            inputPassword = br.readLine();
    		if (inputPassword.equals(password)) {
    			System.out.println(text);
    			isAuthenficated = true;
    		} else {
    			System.out.println("Wrong password entered!");
    			authenficateSubject();
    			}
        }
        catch(Exception e){
        }

		return isAuthenficated;	
	}

}
