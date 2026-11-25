package llamadaFunciones;

import java.util.InputMismatchException;

import java.util.Scanner;

import funciones.Funciones;

public class LlamadaFunciones {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int opcion;
		
		
		Funciones.menu();
		
		try {
			
		
		
		System.out.println("Introduce una opción del menú: ");
		opcion=consola.nextInt();
		
		switch (opcion) {
		case 1:
			
			System.out.println("Introduce un valor para su tabla de multiplicar: ");
			int numeromulti=consola.nextInt();
			
			Funciones.tablamulti(numeromulti);
			
			break;
		case 2:
			System.out.println("Introduce dos números:");
			
			System.out.println("\nNúmero 2:");
			int num1=consola.nextInt();
			System.out.println("Número 1:");
			int num2=consola.nextInt();
			
			Funciones.maxmin(num1,num2);
			
			break;
		case 3:
			
			double num3,num4, resultadodiv;
			System.out.println("Introduce dos números a dividir: ");
			
			System.out.println("Número 1: ");
			num3=consola.nextDouble();
			
			System.out.println("Número 2: ");
			num4=consola.nextDouble();
			
			resultadodiv=Funciones.division(num3, num4);
			System.out.println("El resultado es: "+resultadodiv);
			
			break;
		case 4:
			int opcion2;
			
			Funciones.menu2();
			
			System.out.println("Introduce una opción del menu: ");
			opcion2=consola.nextInt();
			
			while (opcion2<1 || opcion2>3) {
				System.out.println("Debes introducir una opción entre 1 y 3");
				opcion2=consola.nextInt();
			}
			
			switch (opcion2) {
			case 1:
				System.out.println("Introduce los grados a calcular: ");
				double grados=consola.nextDouble();
				
				double resultadosen;
				resultadosen=Funciones.seno(grados);
				System.out.println("El calculo del seno es: "+resultadosen);
				
				break;
				
			case 2:
				System.out.println("Introduce los grados a calcular: ");
				double grados2=consola.nextDouble();
				
				double resultadocoseno;
				resultadocoseno=Funciones.coseno(grados2);
				System.out.println("El calculo del seno es: "+resultadocoseno);
				
				break;
				
			case 3:
				System.out.println("Introduce los grados a calcular: ");
				double grados3=consola.nextDouble();
				
				double resultadotan;
				resultadotan=Funciones.tangente(grados3);
				System.out.println("El calculo de la tangente es: "+resultadotan);
				
				break;

			default:
				break;
			}
			
			
			break;

		default:
			break;
		}
		
		} catch (InputMismatchException e) {
			System.out.println("Debes introducir un número de la opción\nDebes ejecutar otra vez el código");
			
		}consola.close();
	}

}
