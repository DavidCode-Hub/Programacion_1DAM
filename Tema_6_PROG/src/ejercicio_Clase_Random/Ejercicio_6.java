package ejercicio_Clase_Random;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		/**
		 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
		 * programa intentará adivinar el número que estás pensando - un número entre 0 y
		 * 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe
		 * preguntar si el número que estás pensando es mayor o menor que el que te acaba
		 * de decir.
		 */
		Scanner sc = new Scanner(System.in);
		
        int min = 0, max = 100, intentos = 7;

        System.out.println("Piensa un número entre 0 y 100. Yo intentaré adivinarlo en " + intentos + " intentos.");

        while (intentos > 0) {
            int guess = (int) (Math.random()*((max-min)+1)+min); 
            System.out.println("¿Es " + guess + "?");
            
            System.out.println("Responde: 'si', 'mayor' o 'menor'");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("si")) {
                System.out.println("¡Genial! He adivinado tu número.");
                return;
            } else if (respuesta.equals("mayor")) {
                min = guess-min;
            } else if (respuesta.equals("menor")) {
            	max = guess - max;
            } else {
                System.out.println("Respuesta no válida. Usa 'si', 'mayor' o 'menor'.");
                continue;
            }

            intentos--;
            if (intentos == 0) {
                System.out.println("No lo he conseguido en 5 intentos.");
            } else {
                System.out.println("Me quedan " + intentos + " intentos.");
            }
        }
        sc.close();


	}

}
