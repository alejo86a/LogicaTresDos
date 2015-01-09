/**
 * 
 */
package co.edu.udea.modelo;

import java.util.Vector;

/**
 * @author alejandro
 *
 */
public class Historial {

	Vector<Matriz> matrices;
	Vector<String> pasos;
	
	
	/**
	 * 
	 */
	public Historial() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the matrices
	 */
	public Vector<Matriz> getMatrices() {
		return matrices;
	}


	/**
	 * @param matrices the matrices to set
	 */
	public void setMatrices(Vector<Matriz> matrices) {
		this.matrices = matrices;
	}


	/**
	 * @return the pasos
	 */
	public Vector<String> getPasos() {
		return pasos;
	}


	/**
	 * @param pasos the pasos to set
	 */
	public void setPasos(Vector<String> pasos) {
		this.pasos = pasos;
	}
	
	

}
