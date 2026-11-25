package ejercicio_17_18_19_22_24_25_27_y_funciones;

import java.util.Scanner;

public class Ejercicio_22 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		//Declaramos las variables en la misma linea en la que pedimos el valor.
		
		System.out.println("Introduce el ángulo a calcular.");
		int x=consola.nextInt();
		
		Funciones.calculogrados(x);
		
		
	}

}
