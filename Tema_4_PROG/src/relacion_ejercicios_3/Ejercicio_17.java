package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		long numero,digito,par=0,impar=0;
		
		System.out.println("Introduce un número");
		numero=consola.nextLong();
		
		while (numero<0) {
			System.out.println("El numero introducido es menor que 0");
			System.out.println("Introduce un numero de nuevo positivo: ");
			numero=consola.nextLong();
				
		}if (numero==0) {
			System.out.println("El 0 es numero par.");
			
			
		}else {
			while (numero>0) {
				digito=numero%10; //coger el ultimo digito
				System.out.println("Digito a evaluar:" + digito);
				if (digito % 2==0) {
					par++;
				}else {
					impar++;
				}numero=numero/10; //"Eliminar" el ultimo digito
				System.out.println("Número que queda \n " + numero);
			}
		}
		System.out.println("Los digitos pares son: "+par);
		System.out.println("Los digitos impares son: "+impar);
		
		
	}

}
