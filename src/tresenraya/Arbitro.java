package tresenraya;

public class Arbitro {



	
	public boolean hayGanadorColumna(int fila[], int columna[]) {
		
		
		
		for (int i=0;i<3;i++) {
			
			if (columna[0]==columna[1]&&columna[1]==columna[2]) {
				
				if(columna[i]==i) {
					System.out.println("ganador");
					return true;
				}
			}
		}
		
		return false;
		
	
		
	}
	
	public boolean hayGanadorFila(int fila[], int columna[]) {
		
	
		for(int i=0;i<3;i++) {
			
			if(fila[0]==fila[1] && fila[1]==fila[2]) {
				
				if(fila[i]==i) {
					System.out.println("ganador");
					return true;
				}
			}
			
		}
		return false;
			
	}

	
	public boolean hayGanadorDiagonal(int fila[], int columna[]) {
		int contador=0;
		for(int i=0;i<3;i++) {
			
			if(fila[i]==columna[i]) {
				contador++;
			}
		}
		if(contador==3) {
			System.out.println("ganador");
			return true;
		}

			
		contador=0;
		for (int i=0, j=2;i<3&&j>0;i++, j--) {
			
			if(fila[i]==columna[j]) {
				contador++;
			}
		}
		if(contador==3) {
			System.out.println("ganador");
			return true;
		}
		
		return false;
		
	}
}
