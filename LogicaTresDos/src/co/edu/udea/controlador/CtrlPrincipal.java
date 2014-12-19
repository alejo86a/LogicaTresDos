/**
 * 
 */
package co.edu.udea.controlador;

import co.edu.udea.modelo.Matriz;

/**
 * @author alejandro
 *
 */
public class CtrlPrincipal {

	private Matriz miViejaMatriz;
	private Matriz miNuevaMatriz;

	/**
	 * 
	 * @param viejaMatriz
	 * @param nuevaMatriz
	 */
	public CtrlPrincipal(Matriz viejaMatriz, Matriz nuevaMatriz) {
		this.miViejaMatriz = viejaMatriz;
		this.miNuevaMatriz = nuevaMatriz;
	}

}
