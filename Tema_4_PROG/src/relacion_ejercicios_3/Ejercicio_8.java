package relacion_ejercicios_3;


import java.util.Scanner;


public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		int numero,resnumero;
		
	
		System.out.println("Introduce un numero a calcular");
		numero = consola.nextInt();
		while (numero<=1) {
			System.out.println("El numero introducido es menor que 1");
			System.out.println("Debes introducir un numero nuevo:");
			numero=consola.nextInt();
		}
		for (resnumero=1; resnumero<=numero; resnumero++) {
			System.out.println(resnumero);
		
		}
		
		
		
		
		
		consola.close();

	}

}
