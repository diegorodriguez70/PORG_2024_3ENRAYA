package tresenraya;

public class Tablero {

	private Ficha tablero[][];

	public static final int orden = 3;


	public Tablero() {

		tablero = new Ficha[orden][orden];

		
	}

	public void Partida(Ficha ficha, Ficha ficha2, Ficha ficha3) throws InterruptedException {

		int fila = (int) (Math.random() * 3);
		int columna = (int) (Math.random() * 3);

		for (int i = 0; i < 3; i++) {
			while (tablero[fila][columna] != null) {
				fila = (int) (Math.random() * 3);
				columna = (int) (Math.random() * 3);
			}

			if (i == 0) {
				tablero[fila][columna] = ficha;

				ficha.setFila(fila);
				ficha.setColumna(columna);

				this.imprimir();

			}

			if (i == 1) {
				tablero[fila][columna] = ficha2;

				ficha2.setFila(fila);
				ficha2.setColumna(columna);

				this.imprimir();
			}
			if (i == 2) {
				tablero[fila][columna] = ficha3;

				ficha3.setFila(fila);
				ficha3.setColumna(columna);

				this.imprimir();
			}

		}

	}

	private void imprimir() throws InterruptedException {
		System.out.println("-----------------------------------\n");
		for (int i = 0; i < orden; i++) {

			for (int j = 0; j < orden; j++) {

				Thread.sleep(500);

				if (j == 0) {
					System.out.print("|   " + tablero[i][j] + "   ");
				}
				if (j == 2) {
					System.out.print("   " + tablero[i][j] + "   |");
				}
				if (j == 1) {
					System.out.print("    " + tablero[i][j] + "     ");
				}

			}
			System.out.println("\n");
		}

	}

}
