package relacion_ejercicio_3_Libro_Azul_pag150;

public class Ejercicio_3_ArraysBid {
	public static void main(String[] args) {
		
		int[][] numeros=new int[4][5];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				int numAleatorio=(int)(Math.random()*((999-100)+1)+100);
				numeros[i][j]=numAleatorio;
			}
		}
		int total = 0;

		for (int i = 0; i < numeros.length; i++) {
			int sumafila = 0;
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Fila: " +i+ " Columna: "+j);
				sumafila += numeros[i][j];
				total += sumafila;
				System.out.println("Suma fila " + sumafila);
			}
		}

		for (int j = 0; j < numeros.length; j++) {
			int sumacolumna = 0;
			for (int i = 0; i < numeros[j].length; i++) {
				System.out.println("Numero: " + numeros[j][i] + " en fila: " + i + " columna: " + j);
				sumacolumna += numeros[j][i];

				System.out.println("Suma fila " + sumacolumna);
				total += sumacolumna;
			}
		}
		System.out.println("Suma total: " + total);
		
	
	}

}
