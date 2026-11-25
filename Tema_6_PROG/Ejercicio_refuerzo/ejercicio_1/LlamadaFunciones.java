package ejercicio_1;

import java.util.Scanner;

public class LlamadaFunciones {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		int opc = -1;
		
		int array1[] = new int[10];
		
		while (opc != 0) {
			

			switch (opc) {
			case -1:
				System.out.println("\n");
				Funciones.menu();
				System.out.println("Introduce una opción de menú: ");
				opc=consola.nextInt();
				
				while (opc < 0 && opc >= 11) {
					System.out.print("Error,");
					System.out.println("introduce una opción del menú: ");
					opc = consola.nextInt();
				}
				
				break;

			case 1:
				System.out.println("Rellena el array");
				int cant=10;
				
				array1=Funciones.rellenararrayconsola(cant, consola);
				
				Funciones.muestraarray(array1);
				
				opc=-1;
				
				break;
			case 2:
				System.out.println("Rellena el array");
				
					
				System.out.println("Introduce el número maximo: ");
				int max=consola.nextInt();
				
				System.out.println("Introduce el número minimo: ");
				int min=consola.nextInt();
				
				array1=Funciones.rellenararrayaleatorio(max, min);
				
				Funciones.muestraarray(array1);
				
				opc=-1;
				
				break;
			case 3:
				System.out.println("Se va aproceder a borrar el array: ");
				
				array1=Funciones.borrararray(array1);
				
				Funciones.muestraarray(array1);
				opc=-1;
				break;
			case 4:
				int opcion;
				
				opcion=Funciones.introducir_borrar(consola);
			
				
				switch (opcion) {
				
				case 1:
					
					array1=Funciones.borrarElemento(array1,consola);
					
					Funciones.muestraarray(array1);
					
					break;
					
				case 2:
					
					array1=Funciones.introducirElementos(array1,consola);
					
					break;

				default:
					break;
					
					
				}//Fin Switch caso 4
				opc=-1;
				
				break;
				
			case 5:
								
				Funciones.listarcontenido(array1);
				opc=-1;
				
				break;
			case 6:
				
				Funciones.listarprimos(array1);
				opc=-1;
				break;
			case 7:
				double media;
				
				media=Funciones.mediaprimos(array1);
				System.out.println("La media es: "+media);
				opc=-1;
				break;

			default:
				break;
			}// Fin Switch
			
		} // Fin While
		System.out.println("Sistema Apagado");
		consola.close();
	}

}
