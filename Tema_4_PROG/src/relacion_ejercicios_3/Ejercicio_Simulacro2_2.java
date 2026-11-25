package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_Simulacro2_2 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int menu,cantnumero, resnumero=0,numero,contadornum=0,rango1,rango2;
		double pronum;
		
		System.out.println("1. Carga de Valores\n2.Visualiza los pares de un rango de valores");
		menu=consola.nextInt();
		
		
		switch (menu) {
		case 1:
			System.out.println("Introduce una serie de numeros:");
			cantnumero=consola.nextInt();
			
			for (int i = 0; i < cantnumero; i++) {
				System.out.println("Introduce los números a introducir");
				numero=consola.nextInt();
				
				if (numero>=10) {
					contadornum++;
				}
				resnumero+=numero;
				
		}pronum=(double)resnumero/2;
			System.out.println("El promedio de los numeros introducidos es: "+pronum);
			System.out.println("Los números superiores a 10 son: "+contadornum);
			break;
		case 2:
			System.out.println("Introduce el primer numero para el rango numeros:");
			rango1=consola.nextInt();
			
			System.out.println("Introduce el segundo numero para el rango numeros:");
			rango2=consola.nextInt();
			
			for (int i = rango1; i <= rango2; i++) {
				
				if (i%2==0) {
					System.out.println("Los numeros pares son: " +i);
				}
		}
			break;

		default: System.out.println("La opción marcada es incorrecta tiene que ser 1 o 2.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		consola.close();
	}

}
