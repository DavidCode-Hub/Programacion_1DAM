package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		double numero,resultadocuadrado;
		
		do {
			System.out.println("Introduce el numero por teclado (introduce un número negativo para salir)");
		numero=consola.nextDouble();
		
			if (numero>=0) {
				
				resultadocuadrado=Math.pow(numero, 2);
				System.out.println("El cuadrado de " + numero + " es: " + resultadocuadrado);
		
			}else {
				System.out.println("El numero introducido es negativo, se ha cerrado la sesión");
			}
		
		} while (numero>=0);
		
		
		
		consola.close();
		

	}

}
