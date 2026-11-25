package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int numero,contador=0;
		
		
		do {
			System.out.println("Introduce el numero por teclado (introduce un numero para salir)");
			numero=consola.nextInt();
		
			contador++;	
		
		} while (numero!=0);
		System.out.println("El numero introducido es cero, se ha cerrado la sesión");
		consola.close();

	}

}
