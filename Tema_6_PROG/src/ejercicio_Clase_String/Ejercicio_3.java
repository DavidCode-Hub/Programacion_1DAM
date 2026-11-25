package ejercicio_Clase_String;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner consola=new Scanner (System.in);
		
		int cont=0,medpalabra;
		
		String palabra;
		
		System.out.println("Introduce una palabra a evaluar.");
		palabra=consola.nextLine();
		
		medpalabra=palabra.length();
		char caracter= ' ';
	
	
		 for (int i = medpalabra - 1; i >= 0; i--) { 
			 caracter = palabra.charAt(i);
		 
		  System.out.println("La palabra es:" + caracter); }
		 
		 
	consola.close();	
	}

}
