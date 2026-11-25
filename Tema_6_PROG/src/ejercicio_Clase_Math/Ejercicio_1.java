package ejercicio_Clase_Math;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		double numero;

		System.out.println("Introduce un numero decimal a redondear:");
		numero = consola.nextDouble();
		
		int resultado1,resultado2,resultado3;
		
		resultado1=(int)Math.round(numero);
		System.out.println("El numero más cercano es:"+ resultado1);
		
		resultado2=(int)Math.ceil(numero);
		
		System.out.println("El numero más cercano por arriba: "+resultado2);
		
		resultado3=(int)Math.floor(numero);
		
		System.out.println("El número más cercano por abajo: "+resultado3);
		
		
	}

}
