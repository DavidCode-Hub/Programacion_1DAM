package ejercicio3;

import java.util.Scanner;


import auxiliar.Varias;

public class Ejercicio3 {

	/**
	 * Esta funcion recoge un número por teclado y evaluar si es capicua
	 * 
	 * @param a1 Numero introducido por teclado
	 * @return boolean despues de evaluar si el numero es capicua
	 */
	public static boolean funcion1(int a1){
		
	 
		boolean a=Varias.esCapicua(a1);
		
		return a;
		
		
	}
	
	/**
	 * Esta funcion recoge un número por teclado y evaluar si es primo
	 * 
	 * @param b1 Numero introducido por teclado
	 * @return boolean despues de evaluar si el numero es capicua
	 */
	public static boolean funcion2(int b1){
		
		boolean b=Varias.esPrimo(b1);
		
		return b;
		
	}
}
