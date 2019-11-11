package fr.dev.authenticator;

public class TestApp {

	public static void main(String[] args) {

		Credentials c1 = new Credentials("khaled");
		
		try {
			AuthenticationManager.initializeCredentials("soleil", c1);
			AuthenticationManager.authenticate("soleil", c1);
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		
	}

}
