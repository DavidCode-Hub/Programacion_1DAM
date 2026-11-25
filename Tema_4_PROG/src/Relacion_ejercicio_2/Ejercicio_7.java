package Relacion_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número:");
		n= sc.nextInt();
		
		System.out.printf("%-15s %-15s %-15s\n","Número","Cuadrado","Cubo");
		
		for(int i=n; i<n+5; i++)
			System.out.printf("%-15s %-15s %-15s\n",i,i*i,i*i*i);
		sc.close();

	}

}
