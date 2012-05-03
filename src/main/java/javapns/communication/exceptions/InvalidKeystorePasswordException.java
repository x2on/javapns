package javapns.communication.exceptions;

/**
 * Specific exception indicating that the library was not able to connect to APNS servers,
 * most likely because the keystore password you provided does not match your keystore.
 * 
 * This is ALMOST ALWAYS caused by not having followed precisely the certificate 
 * preparation procedure described on the JavaPNS project web site.
 * 
 * It should be noted that this exception is JavaPNS' best interpretation of Java SSL's
 * sometimes cryptic exceptions.  The true source of the error might be more complex,
 * but this exception is our best guess at what is going on based on past support cases.
 * 
 * You do not need to catch this exception specifically, as you should already be catching
 * its parent KeystoreException (which is thrown by most push methods).
 * 
 * @author Sylvain Pedneault
 *
 */
@SuppressWarnings("serial")
public class InvalidKeystorePasswordException extends KeystoreException {

	/**
	 * Constructor
	 */
	public InvalidKeystorePasswordException() {
		super("Invalid keystore password!  Verify settings for connecting to Apple...");
	}


	/**
	 * Constructor with custom message
	 * @param message
	 */
	public InvalidKeystorePasswordException(String message) {
		super(message);
	}

}
