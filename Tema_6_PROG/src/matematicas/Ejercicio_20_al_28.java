package matematicas;

import java.util.Scanner;

public class Ejercicio_20_al_28 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		// Ejercicio 1

		System.out.println("1- Genera un array de tamaño n con números aleatorios"
				+ " cuyo intervalo (mínimo y máximo) se indica como parámetro");

		int cant1, x1, y1;

		System.out.println("Introduce la cantidad del array: ");
		cant1 = consola.nextInt();

		int x[] = new int[cant1];

		System.out.println("Introduce la el valor minimo: ");
		x1 = consola.nextInt();

		System.out.println("Introduce el valor maximo: ");
		y1 = consola.nextInt();

		x = Array.generaArrayInt(cant1, x1, y1);
		Array.muestraArrayInt(x);

		System.out.println("\n");

		// Ejercicio 2

		System.out.println("2- Devuelve el mínimo del array que se pasa como parámetro");

		int resultado;

		resultado = Array.minimoArrayInt(x);

		System.out.println("El resultado del array es: ");
		Array.muestraArrayInt(x);

		System.out.println("El minimo es el número: " + resultado);
		System.out.println("\n");

		// Ejercicio 3
		System.out.println("3- Devuelve el máximo del array que se pasa como parámetro");

		int resultado1;

		resultado1 = Array.maximoArrayInt(x);

		System.out.println("El resultado del array es: ");
		Array.muestraArrayInt(x);

		System.out.println("El maximo es el número: " + resultado1);
		System.out.println("\n");

		// Ejercicio 4

		System.out.println("4- Devuelve la media del array que se pasa como parámetro");

		double resultado2;

		resultado2 = Array.mediaArrayInt(x);

		System.out.println("El array es: ");
		Array.muestraArrayInt(x);

		System.out.println("La media del array es: " + resultado2);
		System.out.println("\n");

		// Ejercicio 5
		System.out.println("5-  Dice si un número está o no dentro de un array");

		boolean resultado4;
		int numerobuscar;

		Array.muestraArrayInt(x);

		System.out.println("Introduce el número a buscar:");
		numerobuscar = consola.nextInt();
		resultado4 = Array.estaEnArrayInt(x, numerobuscar);

		System.out.println("El resultado del array es: ");
		Array.muestraArrayInt(x);

		System.out.println("Se escuentra el numero buscado?");

		System.out.println("\n");
		if (resultado4) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		System.out.println("\n");

		// Ejercicio 6

		System.out.println(
				"6- Busca un número en un array y devuelve la posición\r\n" + " (el índice) en la que se encuentra.");

		int resposicion, posicion;

		System.out.println("Introduce la posición del número a extraer");
		posicion = consola.nextInt();

		resposicion = Array.posicionEnArrayInt(x, posicion);

		System.out.println("El array es: ");
		Array.muestraArrayInt(x);

		if (posicion >= 0) {
			System.out.println("La posición del numero en el array es: " + posicion);
		} else {
			System.out.println("El numero no ha sido encontrado en el array.");
		}

		System.out.println("\n");

		// Ejercicio 7

		System.out.println("7- Le da la vuelta a un array");

		int resultadovuelta[] = new int[cant1];

		resultadovuelta = Array.volteaArrayInt(x);

		System.out.println("El array dado la vuelta es: ");

		Array.muestraArrayInt(resultadovuelta);

		System.out.println("\n");

		// Ejercicio 8

		System.out.println("8-  Rota n posiciones a la derecha los números de un" + " array.");

		int resultarotar[] = new int[cant1];

		System.out.println("El array sin rotar es: ");
		Array.muestraArrayInt(x);

		System.out.println("Introduce cuantas posiciones se quieren rotar:");

		int posicionrotar = consola.nextInt();

		resultarotar = Array.rotaDerechaArrayInt(x, posicionrotar);

		System.out.println("El resultado del array rotado con " + posicionrotar + " es: ");

		Array.muestraArrayInt(resultarotar);
		System.out.println("\n");

		// Ejercicio 9

		System.out.println("9-  Rota n posiciones a la izquierda los números de" + " un array.");

		int resultarotarizq[] = new int[cant1];

		System.out.println("El array sin rotar es: ");
		Array.muestraArrayInt(x);

		System.out.println("Introduce cuantas posiciones se quieren rotar:");
		int posicionrotarizq = consola.nextInt();

		resultarotarizq = Array.rotaIzquierdaArrayInt(x, posicionrotarizq);

		System.out.println("El resultado del array rotado con " + posicionrotarizq + " es: ");
		Array.muestraArrayInt(resultarotarizq);

	}

}
