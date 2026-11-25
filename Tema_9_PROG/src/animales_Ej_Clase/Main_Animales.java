package animales_Ej_Clase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Animales {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		ArrayList<Animal> listaanimales=new ArrayList<Animal>();
		
		int opc = -1;

		do {
			
			switch (opc) {
			case -1:

				menu();
				System.out.println("Debes elegir una opción del menú");
				opc=consola.nextInt();
				
				while (opc < 1 || opc > 2 && opc!=10) {
					System.out.println("Debes indicar una opción correcta del menú");
					opc=consola.nextInt();

				}
				
				break;

			case 1: // Caso administrador
				
				
				System.out.println("Has entrado en el modo de Administrador");
				int opc2=-1;
				
				do {
					
					switch (opc2=-1) {
					case -1:
						
						menu2();
						System.out.println("Debes elegir una opción del menú");
						opc=consola.nextInt();
						
						while (opc2 < 1 || opc2 > 2 && opc2!=10) {
							System.out.println("Debes indicar una opción correcta del menú");
							opc=consola.nextInt();
							
						}
						break;
						
					case 1:
						
						System.out.println("Introduce los datos del Perro");
						
						
						break;

					default:
						break;
					}
					
				} while (opc!=10); // Menu adminsitrador
				
				
				
				
				
				opc = -1;
				break;

			case 2:
				System.out.println("Has entrado en el modo de Usuario");
				opc = -1;
				break;

//			case 3:
//
//				opc = -1;
//				break;
//
//			case 4:
//
//				opc = -1;
//				break;
//
//			case 5:
//
//				opc = -1;
//				break;
//
//			case 6:
//
//				opc = -1;
//				break;
//
//			case 7:
//
//				opc = -1;
//				break;
//
//			case 10:
//
//				
//				break;

			default:

				break;
			}

		} while (opc != 10);
		System.out.println("El programa ha terminado");

	}

	public static void menu() {
		System.out.println("Tipo de usuario\n1.-Adminsitrado\n2.-Usuario");
	}
	
	public static void menu2() {
		System.out.println("Tipo de usuario\n1.-Adminsitrado\n2.-Usuario");
	}

}
