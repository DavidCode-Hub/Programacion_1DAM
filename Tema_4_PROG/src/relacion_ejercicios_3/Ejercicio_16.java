package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		double precio, resivaprecio, resprecio=0, general, reducido, superreducido, total=0;
		String petiva;

		String codigoprom;
		
		System.out.print("Introduce el precio del articulo: ");
		precio = consola.nextDouble();
		
		while (precio<0) {
			System.out.println("El precio del articulo no puede ser negativo");
			System.out.print("Introduce el precio del articulo: ");
		precio = consola.nextDouble();
		
		}consola.nextLine();

		

		
		System.out.print("Introduce el tipo de iva: (general, reducido, superreducido): ");
		petiva = consola.nextLine().toLowerCase();
		
		

		

			switch (petiva) {
			case "general":
				resivaprecio = precio * 1.21;

				break;
			case "reducido":
				resivaprecio = precio * 1.10;

				break;
			case "superreducido":
				resivaprecio = precio * 1.04;

				break;

			default:
				System.out.print("El precio introducido no es valido, se le aplicara sin IVA: ");
				resivaprecio = precio;
				break;

			}System.out.println(resivaprecio);
			
			
			System.out.print("Introduce el codigo promocional (nopro,mitad,meno5 o 5porc): ");
			codigoprom = consola.nextLine().toLowerCase();

			
				switch (codigoprom) {

				case "nopro":
					resprecio = 0;

					break;
				case "mitad":
					resprecio = resivaprecio / 2;

					break;
				case "menos5":
					resprecio = resivaprecio - 5;

					break;
				case "5porc":
					resprecio = resivaprecio * 0.95;

					break;

				default:
					

					break;

				}System.out.println(resprecio);
			total=resivaprecio-resprecio;

			System.out.printf("\n\n El precio de base imponible es: %8.2f \n" , precio);
			System.out.printf("Iva (%s): %25.2f \n", petiva, resivaprecio);
			System.out.printf("Precio con IVA %26.2f \n" , resivaprecio);
			System.out.printf("Cod. Prom (%s) %23.2f \n",codigoprom, resivaprecio);
			System.out.printf("TOTAL %35.2f", total);
			consola.close();

		}

	}

