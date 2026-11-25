package relacion_ejercicios_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int contcarac = 0,contadortotalcarac=0;

		String[] caracter = new String[4];
		
		String caracterintro;

		for (int i = 0; i < caracter.length; i++) {
			System.out.println("Introduce un caracter: ");
			caracterintro = consola.next();
			
			caracter[i] = caracterintro;
				contadortotalcarac++;
		}

			System.out.println("la cantidad total de caracter son: "+ contadortotalcarac);
		
		consola.close();

	}

}
