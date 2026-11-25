package ejercicio_Clase_Math;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		double  radio,resultradio,area,resultarea;
		
		
		System.out.println("Introduce el radio de una circunferencia: ");
		radio=consola.nextDouble();
		
		resultradio=2*Math.PI*radio;
		
		resultarea=Math.PI*radio;
		
		double resultarea2=Math.pow(resultradio, 2);
		
		System.out.println("El resultado del radio es: "+resultradio+" y el area es: "+resultarea2);

		consola.close();
	}

}
