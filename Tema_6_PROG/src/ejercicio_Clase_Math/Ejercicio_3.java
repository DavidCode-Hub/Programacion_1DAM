package ejercicio_Clase_Math;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,numero;
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("introduce el "+i+" número: ");
			numero=consola.nextInt();
			
			if (numero>=max) {
				max=numero;
			
			}
			
			if (numero<=min) {
				min=numero;
			} 
		}// Fin for
		
		System.out.println("El numero minimo introducido es "+ min +" y el número máximo es: "+max);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
