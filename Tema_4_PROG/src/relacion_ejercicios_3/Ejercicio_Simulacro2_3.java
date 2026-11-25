package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_Simulacro2_3 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int sueldo, ressueldo = 0, sumasuel = 0, contsuelalto = 0, contsuelbajo = 0;

		System.out.println("Introduce un sueldo.");
		sueldo = consola.nextInt();

		while (sueldo!=0) { //necesita que sea 0 para que salga del bucle y cumpla condicion del ejercicio
			

			if (sueldo >= 1000 && sueldo < 1300) {
				contsuelbajo++;

			} else if (sueldo >= 1300 && sueldo <= 1500) {
				contsuelalto++;

			}  else {
				System.out.println("El numero introducido no es valido debe\nvolver a introducir un número que cumpla dichos valores");
				sueldo = consola.nextInt();
			}
			ressueldo += sueldo;
			System.out.println("Introduce un sueldo.");
			sueldo = consola.nextInt();
		} // cierre llave bucle
		
		System.out.println("Se ha cerrado la sesión ");
		

		System.out.println("La cantidad de sueldos que están entre 1000 y 1300 son: " + contsuelbajo); 

		System.out.println("La cantidad de sueldos que están entre 1300 y 1300 son: " + contsuelalto); 
		System.out.println("El coste total de la empresa en sueldos es: " + ressueldo);

		consola.close();

	}

}
