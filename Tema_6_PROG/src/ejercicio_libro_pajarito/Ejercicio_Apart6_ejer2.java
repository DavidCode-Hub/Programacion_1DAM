package ejercicio_libro_pajarito;

import java.util.Scanner;

public class Ejercicio_Apart6_ejer2 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		// Pedimos variables para calcular el máximo

		System.out.println("Introduce el primer número");

		int num1 = consola.nextInt();
		System.out.println("Introduce el número segundo número");

		int num2 = consola.nextInt();

		int nummax = maximo(num1, num2);

		System.out.println("El numero máximo es: " + nummax);
		
		consola.close();
	}

	/**
	 * Devuelvo el máximo de 2 números pedidos anteriormente por consola.
	 * @param a
	 * @param b
	 * @return
	 */

	public static int maximo(int a, int b) {
		int max ;
		if (a > b) {
			max = a;
			
		}else {
			max =b;
		
		}
		return max;
			
	}

}
