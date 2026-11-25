package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_9_Arrays {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*Realiza un programa que pida 8 números enteros y que luego muestre esos
		números junto con la palabra “par” o “impar” según proceda.
		*/
		
		int []numeros= new int[8];
		
		System.out.println("Introduce 8 numeros:");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero "+(i+1)+" : ");
			numeros[i]= consola.nextInt();
		}
		int i=0;
		for (int n : numeros) {
			
			if (n%2==0) {
				System.out.println(numeros[i]+ " PAR");
			}else {
				System.out.println(numeros[i]+" IMPAR");
			}
			i++;
		}
		
		consola.close();
	}

}
