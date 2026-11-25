package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int nota = 0,notaaprob =0;

		for (int contnota = 0; contnota <= 10; contnota++) {
			System.out.println("Introduce una numero:");
			int numero = consola.nextInt();

			if (nota >=5) {
				notaaprob++;
			}
		}if (notaaprob<1) {
			System.out.println("Hay algún suspenso");
			
		}else  {
			System.out.println("No hay ningun suspenso..");
		}
		consola.close();
	}

}
