package ejercicio_libro_pajarito;

import java.util.Scanner;

public class Ejercicio_Apart6_ejer3 {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);

		// Pedimos variables para calcular el máximo

		System.out.println("Introduce el primer número");

		int num1 = consola.nextInt();
		System.out.println("Introduce el número segundo número");

		int num2 = consola.nextInt();
		
		System.out.println("Introduce el número tercer número");

		int num3 = consola.nextInt();
		
		
		//Mostrar por pantalla el mensaje de los números.

		int nummax = maximo(num1, num2, num3);

		System.out.println("El numero máximo es: " + nummax);
		
		consola.close();
	}

	/**
	 * Devuelvo la evaluación de 3 números
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */

	public static int maximo(int a, int b, int c) {
		int max ;
		if (a > b && a > c) {
			max = a;
			
		}else if (b>c && b>a) {
			max=b;
			
		}else {
			max=c;
		}
		
		return max;
			
	}
	

}
