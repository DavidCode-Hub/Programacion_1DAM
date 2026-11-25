package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_Simulacro1 {

	public static void main(String[] args) {
		Scanner consola= new Scanner(System.in);
		int alumnos;
		double coste=0, respago;
		
		System.out.println("Introduce el numero de alumnos: ");
		alumnos=consola.nextInt();
		
		if (alumnos>=100) {
			System.out.println("El coste del viaje es de 65€");
			coste+=65;
		}else if (alumnos>50 && alumnos<=99) {
			System.out.println("El coste es de 70€ :");
		}else if (alumnos>30 && alumnos<49) {
			System.out.println("El coste es de 95€ :");
		}else if (alumnos<30) {
			System.out.println("El coste es de 4000€ :");
			coste+=4000;
		}
	
		respago=alumnos/coste;
		System.out.println("EL coste de los alumnos es: "+respago);
		consola.close();
	}

}
