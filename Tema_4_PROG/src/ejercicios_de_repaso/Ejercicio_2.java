package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		/*
		 * Una empresa de transporte internacional tiene servicio en los siguientes
		 * países: América del Norte, América Central, América del Sur, Europa y Asia. A
		 * continuación, mostramos el coste del servicio de transporte dependiendo del
		 * peso de un paquete y la zona a la que va dirigida: ZONA UBICACIÓN
		 * COSTO/KILOGRAMO 1 América del Norte 24,00 euros 2 América Central 20, 00
		 * euros 3 América del Sur 21,00 euros 4 Europa 10,00 euros 5 Asia 18,00 euros
		 * Parte de su política implica que los paquetes con un peso superior a 5kg no
		 * son transportados, por cuestiones de logística y seguridad. Y los paquetes
		 * cuyo peso es menor a 1 kg tampoco son aceptados por la empresa de
		 * transportes. Realiza un algoritmo para determinar el cobro por la entrega de
		 * un paquete o, en su caso, el rechazo de la entrega. Para ello, debes pedir el
		 * peso del paquete que debes enviar y debes calcular el coste del envío en la
		 * zona elegida. Utiliza alternativas y switch para resolver el ejercicio.
		 */

		Scanner consola = new Scanner(System.in);

		double kilogramos, coste = 0;
		int destino;

		System.out.println("Introduce el peso de su paquete: ");
		kilogramos = consola.nextDouble();

		if (kilogramos <= 1 || kilogramos >= 5) {
			System.out.println(
					"Lo sentimos pero nuestra politica de envios no permite que los paquetes pesen más de 5kg y menos de 1kg");

		} else {
			System.out.println(
					"Introduce el destino con numeros\nSiendo 1-America del Norte 2- America Central 3- America del Sur 4-Europa 5-Asia");
			destino = consola.nextInt();

			switch (destino) {
			case 1:
				System.out.println("Ha elegido como destino America Central su coste es de: ");
				coste = kilogramos * 24;
				break;

			case 2:
				System.out.println("Ha elegido como destino America Central su coste es de: ");
				coste = kilogramos * 20;
				break;
			case 3:
				System.out.println("Ha elegido como destino America Central su coste es de: ");
				coste = kilogramos * 21;
				break;
			case 4:
				System.out.println("Ha elegido como destino America Central su coste es de: ");
				coste = kilogramos * 10;
				break;
			case 5:
				System.out.println("Ha elegido como destino America Central su coste es de: ");
				coste = kilogramos * 18;
				break;

			default:
				System.out.println("El destino introducido no esta incluido en nuestra politica de transporte!!");
				break;
			}

		}

	}

}
