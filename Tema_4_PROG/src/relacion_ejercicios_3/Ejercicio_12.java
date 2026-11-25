package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int alumnos,contedad=0,contaltura=0,sumedad=0;
		double edad, altura, mediaedad, medialtura,resedad,resaltura,sumaltura=0;

		for (alumnos= 0; alumnos<=5; alumnos++) {
			System.out.println("Introduce la edad");
			edad = consola.nextInt();
			
			sumedad+=edad;
			
			if (edad>=18) {
				contedad++;
				
			}
			System.out.println("Introduce la altura");
			altura = consola.nextDouble();
			
			sumaltura+=altura;
			
			if (altura>=1.75) {
				contaltura++;
			}
		
			

	   }resedad=sumedad/2;
	   resaltura=sumaltura/2;
	   System.out.println("La cantidad de alumnos que tienen más de 18 años son: "+contedad);
	   System.out.println("La media de edad de los alumnos es: "+ resedad);
	   System.out.println("La cantidsad de alumnos con más de 1,75 de altura son:" + contaltura);
	   System.out.println("La altura media de los alumnos es: "+ resaltura);
	   consola.close();
	}

}
