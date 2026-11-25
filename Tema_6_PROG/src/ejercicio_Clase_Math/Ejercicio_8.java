package ejercicio_Clase_Math;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		double numero1,numero2;
		System.out.println("Introduce 2 números negativos.\n");
		
		System.out.println("Introduce el numero 1: ");
		numero1=consola.nextInt();
		
		System.out.println("Introduce el número 2: ");
		numero2=consola.nextInt();
		
		
		numero1=Math.abs(numero1);
		
		numero2=Math.abs(numero2);
		
		System.out.println("El número 1 en absoluto es: "+numero1);
		
		System.out.println("El número 2 en absoluto es: "+numero2);
		
		numero1=Math.ceil(numero1);
		
		numero2=Math.ceil(numero2); 
		
		System.out.println("El numero 1 redondeado hacia arriba es: "+numero1);
		
		System.out.println("El numero 2 redondeado hacia arriba es: "+numero2);
		System.out.println();
		
		numero1=Math.toRadians(numero1);	
		
		numero2=Math.toRadians(numero2);
		
		if (numero1>numero2) {
			System.out.println("El número mayor es: "+numero1);
		}else {
			System.out.println("El número mayor es: "+numero2);
		}
		
		}

}
