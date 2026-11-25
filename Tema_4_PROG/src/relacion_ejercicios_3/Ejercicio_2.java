package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int numero;
		
		
		do {
			System.out.println("Introduce el numero por teclado (introduce un cero para salir)");
			numero=consola.nextInt();
		
			if (numero>0) {
				System.out.println("El numero introducido es positivo");
				
			}else 
				System.out.println("El numero introducido es negativo");	
		
	
		
		} while (numero!=0);
		System.out.println("El numero introducido es cero, se ha cerrado la sesión");
		consola.close();
	}

}
