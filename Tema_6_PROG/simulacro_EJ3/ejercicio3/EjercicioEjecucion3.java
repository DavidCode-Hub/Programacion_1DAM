package ejercicio3;

import java.util.Scanner;


import auxiliar.Varias;

public class EjercicioEjecucion3 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		boolean escapicua, esprimo;

		System.out.println(
				"Vamos a realizar la evaluación de un número si es capicua o primo y hacer calculos con el: \n");

		System.out.println("Introduce un número: ");
		int numero = consola.nextInt();

		escapicua = Ejercicio3.funcion1(numero);
		esprimo = Ejercicio3.funcion2(numero);
		
		
		// Cuando tenemos menos de 2 digitos me toma como que el numero es capicua y primo, por ejemplo el 7
		if (esprimo && escapicua) {
			double resultadopotencia = Math.pow(numero, 2);
			System.out.println("El resultado del número elevado a 2 es: " + resultadopotencia);

		} else if (!esprimo && escapicua) {
			System.out.println("Los digitos son: " + Varias.digitos(numero));

		} else if (esprimo && !escapicua) {
			System.out.println("El número siguiente al primo es: " + Varias.siguientePrimo(numero));

		}
	}

}
