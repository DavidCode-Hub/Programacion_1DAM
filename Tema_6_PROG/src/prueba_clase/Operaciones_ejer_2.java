package prueba_clase;

import java.util.Scanner;

public class Operaciones_ejer_2 {

	public static void main(String[] args) {
		// Hacer el area triangulo, cuadrado.
		
		Scanner consola=new Scanner (System.in);
		double a, b ,c;
		
		System.out.println("Introduce el primer número (a)");
		a=consola.nextDouble();
		
		System.out.println("Introduce el según número (b)");
		b=consola.nextDouble();
		
		System.out.println("Introduce el tercer número (c)");
		c=consola.nextDouble();
		
		double resultadotriangulo= areatriangulo(a,b);
		double resultadocuadrado= areacuadrado(c);
		
		System.out.printf("El area del trinagulo es: %.2f \n",resultadotriangulo);
		System.out.printf("El area del cuadrado es: %.2f \n",resultadocuadrado);
		;
		

	}//Fin MAIN
	
	/**
	 * Devuelvo una función area de triangulo
	 * @param a
	 * @param b
	 * @return double
	 */
	
	public static  double areatriangulo (double a, double b) {
		double resultado= (a*b)/2;
		return resultado;
	}
	
	
	/**
	 * Devuelvo función area de cuadrado
	 * @param c
	 * @return double
	 */
	
	public static double areacuadrado (double c) {
		double resultado=Math.pow(c,2);
		return resultado;
	}

}
