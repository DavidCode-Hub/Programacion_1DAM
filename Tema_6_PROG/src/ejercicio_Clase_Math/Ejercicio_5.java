package ejercicio_Clase_Math;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		double resultado,resultcateto,cateto1,cateto2;		// Declaramso variables e introducimos los valores.
		
		System.out.println("Introduce el primer cateto: ");
		cateto1=consola.nextDouble();
		
		System.out.println("Introduce el segundo cateto: ");
		cateto2=consola.nextDouble();
		
		
		resultado=Math.sqrt(Math.pow(cateto1+cateto2, 2));  // Calculamos la hipotenusa del triangulo, dado que es la raiz
															// cuadrada de la suma de los catetos al cuadrado.
		
		System.out.println("El resultado de la hipotenusa es: "+resultado);

		consola.close();
	}

}
