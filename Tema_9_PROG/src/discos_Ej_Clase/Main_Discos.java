package discos_Ej_Clase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main_Discos {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		ArrayList<Discos> album = new ArrayList<>();
		

		int iddisco = 0;

		album.add(new Discos(iddisco, "Fito", "Por la raja de tu falda", "POP", 360));
		iddisco++;
		album.add(new Discos(iddisco, "aaaa", "Por la caja de cambios", "ROCK", 240));
		iddisco++;
		album.add(new Discos(iddisco, "bbbb", "Amortiguador", "POP", 500));
		iddisco++;
		album.add(new Discos(iddisco, "cccc", "Rueda", "POP", 190));
		iddisco++;
		
		

		int opc = -1;

		do {
			
		Iterator<Discos> it_discos = album.iterator();
		switch (opc) {
			case -1:

				menu();
				System.out.println("Debes elegir una opción del menú");
				opc = consola.nextInt();

				while (opc < 1 || opc > 2 && opc != 6) {
					System.out.println("Debes indicar una opción correcta del menú");
					opc = consola.nextInt();
					

				}

				break;

			case 1: // Listar
				
				
				listar(it_discos);
				
				opc = -1;
				break;

			case 2: // NUevo Disco
		
				String autor, titulo, sexo;
				int duracion;
			
				
				System.out.println("Autor del disco ");
				consola.next();
				autor=consola.nextLine();
				
				System.out.println("Titulo del disco ");
				titulo=consola.nextLine();
				
				System.out.println("Sexo del disco ");
				sexo=consola.nextLine();
				
				System.out.println("Duracion del disco ");
				duracion=consola.nextInt();
				
				album.add(new Discos(iddisco, autor, titulo, sexo, duracion));
				iddisco++;
				
				opc = -1;
				break;

			case 3:
				
				listar(it_discos);
				
				System.out.println("¿Que disco deseas modificar?");
				int identificador=consola.nextInt();
				
				for (int i = 0; i < album.size(); i++) {
					if (album.get(i).getCodigo()==identificador) {
						
						
						System.out.println("Se va a proceder a modificar la duracion del disco la duracion del disco es " + album.get(i).getDuracion());
						
						System.out.println("La duración que se le quiere asignar al dicos es de:");
						int duracion2=consola.nextInt();
						
						album.get(i).setDuracion(duracion2);
						
					}
				}
				
				opc = -1;
				break;

			case 4:

				opc = -1;
				break;

			case 5:

				opc = -1;
				break;

			case 6:

				opc = 6;

				break;

			default:

				break;
			}

		} while (opc != 6);
		System.out.println("El programa ha terminado");

	}

	public static void menu() {
		System.out.println("\nCOLECCIÓN DE DISCOS");
		System.out.println("================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("2. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Mostrar los discos con duración entre 20 y 60");
		System.out.println("6. Salir");
	}
	
	public static void listar(Iterator it) {
		while(it.hasNext()) {
			Discos disco = (Discos) it.next();
			System.out.println(disco);
		}
	}

}
