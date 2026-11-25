package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int negativo = 0;

		for (int contnumero = 0; contnumero <= 10; contnumero++) {
			System.out.println("Introduce una numero:");
			int numero = consola.nextInt();

			if (numero < 0) {
				negativo++;
			}
		}if (negativo>1) {
			System.out.println("Hay números negativos");
			
		}else  {
			System.out.println("No hay ningun número negativo");
		}
		consola.close();
	}

}
