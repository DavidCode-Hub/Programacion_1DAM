package ejercicio_1;

import matematicas.Varias;



import java.util.Scanner;

public class Funciones {

	public static void menu() {
		System.out.println(
				"1.- Rellenar array\n2.- Rellenar aleatoriamente\n3.- Borrar array\n4.- Introducir o borrar elementos\n"
						+ "5.-Listar contenido\n6.- Mostrar los números primos\n7.- Calcular la media de los números primos\n8.- Filtrar números iguales\n"
						+ "9.- Buscar elemento en el array\n10.- Mostrar números mayores suma de sus posiciones adyacentes.");

	}

	public static int[] rellenararrayconsola(int cant, Scanner a) {

		int numero[] = new int[cant];

		for (int i = 0; i < numero.length; i++) {

			System.out.println("Valor " + i + ": ");
			numero[i] = a.nextInt();

		}

		return numero;
	}

	public static int[] rellenararrayaleatorio(int b, int c) {

		int numero[] = new int[10];

		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * ((b - c) + 1) + c);
		}

		return numero;
	}

	public static void muestraarray(int a[]) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

	public static int[] borrararray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
		return a;
	}

	public static int introducir_borrar(Scanner d) {
		System.out.println("1.- Borrar elementos\n2.- Introducir elemento");

		int a = d.nextInt();

		return a;
	}

	public static int[] borrarElemento(int a[], Scanner d) {
		int pos;
		System.out.println("Introduce la posición a poner a 0: ");
		pos = d.nextInt();

		a[pos] = 0;

		return a;

	}

	public static int[] introducirElementos(int a[], Scanner d) {
		System.out.println("Introduce el número a cambiar");
		int cambio = d.nextInt();

		System.out.println("Introduce de la posición a cambiar");
		int posicion = d.nextInt();

		a[posicion] = cambio;

		return a;
	}

	public static void listarcontenido(int a[]) {
		muestraarray(a);
		
	}

	
	public static void listarprimos(int a[]) {
		int cont = 0, posi = 0;
		int primos[] = new int[10];

		for (int i = 0; i < a.length; i++) {

			if (Varias.esPrimo(a[i])) {

				primos[posi++] = a[i];
				cont++;
			}
		}
		for (int i = 0; i < cont; i++) {
			System.out.println(primos[i]);
		}
	
	}
	public static double mediaprimos(int a[]) {
		int suma=0,cont=0;
		double media;
		for (int i = 0; i < a.length; i++) {
			suma+=a[i];
		}for (int i = 0; i < a.length; i++) {

			if (Varias.esPrimo(a[i])) {

				cont++;
			}
		}media=(double)suma/(double)cont;
		return media;
	}

}