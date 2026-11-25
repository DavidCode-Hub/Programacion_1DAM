package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int numero,resnumero=0;
		double medianum;
		
		
		do {
			System.out.println("Introduce el numero por teclado (introduce un numero negativo para salir)");
			numero=consola.nextInt();
			
			resnumero+=numero;
			
			medianum= resnumero/ 2;
			
		
		} while (numero>=0);
		System.out.println("El numero introducido es negativo, se ha cerrado la sesión");
		System.out.println("La suma de los numeros introducidos es: "+ resnumero);
		System.out.println("\n La media de los numeros introducidos es: "+ medianum);
		consola.close();

	}

}
