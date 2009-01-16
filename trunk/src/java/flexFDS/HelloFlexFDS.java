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
	public Libro getLibro()
	{
		logger.debug("hola");
		Libro l = new Libro();
		l.setNombre("El señor de los anillos");
		l.setAutor("Tolkien");
		
		return l;
	}
	
	/**
	 * 
	 * @param mensaje
	 * @return un mensaje
	 */
	public void setLibro(Libro l)
	{
		logger.debug("Nombre: " + l.getNombre());
		logger.debug("Autor: " + l.getAutor());
	
	}
}
