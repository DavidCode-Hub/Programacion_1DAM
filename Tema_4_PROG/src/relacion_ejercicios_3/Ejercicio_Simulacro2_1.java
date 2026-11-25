package relacion_ejercicios_3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_Simulacro2_1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int altura,ancho;
		
		System.out.println("Introduce el ancho del rectangulo (minimo 5 y debe ser impar): ");
		ancho=consola.nextInt();
		
		System.out.println("Introduce el altura del rectangulo (minimo 3): ");
		altura=consola.nextInt();
		
		if (ancho%2!=0) {
				//fila de arriba
			
				for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			
			}
			System.out.println();
			//fila de la altura y espacios
			for (int  fila= 0; fila < altura-2; fila++) {
				
				for (int columnaizq = 0; columnaizq < 1; columnaizq++) { // pinta columna derecha
					System.out.print("*");
				}
				for (int espacios = 0; espacios < (ancho/2)-1; espacios++) {
					System.out.print(" ");
				}
				for (int columnacentral = 0; columnacentral < 1; columnacentral++) { // pinta columna central
					System.out.print("*");
				}
				for (int espacios = 0; espacios < (ancho/2)-1; espacios++) {
					System.out.print(" ");
				}
				for (int columnader = 0; columnader < 1; columnader++) { // pinta columna izquierda
					System.out.print("*");
				}
				System.out.println();
			}
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			
			}
		}else {
			System.out.println("Error el numero introducido en el ancho debe ser impar");
		}
		
		
		
		System.out.println();
		consola.next();
	}

}
