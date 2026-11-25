package relacion_ejercicios_1;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int n; // la cantidad que va a tener el array
		int[] enteros= new int [2];
			
		String []palabras= new String[2];
		String palabraScan;
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Introduce los caracteres: ");
			palabraScan=consola.nextLine();
			
			palabras[i]=palabraScan;
			// el for anterior es solo para pedir el array
			enteros[i]=palabras[i].length();
			/*el "palabras .lenght" indica la cantidad de 
			caracteres que tiene una palabra dentro de 
			la casilla del array( ya sea [0],[1]).*/
		}
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("La palabra es:"+palabras[i]+" la cantidad de caracteres es: "+enteros[i]);
		}
		
		
		consola.close();
	}

}
