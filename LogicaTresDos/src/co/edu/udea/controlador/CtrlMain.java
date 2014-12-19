/**
 * 
 */
package co.edu.udea.controlador;

import co.edu.udea.modelo.Matriz;
import co.edu.udea.vista.GUIPrincipal;

/**
 * @author alejandro
 *
 */
public class CtrlMain {

	private Matriz viejaMatriz;
	private Matriz nuevaMatriz;
	private CtrlPrincipal miCtrlPrincipal;
	private GUIPrincipal miGuiPrincipal;
	
	/**
	 * 
	 */
	public CtrlMain() {
		miGuiPrincipal = new GUIPrincipal(miCtrlPrincipal);
		miCtrlPrincipal = new CtrlPrincipal(viejaMatriz, nuevaMatriz);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CtrlMain  cm = new CtrlMain();
	}

}
