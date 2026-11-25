package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_Simulacro2 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int kilos, destino;
		double coste, costedestino1 = 24, costedestino2 = 20, costedestino3 = 21, costedestino4 = 10,
				costedestino5 = 18;

		System.out.println("Introduce los kilos de su paquete:");

		kilos = consola.nextInt();
		if (kilos < 5 && kilos > 1) {
			System.out.println("Debes introducir el destino del paquete: (debe seleccionarlo con numeros) ");
			System.out.println("1 - América del Norte, 2- América Central, 3- América del Sur, 4- Europa, 5- Asia");
			destino = consola.nextInt();
			switch (destino) {
			case 1:
				System.out.println("Su destino de envio ha sido seleccionado como: America del Norte");
				coste = kilos * costedestino1;
				
				System.out.println("Su coste es de: " + coste + " €");
				break;
			case 2:
				System.out.println("Su destino de envio ha sido seleccionado como: America Central");
				coste = kilos * costedestino2;
				
				System.out.println("Su coste es de: " + coste + " €");
				break;
			case 3:
				System.out.println("Su destino de envio ha sido seleccionado como: America del Sur");
				coste = kilos * costedestino3;
				
				System.out.println("Su coste es de: " + coste + " €");
				break;
			case 4:
				System.out.println("Su destino de envio ha sido seleccionado como: Europa");
				coste = kilos * costedestino4;
				
				System.out.println("Su coste es de: " + coste + " €");
				break;
			case 5:
				System.out.println("Su destino de envio ha sido seleccionado como: Asia");
				coste = kilos * costedestino5;
				
				System.out.println("Su coste es de: " + coste + " €");
				break;

			default:System.out.println("Error al introducir un caracter no permitido");
				break;
			}
		} else {
			System.out.println("Lo sentimos el peso de su paquete no puede ser transportado por nuestra empresa");
		}

		consola.close();
	}

}
