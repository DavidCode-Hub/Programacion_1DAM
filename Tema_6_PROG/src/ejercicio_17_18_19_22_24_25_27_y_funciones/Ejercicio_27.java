package ejercicio_17_18_19_22_24_25_27_y_funciones;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_27 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		int array1[] = new int[10];
		int array2[] = new int[10];
		int resultado[] = new int[10];
		String y;

		System.out.println("Introduce la cantidad de numeros a operar (máximo 10)");
		int x = consola.nextInt();

		System.out.println("Introduce la operación a realizar");
		System.out.println("Sumar, restar, multiplicar o dividir (mediante un carácter: 's', 'r', 'm', 'd'):");

		y = consola.next();

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * ((100 - 0) + 1) + 0);
		}
		for (int i = 0; i < array1.length; i++) {
			array2[i] = (int) (Math.random() * ((100 - 0) + 1) + 0);
		}

		resultado = Funciones.opertabla(array1, array2, x, y);

		System.out.println("El resultado de la tabla es: ");
		System.out.println("Tabla 1:     Tabla 2:     Resultado:    ");
		for (int i = 0; i < x; i++) {
			System.out.println(array1[i] + "    " + array2[i] + "    " + resultado[i]);
		}

	}

}
