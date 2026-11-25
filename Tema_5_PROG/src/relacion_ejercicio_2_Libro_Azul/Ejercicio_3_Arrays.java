package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_3_Arrays {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		int []numero = new int[5];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce numeros por teclado: ");
			numero[i]=consola.nextInt();
			
		}System.out.println("Tus numeros son");
		
	
		for (int i = numero.length-1; i >=0; i--) { //cambiamos la opción para que sea a la inversa
			System.out.println(numero[i]);
		
		}
		
		
	consola.close();

	}

}
