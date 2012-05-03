package javapns.communication.exceptions;

/**
 * General exception indicating that the library experienced some problem related to
 * communication (sockets, SSL, etc.) with APNS servers.  
 * 
 * This exception needs to be catched by developers using JavaPNS, as it is one of 
 * the few that are explicitely thrown by most push methods.
 * 
 * Although this is a general exception, much more details can be found out by
 * examining the cause exception that this general exception encapsulates.
 * 
 * @author Sylvain Pedneault
 */
public class CommunicationException extends Exception {

	private static final long serialVersionUID = 1L;


	public CommunicationException(String message, Exception cause) {
		super(message, cause);
	}

}
