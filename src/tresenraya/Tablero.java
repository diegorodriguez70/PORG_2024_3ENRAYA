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

	public void Partida(Ficha ficha, Ficha ficha2, Ficha ficha3) throws InterruptedException {

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
//					Thread.sleep(1000);
					ficha.setFila(fila);
					ficha.setColumna(columna);
					ficha.setPosicion(fila, columna);

				}
				
				if(i==1) {
					tablero[fila][columna] = ficha2;
			//		Thread.sleep(1000);
					ficha2.setFila(fila);
					ficha2.setColumna(columna);
					ficha2.setPosicion(fila, columna);
				}
				if(i==2) {
					tablero[fila][columna] = ficha3;
			//		Thread.sleep(1000);
				ficha3.setFila(fila);
				ficha3.setColumna(columna);
				ficha3.setPosicion(fila, columna);
				}
 
			}
		

		}
		
		//llamar desde aqui al arbitro
	}

	public void imprimir() throws InterruptedException {

		for (int i = 0; i < orden; i++) {
				//	Thread.sleep(1000);
			for (int j = 0; j < orden; j++) {
				if (tablero[i][j]!=null) {
					Thread.sleep(1000);
					
				}
				
					System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

	}

}
