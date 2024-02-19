package tresenraya;

public class Tablero {

	private Ficha tablero[][];
	private int orden;
	private int contador;

	public Tablero() {
		orden = 3;
		tablero = new Ficha[orden][orden];
		contador = 0;
	}

	public void Partida(Ficha ficha, Ficha ficha2, Ficha ficha3) {

		int fila = (int) (Math.random() * 3);
		int columna = (int) (Math.random() * 3);

		for (int i = 0; i < 3; i++) {
			while (tablero[fila][columna] != null) {
				fila = (int) (Math.random() * 3);
				columna = (int) (Math.random() * 3);
			}

			if (tablero[fila][columna] == null) {
				
				if(i==0) {
					tablero[fila][columna] = ficha;
					ficha.setFila(fila);
					ficha.setColumna(columna);

				}
				
				if(i==1) {
					tablero[fila][columna] = ficha2;
					ficha2.setFila(fila);
					ficha2.setColumna(columna);
				}
				if(i==2) {
					tablero[fila][columna] = ficha3;
				ficha3.setFila(fila);
				ficha3.setColumna(columna);
				}
 
			}

		}
	}

	public void imprimir() {

		for (int i = 0; i < orden; i++) {

			for (int j = 0; j < orden; j++) {

				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

	}

}
