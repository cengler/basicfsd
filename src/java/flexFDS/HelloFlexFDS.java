package flexFDS;

import org.apache.log4j.Logger;

/**
 * 
 * @author Administrador
 *
 */
public class HelloFlexFDS {

	private static Logger logger = Logger.getLogger(HelloFlexFDS.class);
	
	/**
	 * 
	 * @param mensaje
	 * @return un mensaje
	 */
	public String getAnswer(String mensaje)
	{
		logger.debug("hola");
		return "Hola flex";
	}
}