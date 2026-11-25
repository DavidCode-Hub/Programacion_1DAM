package ejercicio_libro_pajarito;

import java.util.Scanner;

public class Ejercicio_Pizarra_1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*
		 * Crea un programa que tenga un menu en el cual: 1. Calcular el area del
		 * rectángulo 2. Rellenar un array con valores aleatorios 3. Multiplicar 3
		 * valores
		 */

		String x;
		do {
			System.out.println("Introduce por pantalla lo que desea hacer: ");
			System.out.println("---------------------------------------------");
			System.out.println("1- Calcular el área del rectángulo");
			System.out.println("2- Rellenar un array con valores aleatorios");
			System.out.println("3- Multiplicar 3 valores");
			System.out.println("---------------------------------------------");

			int menu = consola.nextInt();

			// Todas las opciones vamos a pedirselas al usuario ye internamente consultara
			// aquello que le haga falta en las funciones.

			switch (menu) {
			case 1: // En este caso vamos a proceder a calcular el area del rectangulo
				int lado;
				System.out.println("Has seleccionado la opción de calcular el area del rectángulo\n");

				System.out.print("Debes introducir la medida de uno de sus lados:");
				lado = consola.nextInt();

				int resultadolado = caso1(lado);

				System.out.println("El resultado es: " + resultadolado);

				break;

			case 2: // En este caso al después de pedirlo al usuario vamos a hacer que genere un
					// array aleatorio de x numeros pedido al usuario.
				System.out.println("Introduce la cantidad del array:\n");
				int cant = consola.nextInt();

				int[] numero = new int[cant];
				System.out.println("Se va rellenar el array con valores aleatorios");

				creaarray(numero);

				muestraarray(numero);

				break;

			case 3: // Pedimos la multiplicación de 3 numeros introducidos por teclado.

				System.out.println("Se va a proceder a multiplicar 3 valores");

				System.out.println("Introduce el primer número a multiplicar");
				double num1 = consola.nextDouble();

				System.out.println("Introduce el segundo número a multiplicar");
				double num2 = consola.nextDouble();

				System.out.println("Introduce el tercer número a multiplicar");
				double num3 = consola.nextDouble();

				double resmulti = multiplicacion(num1, num2, num3);

				// Imprime el numero que ha devuelto de la funcion.

				System.out.println("El resultado de la multiplicación es: " + resmulti);

				break;

			default:
				
				System.out.println("Opcion no valida.");
				break;
			}

			// Vamos a evaluar si el usuario va a seguir en el codigo o no.

			consola.nextLine();

			System.out.println("Desea continuar? (S/N)");
			x = consola.nextLine().toLowerCase();

		} while (sigue(x));
		
		System.out.println("Programa finalizado");

		consola.close();

	}

	/**
	 * Devuelve el valor de la multiplicación de los 2 números
	 * 
	 * @param a Equivale a la pedida de valor de el número al que queremos aplicarle el area.
	 * @return Devuelve int.
	 */
	public static int caso1(int a) {
		int resultado = a * 2;
		return resultado;

	}

	/**
	 * Introduce los numeros aleatorios en un array
	 * 
	 * @param b
	 */
	public static void creaarray(int b[]) {
		for (int i = 0; i < b.length; i++) {
			int numAleatorio = (int) (Math.random() * ((20 - 1) + 1) + 1);
			b[i]=numAleatorio;

		}

	}

	/**
	 * Sirve para mostrar el array por pantalla
	 * 
	 * @param b
	 */
	public static void muestraarray(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");

		}
		System.out.println();

	}

	/**
	 * Devuelve el resultado de una multiplicacion de 3 numeros
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static double multiplicacion(double a, double b, double c) {
		double resultado = a * b * c;
		return resultado;
	}
	/**
	 * Devuelve el verdadero o falso en el caso de la solicitud de seguir o no.
	 * @param a
	 * @return
	 */
	public static boolean sigue(String a) {
		boolean sigue;

		if (a.equalsIgnoreCase("S")) {
			return sigue=true;

		} else {
			return sigue=false;
		}

	}

}
