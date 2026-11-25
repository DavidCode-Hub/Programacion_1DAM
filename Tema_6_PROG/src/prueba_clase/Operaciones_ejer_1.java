package prueba_clase;

import java.util.Scanner;

public class Operaciones_ejer_1 {

	public static void main(String[] args) {
		// Recoger 3 valores enteros.
		
		Scanner consola=new Scanner(System.in);
		
		int x,y,z;
		
		System.out.println("Introduce un número (x): ");
		x=consola.nextInt();
		
		System.out.println("Introduce un número (y): ");
		y=consola.nextInt();
		
		System.out.println("Introduce un número (z): ");
		z=consola.nextInt();
		
		int resultadosuma=suma(x,y);
		int resultadoresta=resta(y,z);
		double resultadomulti=multiplicacion(x,y,z);
		
	}
		
		
		public static int suma(int a, int b) {
			int resultado=a+b;
			return resultado;
			
		}
		
		public static int resta(int a, int b) {
			int resultado= a-b;
			return resultado;
			
		}
		
		public static int multiplicacion(int a, int b, int c) {
			int resultado= a*b*c;
			return resultado;
			
		}
		
		public static void info (int a, int b) {
			
		}
	}


