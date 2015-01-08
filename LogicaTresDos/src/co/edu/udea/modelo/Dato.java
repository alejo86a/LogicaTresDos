/**
 * 
 */
package co.edu.udea.modelo;

/**
 * @author alejandro 
 *
 */
public class Dato {

	
	private Dato lC;
	private int fila;
	private Object valor;
	private int columna;
	private Dato LF;
	
	
	public Dato(){
		
	}
	/**
	 * 
	 * @param valor
	 */
	public Dato(Object valor) {
		this.valor = valor;
		this.lC = null;
		this.fila = 0;
		this.columna = 0;
		this.LF = null;
	}

	/**
	 * @return the lC
	 */
	public Dato getlC() {
		return lC;
	}

	/**
	 * @param lC the lC to set
	 */
	public void setlC(Dato lC) {
		this.lC = lC;
	}

	/**
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}

	/**
	 * @return the valor
	 */
	public Object getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Object valor) {
		this.valor = valor;
	}

	/**
	 * @return the columna
	 */
	public int getColumna() {
		return columna;
	}

	/**
	 * @param columna the columna to set
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}

	/**
	 * @return the lF
	 */
	public Dato getLF() {
		return LF;
	}

	/**
	 * @param lF the lF to set
	 */
	public void setLF(Dato lF) {
		LF = lF;
	}
	
	

}
