package relacion_ejercicios_1;

import java.util.Iterator;

public class Ejercicio_clase_3 {

	public static void main(String[] args) {
		/* generar unamatriz 4x4 y que la diagonal sea igual a 0 */

		int[][] numero = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < numero.length; i++) {
			numero[i][i] = 0;
		}
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				System.out.printf("%5s", numero[i][j]);
			}System.out.println();
			
		}

	}

}
