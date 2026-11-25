package ejercicio_de_clase_1;

import java.util.Scanner;

public class Ejecución_codigo {

	public static void main(String[] args) {
		/*
		 * 1- Devuelve Suma como double de 4 numeros 2- Array tipo char rellenado con
		 * string 3- Multiplica 2 numeros 4- Devuelve resta double de x, z donde x es la
		 * suma de los 4 numeros introducidos x1,x2,x3,x4.
		 */

		Scanner consola = new Scanner(System.in);
		double x1, x2, x3, x4;

		System.out.println("Introduce los valores de número 1:");
		x1 = consola.nextInt();

		System.out.println("Introduce los valores de número 2");
		x2 = consola.nextInt();

		System.out.println("Introduce los valores de número 3");
		x3 = consola.nextInt();

		System.out.println("Introduce los valores de número 4");
		x4 = consola.nextInt();

		double resultadosuma = Funciones_1.suma(x1, x2, x3, x4);

		System.out.println("La suma de los 4 números es: " + resultadosuma);

		

		double resultadomulti = Funciones_1.multiplica(resultadosuma);
		
		System.out.println("Vamos a multiplicar el resultado de la suma por 2:"+ resultadomulti);

		System.out.println("Introduce una palabra para separar y guardar en una tabla");
		String palabra;

		consola.nextLine();
		palabra = consola.nextLine();

		int numcarac = palabra.length();

		char caracter[] = new char[numcarac];

		caracter = Funciones_1.arraychar(palabra, caracter);

		for (int i = 0; i < caracter.length; i++) {
			System.out.println("[" + i + "]: " + caracter[i]);
		}
		
		
		System.out.println("Calculo de una resta.");
		double resultadoresta=Funciones_1.resta(x1, x2, x3, x4);
		
		
		System.out.println("Resultado final de la resta de los valores \n 1: "+x1+" \n 2: "+x2+" \n 3: "+x3+" \n 4: "+x4);
		

		System.out.println();

	}

}
