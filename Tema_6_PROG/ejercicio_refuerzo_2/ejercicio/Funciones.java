package ejercicio;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int opc = -1;

		while (opc != 0) {
			switch (opc) {

			case -1:
				opc = -1;
				opc = Llamada_Funciones.menu(consola);

				while (opc > 0 && opc <= 15) {
					System.out.println("Error introduce una opción del menú:");
					opc = consola.nextInt();

				}
				break;
			case 1:
				System.out.println(
						"Calcular la raíz cuadrada de un número\nIntroduce el numero para la raiz" + "cuadrada: ");
				int num1 = consola.nextInt();

				double resultraiz = Math.sqrt(num1);

				System.out.println("La raiz cuadrada es: " + resultraiz);
				
				opc = -1;
				break;
			case 2:

				System.out.println("Contar vocales de una cadena: ");

				String cadena;
				
				consola.next();
				cadena = consola.nextLine();
				
				
				char caracter[]=new char[cadena.length()];
				
				caracter=cadena.toCharArray();
				
				int cantvocal=Llamada_Funciones.contarvocales(caracter);
				
				opc = -1;
				
				break;
			case 3:

				opc = -1;
				break;
			case 4:

				opc = -1;
				break;
			case 5:

				opc = -1;
				break;
			case 6:

				opc = -1;
				break;
			case 7:

				opc = -1;
				break;
			case 8:

				opc = -1;
				break;
			case 10:

				opc = -1;
				break;
			case 11:

				opc = -1;
				break;
			case 12:

				opc = -1;
				break;
			case 13:

				opc = -1;
				break;
			case 14:

				opc = -1;
				break;
			case 15:

				opc = 0;
				break;

			default:
				break;
			}
		}

	}// Fin Public

}
