package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int numeroini,numerosig;
		
		System.out.println("Introduce el numero por teclado (para adivinar)");
		numeroini=consola.nextInt();
		
		do {
			System.out.println("Introduce el numero por teclado");
			numerosig=consola.nextInt();
			if (numeroini>numerosig) {
				System.out.println("El numero introducido es menor, intentalo de nuevo");
			}else if (numeroini<numerosig) {
				System.out.println("El numero introducido es mayor, intentalo de nuevo");
			}else if (numeroini==numerosig) {
				System.out.println("El numero es verdadero, se ha cerrado la sesión.");
			}else{
				System.out.println("El numero es verdadero, se ha cerrado la sesión.");
			}
			
		
		} while (numeroini!=numerosig);
		
		consola.close();

	}

}
