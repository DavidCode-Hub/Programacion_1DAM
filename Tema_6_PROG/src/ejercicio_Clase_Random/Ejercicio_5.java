package ejercicio_Clase_Random;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		int numAleatorio=(int)(Math.random()*((100-0)+1)+0), numintroducido,max,min;
		
		boolean acertado=false;
		
		
		System.out.println("Introduce un número para adivinar:");
		
		for (int i = 5; 0 < i; i--) {
			System.out.println("Tienes "+i+" oportunidades");
			
			System.out.println(numAleatorio);
			
			numintroducido=consola.nextInt();
			
			
			
			if (numintroducido<=numAleatorio) {
				System.out.println("El número es mayor.");
			}else {
				System.out.println("El número es menor.");
			}
			if (numAleatorio==numintroducido) {
				System.out.println("¡¡Es Correcto!!");
				i=0;
				acertado=true;
			}
		}// fin for
		if (!acertado) {
			System.out.println("No se ha adivinado el número.");
		}
		

	}

}
