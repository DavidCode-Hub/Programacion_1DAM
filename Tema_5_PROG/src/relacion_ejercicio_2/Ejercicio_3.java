package relacion_ejercicio_2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio_3 {

	public static void main(String[] args) {
		/*Nos piden que implementemos el software para una máquina expendedora de golosinas.
		Cada golosina tiene un nombre y un precio para ahorrar tiempo, os paso los datos que
		tendrá a continuación (copiar y pegar):
		También tendrán una cantidad inicial, que en principio será de 5.
		
		Tendremos un pequeño menú con las siguientes opciones:
		• Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina tiene
		golosinas en cada posición, identificados por su fila y columna, que será lo que
		introduzca el usuario al pedir una golosina, por ejemplo si el usuario teclea 20
		significa que está pidiendo la golosina que está en la fila 2 columna 0. Cuando no
		haya más golosinas se le indicará al usuario. Solo puede pedir una golosina y
		supondremos que el usuario siempre tiene dinero al elegir. Recuerda de disminuir
		la cantidad la pedir.
		
		• Mostrar golosinas: mostrara todas las golosinas disponibles. Mostrará el código
		que debe introducir el usuario, el nombre y el precio. La cantidad no se mostrará.
		
		• Rellenar golosinas: esta es una función exclusiva de un técnico por lo que nos
		pedirá una contraseña, si el usuario escribe “MaquinaExpendedora2017” le pedirá
		la posición de la golosina y la cantidad.
		
		• Apagar maquina: sale del programa, antes de salir mostrara las ventas totales
		durante la ejecución del programa.*/
		
		Scanner consola= new Scanner(System.in);
		
		
		
		String[][] nombresGolosinas = {{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
									 {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
									 {"Kinder Bueno Blanco", "M&M'S", "Papa Delta", "Chicles de menta"},
									 {"Lacasitos", "Crunch", "Milkybar", "KitKat Blanco"}
									};
		
				double[][] precio = { {1.1, 0.8, 1.5, 0.9},
										 {1.8, 1, 1.2, 1},
										 {1.8, 1.3, 1.2, 0.8},
										 {1.5, 1.1, 1.1, 1.1}};
				
		int [][]cantidad =new int[4][4];
		
		for (int i = 0; i < cantidad.length; i++) {
			
		}
		
		int menu;
		
		
		
		System.out.println("1- Pedir Golosina");
		System.out.println("2- Mostrar Golosinas:");
		System.out.println("3- Rellenar Golosinas:");
		System.out.println("4- Apagar maquina");
		
		menu=consola.nextInt();
		
		try {
			
		} catch (InputMismatchException e) {
			
		}
	
				
		
		consola.close();
	}

}
