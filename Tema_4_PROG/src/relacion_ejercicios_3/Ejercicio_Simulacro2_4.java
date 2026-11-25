package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_Simulacro2_4 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int contaltura = 0, personas;
		double altura, promedioalt, menoralt = 0, mayoralt = 0, resmayoralt = 0, resmenoralt = 0, promaltura,
				sumalturas = 0,histaltura=0;
		
			System.out.println("Introduce el número de personas a calcular: ");
			personas = consola.nextInt();
		do {
			System.out.println("Introduce el número de altura: ");
			altura = consola.nextDouble();

			contaltura++;
			sumalturas += altura;

			if (altura > histaltura) {
				mayoralt=altura;
				
				} else if (altura <histaltura) {
					menoralt=altura;
				
				} 
			histaltura=altura;
			promaltura = sumalturas / contaltura;

			

		} while (contaltura != personas);
		System.out.println("La altura introducida es: " + altura);
		System.out.printf("La altura media de todas las alturas es: %.2f" ,promaltura);
		System.out.println("La altura mayor es:" + mayoralt);
		System.out.println("La altura menor es: " + menoralt);
		consola.nextInt();
	}

}
