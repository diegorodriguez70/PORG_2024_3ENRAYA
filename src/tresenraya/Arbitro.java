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
		
		for (int i=0;i<3;i++) {
			
			if (columna[0]==columna[1]&&columna[1]==columna[2]) {
				
				if(columna[i]==i) {
					System.out.println("ganador");
				}
			}
		}
		
		
	
		
	}
	
	public void hayGanadorFila(int fila[], int columna[]) {
		
	
		for(int i=0;i<3;i++) {
			
			if(fila[0]==fila[1] && fila[1]==fila[2]) {
				
				if(fila[i]==i) {
					System.out.println("ganador");
				}
			}
			
		}
			
	}

	
	public void hayGanadorDiagonal(int fila[], int columna[]) {
		int contador=0;
		for(int i=0;i<3;i++) {
			
			if(fila[i]==columna[i]) {
				contador++;
			}
		}
		if(contador==3) {
			System.out.println("ganador");
		}

			
		contador=0;
		for (int i=0, j=2;i<3&&j>0;i++, j--) {
			
			if(fila[i]==columna[j]) {
				contador++;
			}
		}
		if(contador==3) {
			System.out.println("ganador");
		}
		
	}
}
