package fr.dev.authenticator;

public class Credentials {
	
	private String login;
	private String hashedPassword;
	private String salt;
	
	public Credentials() {
	}
	
	public Credentials(String login) {
		this.login = login;
	}

	public Credentials(String login, String hashedPassword, String salt) {
		this(login);
		this.hashedPassword = hashedPassword;
		this.salt = salt;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
