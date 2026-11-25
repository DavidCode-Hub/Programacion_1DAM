package inventario_Simulacro_Examen;

import java.util.Scanner;

public class Main_Inventario {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		System.out.println("Ha accedido al Inventario de un Almacen");
		
		Almacen listaalmacen=new Almacen();
		Articulos articulo1=new Articulos();
		Articulos articulo2=new Articulos(2,"Tomate en lata",10,16,5);
		
		int id=0;
		
	
		int opc=-1
				;
		do {
			
			
			switch (opc) {
			case -1:
				
				menu();
				System.out.println("\nDebe elegir una opción del menú");
				opc=consola.nextInt();
				
				while (opc<1 || opc>9) {
					System.out.println("Opción no válida. Introduzca una opción del 1 al 9");
					opc=consola.nextInt();
				}
				
				break;
				
			case 1://Listado Total
			
				System.out.println("Ha seleccionado Listado Total");
				
				opc=-1;
				break;
				
			case 2://Listado Stock
				
				System.out.println("Ha seleccionado Listado Stock");
				opc=-1;
				break;
			case 3://Alta
				//
				System.out.println("Ha seleccionado Alta");
				
				listaalmacen.alta(articulo1);
				
				opc=-1;
				break;
			case 4://Baja
				
				System.out.println("Ha seleccionado Baja");
				System.out.println("Que articulo desea eliminar: ");
				id=consola.nextInt();
				
				listaalmacen.baja(id);
				opc=-1;
				
				break;
			case 5://Modificación
				
				System.out.println("Ha seleccionado Modificación");
				
				System.out.println("Introduce los nuevos datos:\n");
				
				System.out.print("Descripcion: ");
				articulo1.setDescripcion(consola.nextLine());
				
				System.out.print("Precio de compra:");
				articulo1.setPrecio_compra(consola.nextDouble());
				
				System.out.print("Precio de venta:");
				articulo1.setPrecio_venta(consola.nextDouble());
				
				System.out.print("Stock:");
				articulo1.setStock(consola.nextInt());
				
				opc=-1;
				
				break;
			case 6://Entrada mercancia
			
				System.out.println("Ha seleccionado Entrada Mercancia");
				opc=-1;
				break;
			case 7://Salida mercancia
				
				
				System.out.println("Ha seleccionado Salida Mercancia");
				opc=-1;
				break;
			case 8://Otros
				
				System.out.println("Ha seleccionado Otros");
				opc=-1;
				break;
			case 9://Salir
				
				System.out.println("Ha seleccionado Salir. Hasta pronto!");
				opc=9;
				break;

			default:
				break;
			}
			
			
		} while (opc!=9);
		System.out.println("Ha salido del programa.");
		
		
		
	}
	
	public static void menu() {
		System.out.println("1. Listado total\n"
				+ "2. Listado stock\n"
				+ "3. Alta\n"
				+ "4. Baja\n"
				+ "5. Modificación\n"
				+ "6. Entrada de mercancía\n"
				+ "7. Salida de mercancía\n"
				+ "8. Otros\n"
				+ "9. Salir");
	}

}
