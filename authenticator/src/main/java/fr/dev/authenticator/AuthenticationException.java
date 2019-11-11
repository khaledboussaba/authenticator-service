package fr.dev.authenticator;

public class AuthenticationException extends Exception {
	private static final long serialVersionUID = 1L;

	private String login;

	public AuthenticationException(String message, String login, Exception cause) {
		super(message, cause);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}	

}
