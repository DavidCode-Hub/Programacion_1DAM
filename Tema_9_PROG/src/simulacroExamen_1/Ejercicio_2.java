package simulacroExamen_1;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		HashMap<String, String> trabajadores = new HashMap<String, String>();

		trabajadores.put("12345678A", "Armando Guerra Segura");

		trabajadores.put("2222222A", "Armando Guerra");

		int opc = -1;

		do {

			switch (opc) {
			case -1:

				menu();
				System.out.println("Debes elegir una opción del menú");
				opc = consola.nextInt();
				consola.nextLine();

				while (opc < 1 || opc > 7 && opc != 99) {
					System.out.println("Debes indicar una opción correcta del menú");
					opc = consola.nextInt();
					consola.nextLine();
				}
				break;

			case 1: //

				System.out.println("1.Introducir N trabajadores");

				System.out.println("Cuantos trabajadores quieres introducir");
				int numtrab = consola.nextInt();
				consola.next();

				anadirtrabajadores(consola, trabajadores, numtrab);

				opc = -1;
				break;

			case 2:
				System.out.println("2.Busqueda por DNI");

				buscarDni(consola, trabajadores);

				opc = -1;
				break;

			case 3:
				System.out.println("3.Busqueda por nombre");

				buscarNombre(consola, trabajadores);

				opc = -1;
				break;

			case 4:
				System.out.println("4.Modifica el trabajador");
				
				
				String dnimodif, nuevodni,nuevonombre;				
				System.out.println("Introdroduce el DNI del trabajador a modificar");
				dnimodif=consola.nextLine();
				
				System.out.println("Introduce el nuevo DNI:");
				nuevodni=consola.nextLine();
				
				System.out.println("Introduce el nuevo Nombre:");
				nuevonombre=consola.nextLine();
				
				trabajadores.remove(dnimodif);
				
				trabajadores.put(nuevodni, nuevonombre);
				
				
				
				
				System.out.println(trabajadores);

				opc = -1;
				break;

			case 5:
				System.out.println("5.");

				opc = -1;
				break;
				
			case 6:
				System.out.println("6. Listar trabajadores");
				
				listarTrabajadores(trabajadores);
				
				opc = -1;
				break;
				
			default:

				break;
			}

		} while (opc != 99);
		System.out.println("El programa ha terminado");

	}

	/**
	 * @param consola
	 * @param trabajadores
	 * @param numtrab
	 */
	public static void anadirtrabajadores(Scanner consola, HashMap<String, String> trabajadores, int numtrab) {
		String dni, nombre;

		Iterator<Map.Entry<String, String>> itera = trabajadores.entrySet().iterator();

		for (int i = 0; i < numtrab; i++) {

			System.out.println("Introduce el numero de DNI de un trabajador");
			dni = consola.nextLine().toUpperCase();

			itera = trabajadores.entrySet().iterator();

			while (itera.hasNext()) {
				Map.Entry<String, String> entradadni = (Map.Entry<String, String>) itera.next();

				if (entradadni.getKey().equals(dni)) {
					System.out.println("El usuario esta ya dentro de la base de datos");
				}

			}
			

		} // Fin For
	}

	/**
	 * @param consola
	 * @param trabajadores
	 */
	public static void buscarDni(Scanner consola, HashMap<String, String> trabajadores) {
		Iterator<Map.Entry<String, String>> itera;
		itera = trabajadores.entrySet().iterator();

		String buscardni;

		System.out.println("Interoduce el DNI del trabajador a buscar");
		buscardni = consola.nextLine();
		boolean encontrado = true;

		while (itera.hasNext()) {
			Map.Entry<String, String> busquedaNIF = (Map.Entry<String, String>) itera.next();

			if (busquedaNIF.getKey().equalsIgnoreCase(buscardni)) {
				System.out.println("Su nombre es" + busquedaNIF.getValue());
				encontrado = false;
				break;
			}

		}

		if (!encontrado) {
			System.out.println("El usuario no ha sido encontrado");
		}
	}

	/**
	 * @param consola
	 * @param trabajadores
	 */
	public static void buscarNombre(Scanner consola, HashMap<String, String> trabajadores) {
		Iterator<Map.Entry<String, String>> itera;
		itera = trabajadores.entrySet().iterator();

		String buscarnombre;

		System.out.println("Interoduce el DNI del trabajador a buscar");
		buscarnombre = consola.nextLine();
		boolean encontrado2 = true;

		while (itera.hasNext()) {
			Map.Entry<String, String> busquedaNombre = (Map.Entry<String, String>) itera.next();

			if (busquedaNombre.getValue().equalsIgnoreCase(buscarnombre)) {
				System.out.println("Su DNI es" + busquedaNombre.getKey());
				encontrado2 = false;
				break;
			}

		}

		if (!encontrado2) {
			System.out.println("El usuario no ha sido encontrado");
		}
	}
	
	

	/**
	 * @param trabajadores -HashMap
	 */
	private static void listarTrabajadores(HashMap<String, String> trabajadores) {
		Iterator<Map.Entry<String, String>> itera;
		itera=trabajadores.entrySet().iterator();
		
		while (itera.hasNext()) {
			Map.Entry<String, String> listartrabaja = (Map.Entry<String, String>) itera.next();
			System.out.println("\n\nLos trabajadores son: "+listartrabaja);
		}
	}

	public static void menu() {
		System.out.println("┌──────────────────MENU──────────────────┐");
		System.out.println("│ 0. Salir                               │");
		System.out.println("│ 1. Introducir un trabajador            │");
		System.out.println("│ 2. Buscar un trabajador por NIF        │");
		System.out.println("│ 3. Buscar un trabajador por nombre     │");
		System.out.println("│ 4. Modificar un trabajador             │");
		System.out.println("│ 5. Borrar un trabajador                │");
		System.out.println("│ 6. Listar un trabajador                │");
		System.out.println("├────────────────────────────────────────┤");
		System.out.println("│ Introduce una opción (0-5):            │");
		System.out.println("└────────────────────────────────────────┘");
		System.out.println();
		System.out.println("Elige una opción: ");
	}

}
