package fichero_Rel1_Ej10_Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Ej_10 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		Agenda listacontactos= new Agenda();
		String filepath = "Ficheros/fichero_Rel1_Ej10_Agenda/agenda_base.txt";
		String filepath2= "Ficheros/fichero_Rel1_Ej10_Agenda/agenda_final.txt";
		
		try {
			BufferedWriter bw1 =new BufferedWriter(new FileWriter(filepath2,false));
			
			bw1.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se ha encontrado.");
		}catch (IOException e) {
			System.out.println("Error de escritura.");
		}
		
		
		String nombre="";
		int numero;

		int opc = -1;

		do {

			switch (opc) {
			case -1:
				try {
					menu();
					System.out.println("Debes elegir una opción del menú");
					opc = consola.nextInt();
					consola.nextLine();

					while (opc < 1 || opc > 6 && opc != 99) {
						System.out.println("Debes indicar una opción correcta del menú");
						opc = consola.nextInt();
						consola.nextLine();
					}

				} catch (InputMismatchException e) {
					System.out.println("Debes introducir un numero valido");
					consola.nextLine();
					opc = -1;
				} catch (NumberFormatException e) {
					System.out.println("El numero debe tener un valor corrrecto");
					consola.nextLine();
					opc = -1;
				}

				break;

			case 1: //

				System.out.println("1.Añadir contacto");
				
				System.out.println("Introduce el nombre del contacto");
				nombre = consola.nextLine();
				System.out.println("Introduce el numero de telefono del contacto");

				numero = consola.nextInt();
				
				listacontactos.anadirContacto(nombre,numero);
				opc = -1;
				break;

			case 2:
				System.out.println("2.Eliminar contacto");
				
				System.out.println("Introduce el nombre del contacto a eliminar");
				nombre = consola.nextLine();
				listacontactos.eliminar(nombre);
				opc = -1;
				break;

			case 3:
				System.out.println("3.Mostrar TXT y ArrayList");
				listacontactos.mostrarContactos();
				opc = -1;
				break;

			default:

				break;
			}

		} while (opc != 99);
		System.out.println("El programa ha terminado");
	}

	public static void menu() {
		System.out.println("1.Añadir contacto  \n" + "2.Eliminar contacto  \n" + "3.Mostrar TXT y ArrayList  \n"
				+ "99 Para salir");

	}

}
