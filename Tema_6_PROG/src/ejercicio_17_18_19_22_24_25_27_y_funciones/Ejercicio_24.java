package ejercicio_17_18_19_22_24_25_27_y_funciones;

import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		
		
		System.out.println("Introduce la cantidad de tu tabla:");
		int cant=consola.nextInt();
		
		int pares[]= new int [cant];
		
		Funciones.calculoparesarray(pares,consola);
	}

}
