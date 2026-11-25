package Relacion_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		int base;
		String car;
		System.out.println("Introduce la altura: ");
		h = sc.nextInt();
		System.out.println("Introduce el caracter: ");
		car = sc.next();
		
		base = (h*2)-1;
		
		for(int i=0; i<h; i++){
			for(int j=1; j<=base; j++){
				if(j-i==h || j+i==h || i==h-1){
					System.out.print(car);
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		sc.close();

	}

}
