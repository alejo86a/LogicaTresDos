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
		int r = contarElemntos(matriz);
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
		fila_actual=0;
		ult = reg_cab[0];
		
		int f = 0;
		int c = 0;
		
		for(int i=0;i<r;i++){
			String posicion = buscarValor(f, c, matriz);
			System.out.println(posicion);
			f = Integer.parseInt(String.valueOf(posicion.charAt(0)));
			System.out.println(f);
			c = Integer.parseInt(String.valueOf(posicion.charAt(2)));
			System.out.println(c);
					
				if(f>fila_actual){
					ult.setLF(reg_cab[fila_actual]);
					fila_actual=f;
					ult=reg_cab[f];
				}
				x = new Dato();
				x.setFila(f+1);
				x.setColumna(c+1);
				x.setValor(matriz[f][c]);
				ult.setLF(x);
				ult=x;
				ultimos[c].setlC(x);
				ultimos[c] = x;
								
				matriz[f][c] = 0;
				
				if(c == 3){
					c = 0;
				}
				
		}
		
		ult.setLF(reg_cab[fila_actual]);
		for(int i=0;i<4;i++){
			ultimos[i].setlC(reg_cab[i]);
		}
		for(int i=0;i<3;i++){
			reg_cab[i].setValor(reg_cab[i+1]);
		}
		Mat = new Dato();
		Mat.setFila(3);
		Mat.setColumna(4);
		Mat.setValor(reg_cab[0]);
		reg_cab[3].setValor(Mat);
	}
	

private String buscarValor(int a, int b, int[][] matriz) {
	int i=0;
	int j=0;
	
	for (i = a; i < 3; i++) {
		for (j = b; j < 4; j++) {
			
			if(matriz[i][j] !=  0){
				
				return String.valueOf(i)+"-"+String.valueOf(j);
			}
		}
		b=0;
	} 
		return String.valueOf(i)+"-"+String.valueOf(j);
	}

private int contarElemntos(int[][] matriz) {
		int contador = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if(matriz[i][j] !=  0){
					contador++;
				}
				
			}
		}
		System.out.println(contador);
		return contador;
	}

//	public void llenarMatriz(int[][] matriz){
//		Dato ult =null;
//		Dato[] ultimos = new Dato[4];
//		Dato x = null;
//		int fila_actual;
//		for(int i=0;i<4;i++){
//			x = new Dato();
//			x.setLF(x);
//			reg_cab[i]=x;
//			ultimos[i]=x;
//		}
//		fila_actual=1;
//		ult = reg_cab[0];
//		for(int i=0;i<4;i++){
//			for(int j=0;j<3;j++){
//				if(i+1>fila_actual){
//					ult.setLF(reg_cab[fila_actual]);
//					fila_actual=i+1;
//					ult=reg_cab[i];
//				}
//				x = new Dato();
//				x.setFila(i+1);
//				x.setColumna(j+1);
//				x.setValor((int)matriz[i][j]);
//				ult.setLF(x);
//				ult=x;
//				ultimos[j].setlC(x);
//				ultimos[j] = x;
//			}
//		}
//		ult.setLF(reg_cab[fila_actual-1]);
//		for(int i=0;i<4;i++){
//			ultimos[i].setlC(reg_cab[i]);
//		}
//		for(int i=0;i<3;i++){
//			reg_cab[i].setValor(reg_cab[i+1]);
//		}
//		Mat = new Dato();
//		Mat.setFila(4);
//		Mat.setColumna(3);
//		Mat.setValor(reg_cab[0]);
//		reg_cab[3].setValor(Mat);
//	}
	
	
	public void imprimir(){
		Dato p = (Dato)Mat.getValor();
		Dato q =null;
		while (p!=Mat){
			q=p.getLF();
			while(q!=p){
				if(q.getValor() instanceof Integer){
					System.out.println(q.getFila()+" "+q.getColumna()+" "+(int)q.getValor());
				}
				q=q.getLF();
			}
			p=(Dato) p.getValor();
		}
	}
	
	public static void main(String[] args){
		Matriz m = new Matriz();
		int [][] d = new int [3][4];
		d[0][0]=0;
		d[0][1]=4;
		d[0][2]=8;
		d[0][3]=5;
		d[1][0]=2;
		d[1][1]=0;
		d[1][2]=7;
		d[1][3]=0;
		d[2][0]=0;
		d[2][1]=1;
		d[2][2]=5;
		d[2][3]=0;
		m.llenarMatriz(d);
		m.imprimir();
	}

}
