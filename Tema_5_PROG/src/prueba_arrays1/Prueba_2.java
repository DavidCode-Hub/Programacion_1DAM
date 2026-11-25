package prueba_arrays1;

import java.util.Iterator;
import java.util.Scanner;

public class Prueba_2 {

	public static void main(String[] args) {
		// Crear una matriz con 3x3 y pedir por teclado todas las variables.
		
		Scanner consola=new Scanner(System.in);
		
		int [][]numeros = new int [3][3];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.println("Introduce el valor de la fila ["+(i)+"]"+" y de la columna["+(j)+"]");
				numeros[i][j]=consola.nextInt();
			}
			
		}//fin for
		
		System.out.println("El valor de la fila");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.println("["+(i)+"] "+" ["+(j)+"]"+numeros[i][j]);
			}
			System.out.println();
		}
		
		consola.close();
	}

}
