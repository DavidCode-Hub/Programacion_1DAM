package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		/*El departamento de Informática está organizando una actividad extraescolar y quiere
		determinar cuánto debe cobrar a cada alumno y cuánto se pagará al autobús por el
		servicio. Tenemos que tener en cuenta las siguientes condiciones:
		• Pediremos el número de alumnos, ya que éste puede variar.
		• Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		• De 50 a 99 alumnos, el costo es de 70 euros.
		• De 30 a 49 alumnos, el costo es de 95 euros.
		• Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin
		importar el número de alumnos.
		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que
		debe pagar cada alumno por el viaje.
		*/
		Scanner consola=new Scanner(System.in);
		
		double numalum ;
		double coste=0, precioalum=0;
		
		System.out.println("Introduce el numero de alumnos: ");
		numalum=consola.nextInt();
		while (numalum<=1) {
			System.out.println("Error , el numero de alumnos debe ser mayor a 1 \n debe introducir de nuevo el numero de alumnos: ");
			numalum=consola.nextInt();
		}
		if (numalum>=100) {
			coste=numalum*65;
			precioalum=coste/numalum;
		}else if (numalum>=50 && numalum<=99) {
			coste=numalum*70;
			precioalum=coste/numalum;
		}else if (numalum>=30 && numalum<=49) {
			coste=numalum*95;
			precioalum=coste/numalum;
		}else if (numalum<30) {
			coste=4000;
			precioalum=coste/numalum;
		}
		System.out.println("El cobro de la compañia es de: "+coste+" y el precio por alumnos es de: "+precioalum);
		
		consola.close();
	}

}
