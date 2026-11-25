package Relacion_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n;
		double suma = 0;
		int cont = 0;
		
		System.out.println("Introduce un número:");
		n=sc.nextDouble();
		while(n>0){
			suma+=n;
			cont++;
			System.out.println("Introduce un número:");
			n=sc.nextDouble();
		}
		
		if(cont>0)
			System.out.println("La media es: "+((double)suma/cont));
		else
			System.out.println("No se puede realizar la media.");
		sc.close();

	}

}
