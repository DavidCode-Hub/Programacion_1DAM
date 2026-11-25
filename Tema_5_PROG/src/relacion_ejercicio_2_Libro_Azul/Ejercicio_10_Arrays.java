package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_10_Arrays {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
		y que los almacene en un array. El programa debe ser capaz de pasar todos
		los números pares a las primeras posiciones del array (del 0 en adelante) y
		todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
		necesario.*/

		int numero[] = new int[20];

		for (int i = 0; i < numero.length; i++) {
			int numAleatorio = (int) (Math.random() * ((100 - 0) + 1) + 0);

			numero[i] = numAleatorio;
		}
		int i=0;
		int j=19;
		
		for (int n : numero) {
			if (n%2==0) {
				numero[i]=n;
				i++;
			}else {
				numero[j]=n;
				j--;
			}
		}for (int i2 = 0; i2 < numero.length; i2++) {
			System.out.println("Los numeros ordenados son:" + numero[i2]);
		}

	}

}
