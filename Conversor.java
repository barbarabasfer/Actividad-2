package renombrar;

/**
 * Conversor.java
 * 
 * La clase Conversor se utiliza para almacenar el valor del cambio de euros a
 * pesetas.
 * 
 * Se apoya en el método para realizar la conversión de euros a pesetas.
 * 
 * @author Bárbara Basilio Fernández
 * @version 1.0 18/04/2023
 *
 */
public class Conversor {

	// ATRIBUTOS

	/**
	 * CAMBIO_PESETAS: Constante del valor del cambio del euro a pesetas.
	 */
	private static final float CAMBIO_EUROS_PESETAS = 166.386f;

	/**
	 * Cambia a pesetas los euros pasados como parámetros.
	 * 
	 * @param euros: es la cantidad que el usuario quiere cambiar a pesetas.
	 * @return devuelve la cantidad que introduzcamos en euros, transformada a
	 *         pesetas.
	 */
	public float eurosAPesetas(float euros) {

		float pesetas = euros * CAMBIO_EUROS_PESETAS;

		return pesetas;
	}
}