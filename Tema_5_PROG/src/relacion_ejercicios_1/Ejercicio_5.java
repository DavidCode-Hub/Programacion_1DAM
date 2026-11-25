package relacion_ejercicios_1;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		/*Realiza un programa que sea capaz de rellenar una matriz 4x4 con cadenas de caracteres, y sea
		capaz de devolver la cadena que contenga las 5 vocales.
		Para realizar el programa no se tendrá en cuenta que esté en mayúsculas o minúsculas, lo que
		significa que debes convertir las cadenas a mayúsculas o a minúsculas para ser evaluadas.
		Investiga en la API de Java el método indexOf para ver si es posible utilizarlo en este ejercicio.*/
		
 		
		Scanner consola = new Scanner(System.in);
        String[][] matriz = new String[4][4]; // matriz de 4x4 cadenas
        
        // Rellenamos la matriz con palabras
        System.out.println("Introduce palabras para llenar la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Palabra [" + i + "][" + j + "]: ");
                matriz[i][j] = consola.nextLine().toLowerCase();
            }
        }

  
        System.out.println("\nPalabras que contienen las 5 vocales:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            	
                 String palabra = matriz[i][j]; // Pasar la palabra a un string "fijo" para poder evaluarlo con indexOf.

                // Verificamos si contiene todas las vocales
                if (palabra.indexOf('a') != -1 &&
                    palabra.indexOf('e') != -1 &&
                    palabra.indexOf('i') != -1 &&
                    palabra.indexOf('o') != -1 &&
                    palabra.indexOf('u') != -1) {
                	System.out.println(palabra.indexOf('a'));

                    System.out.println("--> " + matriz[i][j]);
                }
            }
        }

        consola.close();
	}

}
