package ejercicio_Clase_Math;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		
		double grados, resultadorad, resulcos,resulsen,resultan;
		
		System.out.println("Introduce un angulo a calcular sus grados: ");
		grados=consola.nextDouble();
		
		resultadorad=Math.toRadians(grados);
		
		System.out.println("El grado introducido es:"+resultadorad);
		
		resulcos=Math.cos(resultadorad);
		System.out.println("El resultado en coseno es: "+resulcos);
		
		resulsen=Math.sin(resultadorad);
		System.out.println("El resultado en seno es: "+resulsen);
		
		resultan=Math.tan(resultadorad);
		System.out.println("El resultado en coseno es: "+resultan);
		
		
	}

}
