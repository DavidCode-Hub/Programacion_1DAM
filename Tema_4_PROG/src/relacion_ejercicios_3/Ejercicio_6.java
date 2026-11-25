package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int numero,sumanum=0;
		
		
		do {
			System.out.println("Introduce el numero por teclado (introduce un cero para salir)");
			numero=consola.nextInt();
			
			sumanum+=numero;
			
		
		} while (numero!=0);
		System.out.println("El numero introducido es cero, se ha cerrado la sesión");
		System.out.println("\n La suma de los numeros es: "+ sumanum);
		consola.close();

	}

}
