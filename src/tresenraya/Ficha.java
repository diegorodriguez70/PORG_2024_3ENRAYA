package tresenraya;

import java.util.Arrays;

public class Ficha {

	private char tipo;
	private int fila[];
	private int columna[];
	private int contador;
	private int posicion[][];
	private int contador2;

	public Ficha(char tipo) {

		this.tipo = tipo;
		fila=new int [3];
		columna=new int [3];
		posicion=new int [2][3];
		contador2=0;
	}

	
	
	
	
	
	
	
	
	
	
	public int[][] getPosicion() {
		return posicion;
	}



	public void setPosicion(int fila, int columna) {
		this.posicion[0][contador2] = fila;
		this.posicion[1][contador2] = columna;
		
		contador2++;
	}











	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}



	public void setFila(int fila) {
		this.fila[contador] = fila;
	}



	public void setColumna(int columna) {
		this.columna[contador] = columna;
		contador++;
	}

	public int[] getFila() {
		return fila;
	}



	public int[] getColumna() {
		return columna;
	}

	public void imprimirPos() {
		
		System.out.println(Arrays.toString(fila));
		System.out.println(Arrays.toString(columna));
	//	System.out.println(Arrays.toString(posicion));
		
		
		
	}

	
	public void imprimirPosMatriz() {

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(posicion[i][j] + " ");
			}
			System.out.println();
		}

	}
	@Override
	public String toString() {
		return  tipo +"";
	}

}