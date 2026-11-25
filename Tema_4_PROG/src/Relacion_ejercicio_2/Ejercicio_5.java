package Relacion_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número:");
		n= sc.nextInt();
		for(int i=1; i<=10; i++)
			System.out.println(n+"x"+i+"="+(n*i));
		sc.close();

	}

}
