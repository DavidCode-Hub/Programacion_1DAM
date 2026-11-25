package ejercicio_Clase_String;

import java.util.Scanner;

public class Ejercicio_4_compareTo {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		// Declaramos variables
		String palabra1,palabra2;
		
		System.out.println("Introduce la primera palabra:");
		palabra1=consola.nextLine();
		
		System.out.println("Introduce la segunda palabra:");
		palabra2=consola.nextLine();
		
		int esigual=palabra2.compareTo(palabra1);  //El "CompareTo" evalua la entrada de 2 String con otro String para ver si las palabras son iguales
													// de ser iguales devuelve 0. Puede aplicarse en comparativa de arrays.
		
		if (esigual==0) {
			System.out.println("Las dos palabras son iguales.");
		}else {
			System.out.println("Las dos palabras no son iguales.");
		}
		
		
		/*Scanner consola = new Scanner(System.in);
		// Declaramos variables
		String palabra1[]= {"rosa","verde","amarillo","violeta"};
		String palabra2[]=new String[6];
		
		for (int i = 0; i < palabra2.length; i++) {
			System.out.println("Introduce una palabra:");
		    palabra2[i]=consola.nextLine().toLowerCase();
		    System.out.println("Palabra "+i+": ");
		}
		
		int esigual=-1,cont=0;
		
		
		for (int i = 0; i < palabra1.length; i++) {
			for (int j = 0; j < palabra2.length; j++) {
				
				esigual=palabra1[i].compareTo(palabra2[j]); //El "CompareTo" evalua la entrada de 2 String con otro String para ver si las palabras son iguales
														// de ser iguales devuelve 0. Puede aplicarse en comparativa de arrays.
				if (esigual==0) {						
					System.out.println("La palabra "+palabra2[j]+" es igual que "+palabra1[i]);
					cont++;
					
				}		         
		
			}
		}if (cont>0) {
			System.out.println("Se han encontrado "+cont+" palabras");
		}else {
			System.out.println("No se ha encontrado ninguna palabra igual.");
		}*/
		
		
	}

}
