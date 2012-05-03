package javapns.communication.exceptions;

/**
 * General exception indicating that the library experienced some problem related to
 * your keystore, usually when attempting to read and load it.
 * 
 * This exception needs to be catched by developers using JavaPNS, as it is one of 
 * the few that are explicitely thrown by most push methods.
 * 
 * Although this is a general exception, much more details can be found out by
 * examining the cause exception that this general exception encapsulates.
 * 
 * @author Sylvain Pedneault
 *
 */
@SuppressWarnings("serial")
public class KeystoreException extends Exception {

	/**
	 * Constructor with custom message
	 * @param message
	 */
	public KeystoreException(String message) {
		super(message);
	}


	/**
	 * Constructor with custom message
	 * @param message
	 */
	public KeystoreException(String message, Exception cause) {
		super(message, cause);
	}

}
