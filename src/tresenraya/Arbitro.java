package tresenraya;

public class Arbitro {
//Array para combinaciones ganadoras como atributo
//Metodo que compare las posiciones con la array de posiciones ganadoras

	private int combinacionesFila[];
	private int combinacionesColumna[];
	private int contador;
	
	public Arbitro() {
		
		int contador=0;
		combinacionesFila = new int [4];
		combinacionesColumna = new int [5];

		
		
	}
	
	
	public void hayGanadorColumna(int fila[], int columna[]) {
		
		if(fila[0]==0 && columna[0]==0 && fila[1]==1 &&
				columna[1]==0 && fila[2]==2 && columna[2]==0) {
			
			System.out.println("GANADOR");
		}
		
	//Asi con el resto
		
	}
	
	public void hayGanadorFila(int fila[], int columna[]) {
		
	}
}
