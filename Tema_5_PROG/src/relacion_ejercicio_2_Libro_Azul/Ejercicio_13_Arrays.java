package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_13_Arrays {

	public static void main(String[] args) {
Scanner consola=new Scanner(System.in);
		
		int[] numeros= new int[10];
		
		System.out.println("Introduce 10 numeros enteros");
		//Pedida de numeros
		
		for (int i = 0; i < numeros.length; i++) {
			int numAleatorio = (int) (Math.random() * ((500 - 0) + 1) + 0);
			numeros[i] =numAleatorio;
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
		
		System.out.println("Introduce que quieres destacar (1 -Minimo 2 Máximo): ");
		
		//hay que terminar el codigo
		
		
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
	}

}
