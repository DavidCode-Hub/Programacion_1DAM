package ejercicio_Clase_Random;

public class Ejercicio_3 {

	public static void main(String[] args) {
		int numAleatorio;
		
		for (int i = 0; i < 20; i++) {
			numAleatorio=(int)(Math.random()*((10-0)+1)+0);
					
			System.out.print(numAleatorio+" ");
		}

	}

}
