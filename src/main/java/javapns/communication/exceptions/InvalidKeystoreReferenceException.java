package javapns.communication.exceptions;

/**
 * Specific exception indicating that the library was not able to locate a viable keystore
 * based on the keystore parameter you provided.
 * 
 * If you provided a File or path as a String, your reference might not be pointing correctly
 * to your keystore file (maybe there is a spelling mistake in your path?), or the file
 * it points to might be empty, invalid or corrupted. If you provided an input stream,
 * the stream might have been previously read by another part of your program and is 
 * already empty.  If you provided a byte array, the array might be empty, invalid or
 * corrupted.  And finally, if your keystore parameter was null, this exception would
 * be thrown also.
 * 
 * You do not need to catch this exception specifically, as you should already be catching
 * its parent KeystoreException (which is thrown by most push methods).
 * 
 * @author Sylvain Pedneault
 *
 */
@SuppressWarnings("serial")
public class InvalidKeystoreReferenceException extends KeystoreException {

	/**
	 * Constructor
	 */
	public InvalidKeystoreReferenceException() {
		super("Invalid keystore parameter.  Must be InputStream, File, String (as a file path), or byte[].");
	}


	/**
	 * Constructor with custom message
	 * @param keystore
	 */
	public InvalidKeystoreReferenceException(Object keystore) {
		super("Invalid keystore parameter (" + keystore + ").  Must be InputStream, File, String (as a file path), or byte[].");
	}


	/**
	 * Constructor with custom message
	 * @param message
	 */
	public InvalidKeystoreReferenceException(String message) {
		super(message);
	}
}
