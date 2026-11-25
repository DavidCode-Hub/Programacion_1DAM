package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		System.out.println("Introduce la altura del rectangulo (Minimo 2):");
		int altura = consola.nextInt();
	

		for (int fila = altura; fila >= 1; fila--) {
            
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println();
		}
		consola.close();

	}

}
