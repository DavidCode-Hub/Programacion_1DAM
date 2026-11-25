package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_5_Arrays {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		
		int[] numeros= new int[10];
		
		System.out.println("Introduce 10 numeros enteros");
		//Pedida de numeros
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero "+(i+1)+":"); // señala en que posicion esta incluyendo el numero.
			numeros[i] =consola.nextInt();
		}
		
		int maximo=numeros[0];
		int minimo=numeros[0]; // inicia variables tomando la posicion 0 y lo guarda el numero en maximo /minimo
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>maximo) {
				maximo = numeros[i];
			}
			if (numeros[i]<minimo) {
				minimo= numeros[i];
			}
		}
		System.out.println("Los numeros son:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
			if (numeros[i]==maximo) {
				System.out.print(" Máximo ");
			}
			if (numeros[i]==minimo) {
				System.out.print(" Minimo ");
			}
			System.out.println();
		}

	}

}
