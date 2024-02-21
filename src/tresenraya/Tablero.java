package tresenraya;

public class Tablero {

	private Ficha tablero[][];
//	private boolean seguirJugando;
	public static final int orden=3;
	private int contador;

	public Tablero() {
		
		tablero = new Ficha[orden][orden];
//		seguirJugando=true;
		
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
				//	ficha.setPosicion(fila, columna);
					
					this.imprimir();

				}
				
				if(i==1) {
					tablero[fila][columna] = ficha2;
			//		Thread.sleep(1000);
					ficha2.setFila(fila);
					ficha2.setColumna(columna);
				//	ficha2.setPosicion(fila, columna);
				this.imprimir();
				}
				if(i==2) {
					tablero[fila][columna] = ficha3;
			//		Thread.sleep(1000);
				ficha3.setFila(fila);
				ficha3.setColumna(columna);
			//	ficha3.setPosicion(fila, columna);
				this.imprimir();
				}
 
			}
		
		}
		
		
		//llamar desde aqui al arbitro

		
		
	}

//	
//	public void hayGanador(Ficha ficha, Ficha ficha2){
//		boolean columna=false;
//		boolean diagonal= false;
//		boolean fila=false;
//		ficha.getFila();
//		ficha.getColumna();
//	
//		Arbitro arbi = new Arbitro();
//
//		columna=arbi.hayGanadorColumna(ficha.getFila(), ficha.getColumna());	
//		diagonal=arbi.hayGanadorDiagonal(ficha.getFila(), ficha.getColumna());
//		fila=arbi.hayGanadorFila(ficha.getFila(), ficha.getColumna());
//
//		columna=arbi.hayGanadorColumna(ficha2.getFila(), ficha2.getColumna());	
//		diagonal=arbi.hayGanadorDiagonal(ficha2.getFila(), ficha2.getColumna());
//		fila=arbi.hayGanadorFila(ficha2.getFila(), ficha2.getColumna());
//		
//		if(columna && diagonal && fila) {
//			this.seguirJugando=false;
//		
//		}
//		else {
//			this.seguirJugando=true;
//			
//		
//		}
//		
		
//	}
//	

	public void imprimir() throws InterruptedException {
		System.out.println("-----------------------------------\n");
		for (int i = 0; i < orden; i++) {
			
	
			for (int j = 0; j < orden; j++) {
		
					Thread.sleep(500);
	
				
				if(j==0) {
					System.out.print("|   " +tablero[i][j] + "   ");
				}
				if(j==2) {
					System.out.print("   " +tablero[i][j] + "   |");
				}
				if(j==1) {
					System.out.print("    " +tablero[i][j] + "     ");
				}
				
			}
			System.out.println("\n");
		}
//		System.out.println("\n");

	}

}
