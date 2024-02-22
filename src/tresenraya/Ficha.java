package tresenraya;

import java.util.Arrays;

public class Ficha {

	private char tipo;
	private int fila[];
	private int columna[];
	private int contador;

	public Ficha(char tipo) {

		this.tipo = tipo;
		fila = new int[3];
		columna = new int[3];

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

	}

	public String toString() {
		return tipo + "";
	}

}