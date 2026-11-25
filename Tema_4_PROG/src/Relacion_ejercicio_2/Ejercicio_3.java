package Relacion_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int cp = 0;
		int cn = 0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Introduce un número: ");
			n=sc.nextInt();
			
			if(n>0) {
				System.out.println("Es positivo");
				cp++;
			}
			else  if(n<0) {
				System.out.println("Es negativo");
				cn++;
			}
			else
				System.out.println("Es cero");
		}
		
		System.out.println("Hay "+cp+" números positivos y "+cn+" números negativos.");
		
		sc.close();
		

	}

}
