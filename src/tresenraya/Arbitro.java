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
		
		
		//hacer los ifs mas genericos y boolean
		
		if(fila[0]==0 && columna[0]==0 && fila[1]==1 &&
				columna[1]==0 && fila[2]==2 && columna[2]==0) {
			
			 System.out.println( "GANADOR");
		}
		
		if(fila[0]==0 && columna[0]==1 && fila[1]==1 &&
				columna[1]==1 && fila[2]==2 && columna[2]==1) {
			 System.out.println( "GANADOR");
		}
		
		if(fila[0]==0 && columna[0]==2 && fila[1]==1 &&
				columna[1]==2 && fila[2]==2 && columna[2]==2) {
			
			 System.out.println( "GANADOR");
		}
		
	
		
	}
	
	public void hayGanadorFila(int fila[], int columna[]) {
		
		if(fila[0]==0 && columna[0]==0 && fila[1]==0 && columna[1]==1 && fila[2]==0 && columna[2]==2) {
			
			System.out.println("GANADOR");
		}
		if(fila[0]==1 && columna[0]==0 && fila[1]==1 && columna[1]==1 && fila[2]==1 && columna[2]==2) {
			
			System.out.println("GANADOR");
		}
		if(fila[0]==2 && columna[0]==0 && fila[1]==2 && columna[1]==1 && fila[2]==2 && columna[2]==2) {
			
			System.out.println("GANADOR");
		}
			
	}

	
	public void hayGanadorDiagonal(int fila[], int columna[]) {
		
		if(fila[0]==0 && columna[0]==0 && fila[1]==1 && columna[1]==1 && fila[2]==2 && columna[2]==2) {
			
			System.out.println("GANADOR");
		}
		if(fila[0]==0 && columna[0]==2 && fila[1]==1 && columna[1]==1 && fila[2]==2 && columna[2]==0) {
			
			System.out.println("GANADOR");
		}
		
	}
}
