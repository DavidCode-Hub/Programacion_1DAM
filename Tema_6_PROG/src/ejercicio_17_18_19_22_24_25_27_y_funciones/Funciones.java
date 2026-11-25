package ejercicio_17_18_19_22_24_25_27_y_funciones;

import java.util.Iterator;
import java.util.Scanner;

public class Funciones {

	/**
	 * Esta función evalua si un número es primo o no primo y lo almacena en 2
	 * arrays diferentes.
	 * 
	 * @param a numero a introducir por scanner.
	 */
	public static boolean Esprimo(int a) {

		// public static void calculodeprimos(int a, int b[],int c[]) { PREGUNTAR EL
		// MARTES

		// este algoritmo se puede mejorar sabiendo que si un número no es
		// divisible entre 2 y su raíz cuadrada, entonces ya no será divisible
		// por ningún otro números -> será primo
		//
		// con esta mejora podemos ahorrar muchas vueltas del while para
		// números grandes

		// Crear el array para organizar los numeros primos y poner los demas en otro
		// arraycon cantidad variable y suma de posición.

		// Vamos a filtrar los valores introducidos.

		// En este for evaluamos que un numero introducido a, parta desde 2 hasta su
		// raiz si es primo lo almacena en un array sino en otro.

		if (a < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(a); i++) {

			if (a % i == 0) {
				return false;

			}

		}
		return true;

	}

	/**
	 * Sirve para elevar un número pedido por pantalla.
	 * 
	 * @param a Número que va a elevar
	 * @param b Número por el que se va a elevar
	 * @return Devuelve el resultado de la operación matematica.
	 */
	public static int elevar(int a, int b) {

		int resultado = (int) Math.pow(a, b);

		return resultado;

	}

	/**
	 * Imprime por pantalla los resultados de seno, coseno y tangente de un ángulo
	 * que hemos introducido por pantalla.
	 * 
	 * @param a Número que vamos a pedir en ejecución de código.
	 */
	public static void calculogrados(int a) {

		double convgrados = (Math.PI / 180) * a;

		double resultadosen = Math.sin(convgrados);
		System.out.println("El coseno de " + a + " es: " + resultadosen);

		double resultadocos = Math.cos(convgrados);
		System.out.println("El coseno de " + a + " es: " + resultadocos);

		double resultadotan = Math.tan(convgrados);
		System.out.println("El coseno de " + a + " es: " + resultadotan);

	}

	/**
	 * Evalua pasandole ya un array establecido anteriormente en ejecución de codigo
	 * para rellenarlo solo con números pares
	 * 
	 * @param a       Parametro a introducir para evaluar
	 * @param consola Pedida de números por teclado
	 */
	public static void calculoparesarray(int a[], Scanner consola) {
		int numero, impares = 0, pos = 0;

		while (pos < a.length) {
			System.out.print("Intorduce el número a evaluar: ");
			numero = consola.nextInt();

			if (numero % 2 == 0) {
				a[pos++] = numero;

			} else {
				impares++;
			}

		}

		System.out.println("El array de números impares es ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		} // Fin for

		System.out.println("La cantidad de números introducidos es: " + impares);

	}

	/**
	 * Evalúa el array que se ha introducido y se busca un número en concreto.
	 * 
	 * @param a Array rellenable con números aleatorios
	 * @param b Número a buscar dentro del array.
	 */
	public static void buscarnum(int a[], int b) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * ((100 - 0) + 1) + 0); // Creamos un array con números aleatorios
		}

		boolean coincidencia = false;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) { // Recorremos el array para poder evaluar si el número introducido esta
												// dentro del mismo.

			if (a[i] == b) {
				System.out.println("El número está en la posición [" + i + "] ");
			} else {
				coincidencia = true;
			}
		}
		if (coincidencia) {
			System.out.println("El número buscado no ha sido encontrado.");
		}

	}

	/**
	 * Devuelve unas operaciones las cuales vamos a escoger en tiempo de ejecución
	 * con un scanner
	 * 
	 * @param a          Se rellena con con 1er array.
	 * @param b          Se rellena con un 2º array.
	 * @param cant_datos Cantidad de datos por el cual vamos a operar.
	 * @param c          Es un tipo de parametro String en el cual le vamos a
	 *                   indicar que tipo de operación debemos realizar
	 * @return Devuelve el array de Resultados después de hacer todos los calculos
	 *         indicados.
	 */
	public static int[] opertabla(int a[], int b[], int cant_datos, String c) {

		int resultados[] = new int[cant_datos];

		switch (c) {
		case "s":
			for (int i = 0; i < cant_datos; i++)
				resultados[i] = a[i] + b[i];

			break;
		case "r":
			for (int i = 0; i < cant_datos; i++)
				resultados[i] = a[i] - b[i];
			break;
		case "m":
			for (int i = 0; i < cant_datos; i++)
				resultados[i] = a[i] * b[i];
			break;
		case "d":
			for (int i = 0; i < cant_datos; i++)
				resultados[i] = a[i] / b[i];
			break;

		default:
			break;
		}
		return resultados;

	}

}
