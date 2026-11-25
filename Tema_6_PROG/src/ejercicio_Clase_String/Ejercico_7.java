package ejercicio_Clase_String;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercico_7 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		String frase;

		System.out.println("Introduce una frase (solo debe contener 1 espacio entre palabras;");
		frase = consola.nextLine().toUpperCase();

		String[] palabras = frase.split(" "); //Separamos las palabras y organizamos en un array. 

		/*char siglas[] = new char[palabras.length];   //Declaramos el array con la cantidad de palabras introducidas.
		
		for (int i = 0; i < palabras.length; i++) {
			siglas[i]=palabras[i].charAt(0); //Pasamos las primeras iniciales a un array
			
		}//Fin for
				
		
		System.out.println(siglas); // Y por ultimo lo imprimimos por la pantalla
		
		*/
		String siglas= "";
		
		for (int i = 0; i < palabras.length; i++) {
			siglas+=palabras[i].charAt(0);
			
		}// FIn for
		
		System.out.println(siglas);

	}

}
