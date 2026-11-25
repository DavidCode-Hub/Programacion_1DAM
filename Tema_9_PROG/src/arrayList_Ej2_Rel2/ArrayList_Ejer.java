package arrayList_Ej2_Rel2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Ejer {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int numero;
		int opc = -1;

		do {

			switch (opc) {
			case -1:

				menu();
				System.out.println("Debes elegir una opción del menú");
				opc = consola.nextInt();

				while (opc < 1 || opc > 6 && opc != 99) {
					System.out.println("Debes indicar una opción correcta del menú");
					opc = consola.nextInt();

				}

				break;

			case 1: // Caso administrador

				System.out.println("1.Agregar un número");
				numero = consola.nextInt();

				numeros.add(numero);

				opc = -1;
				break;

			case 2:
				System.out.println("2.Buscar un número");
				System.out.println("Numero a buscar: ");
				int num = consola.nextInt();
				for (int i = 0; i < numeros.size(); i++) {

					if (numeros.get(i).intValue() == num) {

						System.out.println("Numero encontrado" + numeros.get(i).intValue());
					}
				}

				opc = -1;
				break;

			case 3:
				System.out.println("3.Modificar un número");

				System.out.println("Indice a buscar: ");
				int num1 = consola.nextInt();

				System.out.println("Numero a modificar");
				int nummod = consola.nextInt();

				if (num1 <= numeros.size()) {
					numeros.add(num1, nummod);
				}

				opc = -1;
				break;

			case 4:
				System.out.println("4.Eliminar un número");

				opc = -1;
				break;

			case 5:
				System.out.println("5.Agregar un número");

				opc = -1;
				break;

			default:

				break;
			}

		} while (opc != 99);
		System.out.println("El programa ha terminado");

	}

	public static void menu() {
		System.out.println("1.Agregar un número\n2.Buscar un número \n3.Modificar un"
				+ "número \n4.Eliminar un número \n5.Insertar un número en una posición dada \n\n00 Para salir");
	}

}
