package tresenraya;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		
		Tablero tablero = new Tablero();

		Ficha ficha = new Ficha('o');
		Ficha ficha2 = new Ficha('x');
		tablero.Partida(ficha, ficha2, ficha);
		tablero.Partida(ficha2, ficha, ficha2);
		tablero.imprimir();
		System.out.println("\n");
	//	ficha.imprimirPos();
		System.out.println();
		ficha2.imprimirPos();
		
		
//		tablero.hayGanador(ficha, ficha2);
		Arbitro arbi = new Arbitro();

		System.out.print("Las o ");
		arbi.hayGanadorColumna(ficha.getFila(), ficha.getColumna());	
		arbi.hayGanadorDiagonal(ficha.getFila(), ficha.getColumna());
		arbi.hayGanadorFila(ficha.getFila(), ficha.getColumna());
		System.out.println();
		System.out.print("Las x ");
		arbi.hayGanadorColumna(ficha2.getFila(), ficha2.getColumna());
		arbi.hayGanadorDiagonal(ficha2.getFila(), ficha2.getColumna());
		arbi.hayGanadorFila(ficha2.getFila(), ficha2.getColumna());
		
		
		
		

	}

}
