package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int numero, resnumero, sumanum = 0;

		for (resnumero = 0; resnumero <= 14; resnumero++) {
			System.out.println("Introduce un numero a calcular");
			numero = consola.nextInt();

			sumanum += numero;

		}System.out.println("La suma total de los numero introducidos es: "+ sumanum);

		consola.close();
	}

}
