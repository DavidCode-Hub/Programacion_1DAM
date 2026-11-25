package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int sueldo, resnumero, sumasuel = 0,contsueldo=0;

		for (resnumero = 0; resnumero <= 9; resnumero++) {
			System.out.println("Introduce un sueldo.");
			sueldo = consola.nextInt();
			
			if (sueldo>=1000) {
				contsueldo++;
			}
			sumasuel+=sueldo;

	   }System.out.println("Los sueldos que hay por encima de 1000€ son:"+ contsueldo);
	   System.out.println("La suma de todos los sueldos es: " + sumasuel);
	   consola.close();

    }
}
