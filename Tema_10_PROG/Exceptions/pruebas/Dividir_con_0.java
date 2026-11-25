package pruebas;

import java.util.Scanner;

public class Dividir_con_0 {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);
		System.out.println("Manzanas");
		int pmanzanas = Integer.parseInt(consola.nextLine());
		System.out.println("Personas para dividir");
		int personas = Integer.parseInt(consola.nextLine());

		try {
			System.out.println("A cada persona le corresponden" + reparteManzanas(pmanzanas, personas) + "manzanas");
		} catch (ArithmeticException ae) {
			System.out.println("los numeros introducidos no son validos");
		}

		consola.close();

	}

	
	public static int reparteManzanas(int manzanas, int personas) throws ArithmeticException {
		try {
			
			return manzanas / personas;
			
		} catch (ArithmeticException ae) {
			System.out.println("El numero introducido es 0");
			throw ae;
		}

	}

}
