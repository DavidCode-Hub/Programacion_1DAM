package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_15_Arrays {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		int[] mesas = new int[10];
		int comensales;
		for (int i = 0; i < mesas.length; i++) {
			int numAleatorio = (int) (Math.random() * ((4 - 0) + 1) + 0);

			mesas[i] = numAleatorio;

		}

		do {

			System.out.println("Las mesas que disponemos es: ");

			for (int i = 0; i < mesas.length; i++) {
				System.out.println("[ " + (i + 1) + " ] : " + mesas[i]);
			} // Para mostrar las mesas por pantalla

			System.out.println("¿Cuantos son? (Introduce 0 o un numero negativo para salir del programa");
			comensales = consola.nextInt();
			while (comensales > 4) {
				System.out.println("Minimo tienen que ser 4 o menos comensales, no permitimos grupos más grandes;");
				System.out.println();
				comensales = consola.nextInt();
			}

			for (int i = 0; i < mesas.length; i++) {
				if (mesas[i] == 0) {
					mesas[i] = comensales;
					System.out.println("Sientese en la mesa: " + (i + 1));
					break;    
					//Una vez que no queramos que sigua evaluando el array completo metemos el break, 
					// cuando se cumpla la condición se sale del for directamente y pasa al siguiente caso.
					

				} else if (mesas[i] + comensales <= 4) {
					mesas[i] += comensales;
					System.out.println("Sientese en la mesa " + (i + 1));
					break;
				}else if (mesas[i]+comensales>4) {
					System.out.println("Lo sentimos pero no disponemos de mesas para su grupo.");
					break;
				}
			} // fin for

		} while (comensales >= 0 );
		for (int i = 0; i < mesas.length; i++) {
			System.out.println("[ " + (i + 1) + " ] : " + mesas[i]);
		}

		consola.close();

	}

}
