package ejercicio_libro_pajarito;

import java.util.Scanner;

public class Ejercicio_Apart6_ejer1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner consola =new Scanner (System.in);
		
		System.out.println("Introduce el número de repeticiones");
		
		int num = consola.nextInt();
		
		repeticion(num);
	}
	
	/**
	 * Devuelvo el número de veces que hay que repetir el bucle FOR
	 * @param a
	 * @throws InterruptedException
	 */
	
	public static void repeticion(int a) throws InterruptedException {
		for (int i = 0; i < a; i++) {
			
			Thread.sleep(1000);
			System.out.println("Módulo ejecutandose.");
			
		}
	}

}
