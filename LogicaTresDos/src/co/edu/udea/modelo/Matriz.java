/**
 * 
 */
package co.edu.udea.modelo;

/**
 * @author alejandro
 *
 */
public class Matriz {
	
	/**
	 * Declaracion de las variables
	 */
	
	private Dato[] reg_cab;
	private Dato Mat;

	/**
	 * 
	 */
	public Matriz() {
		reg_cab = new Dato[4];
	}
	
	public void llenarMatriz(int[][] matriz){
		Dato ult =null;
		Dato[] ultimos = new Dato[4];
		Dato x = null;
		int fila_actual;
		for(int i=0;i<4;i++){
			x = new Dato();
			x.setLF(x);
			reg_cab[i]=x;
			ultimos[i]=x;
		}
		fila_actual=1;
		ult = reg_cab[0];
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				if(i+1>fila_actual){
					ult.setLF(reg_cab[fila_actual]);
					fila_actual=i+1;
					ult=reg_cab[i];
				}
				x = new Dato();
				x.setFila(i+1);
				x.setColumna(j+1);
				x.setValor((int)matriz[i][j]);
				ult.setLF(x);
				ult=x;
				ultimos[j].setlC(x);
				ultimos[j] = x;
			}
		}
		ult.setLF(reg_cab[fila_actual]);
		for(int i=0;i<4;i++){
			ultimos[i].setlC(reg_cab[i+1]);
		}
		for(int i=0;i<3;i++){
			reg_cab[i].setValor(reg_cab[i+1]);
		}
		Mat = new Dato();
		Mat.setFila(4);
		Mat.setColumna(3);
		Mat.setValor(reg_cab[0]);
		reg_cab[3].setValor(Mat);
	}
	
	public void imprimir(){
		Dato p = (Dato)Mat.getValor();
		Dato q =null;
		while (p!=null){
			q.setLF(p);
			while(q!=null){
				System.out.println(q.getFila()+" "+q.getColumna()+" "+q.getValor());
				q=q.getLF();
			}
			p=(Dato) p.getValor();
		}
	}
	
	public static void main(String[] args){
		Matriz m = new Matriz();
		int [][] d = new int [4][3];
		for(int i = 0; i<4;i++){
			for(int j=0; j<3;j++){
				d[i][j]=i+j;
			}
		}
		m.llenarMatriz(d);
		m.imprimir();
	}

}
