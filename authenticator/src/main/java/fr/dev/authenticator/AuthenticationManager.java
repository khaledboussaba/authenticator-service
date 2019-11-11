package fr.dev.authenticator;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AuthenticationManager {
	
	private static final int SALT_LENGTH = 6;
	private static final int MIN_SALT_CHAR_INDEX = '0';
	private static final int MAX_SALT_CHAR_INDEX = 'z';
	private static Random random = new Random();
	private static final Logger logger = LogManager.getLogger();
	
	private static String createSalt() {
		String salt ="";
		for (int i = 0; i < SALT_LENGTH; i++) {
			char c = (char) (random.nextInt(MAX_SALT_CHAR_INDEX - MIN_SALT_CHAR_INDEX) + MIN_SALT_CHAR_INDEX);
			salt += c;
		}
		logger.info("Salt created is : " + salt);
		return salt;
	}
	
	private static String generateHash(String source) throws AuthenticationException {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			byte[] bytes = md.digest((source).getBytes(StandardCharsets.UTF_8));
			// bytes to hexadecimal
			StringBuilder sb = new StringBuilder();
			for (byte b : bytes) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new AuthenticationException("Echec de hashage du mot de passe !!!", null, e);
		}	
	}

	public static void initializeCredentials(String clearPassword, Credentials credentials) {
		// TODO
	}
	
	public static boolean authenticate(String clearPassword, Credentials credentials) {
		// TODO
		return false;
	}
	
}
