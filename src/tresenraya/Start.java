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
		ficha.imprimirPos();
		System.out.println();
		ficha2.imprimirPos();
		System.out.println("\n\n");
		ficha.imprimirPosMatriz();
		System.out.println();
		ficha2.imprimirPosMatriz();

	}

}
