package ejercicio_17_18_19_22_24_25_27_y_funciones;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int x, y;
		
		System.out.println("Introduce un número a calcular:");
		x=consola.nextInt();
		
		System.out.println("Introduce por el que elevar:");
		y=consola.nextInt();
		
		int resultado =Funciones.elevar(x,y);
		
		System.out.println("El resultado de el elevado es: "+ resultado);
		
		

	}

}
