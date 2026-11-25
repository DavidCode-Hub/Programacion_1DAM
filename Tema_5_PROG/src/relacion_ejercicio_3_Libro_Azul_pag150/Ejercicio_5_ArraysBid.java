package relacion_ejercicio_3_Libro_Azul_pag150;

public class Ejercicio_5_ArraysBid {

	public static void main(String[] args) {
		
		int [][]numeros= new int[6][10];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				int numAleatorio=(int)(Math.random()*((1000-0)+1)+0);
				numeros[i][j]=numAleatorio; 
			}
			
		}
		int maximo=numeros[0][0];
		int minimo=numeros[0][0];
		int posicionmaxi=0;
		int posicionmaxj=0;
		int posicionmini=0;
		int posicionminj=0;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				
				if (maximo <= numeros[i][j]) {
					maximo = numeros[i][j];
					posicionmaxi=i;
					posicionmaxj=j;
				}
				if (minimo >= numeros[i][j]) {
					minimo = numeros[i][j];
					posicionmini=i;
					posicionminj=j;
					
				}
				System.out.printf("%5s", numeros[i][j]);
				
			}System.out.println();
		}
		
		System.out.println("Cordenadas del numero "+maximo+" maximo ["+posicionmaxi+"] "+" ["+posicionmaxj+"]");
		System.out.println("Cordenadas del numero "+minimo+" minimo ["+posicionmini+"] "+" ["+posicionminj+"]");

	}

}
