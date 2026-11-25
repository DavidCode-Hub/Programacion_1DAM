package Relacion_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int passw = 1423;
		int cont = 0;
		int intento;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce la contraseña(número de 4 cifras):");
			intento = sc.nextInt();
			if(cont<3 && intento != passw) {
				System.out.println("Contraeña erronea, prueba de nuevo.\n");
				cont++;
			}else if(cont == 3 && intento != passw) {
				System.out.println("Contraeña erronea, no hay más intentos.\n");
				cont++;
			}
		}while(cont<4 && intento != passw);
		
		if(intento == passw)
			System.out.println("Contraseña correcta.");
		
		sc.close();

	}

}
