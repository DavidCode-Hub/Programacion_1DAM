package ejercicio_Clase_String;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		int cont=0,medpalabra;
		
		String palabra;
		
		System.out.println("Introduce una palabra a evaluar.");
		palabra=consola.nextLine();
		
		medpalabra=palabra.length();
		
		for (int i = 0; i < medpalabra; i++) {
			char caracter=palabra.charAt(i);
			
			if (caracter=='a') {
				cont++;
				
			}
		}System.out.println("La letra a a aparecido: "+cont);
	consola.close();	
	
	}

}
