package ejercicios_HashMap_Rel1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_1_Rel1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		HashMap<String, String> verifContra = new HashMap<String, String>();

		boolean aceptado = true;
		verifContra.put("dsevlar047", "1234");

		String usuario;
		String contrasena;

		System.out.println("Introduce usuario:");
		usuario = consola.nextLine();
		System.out.println("Introduce contraseña");
		contrasena = consola.nextLine();

		for (int i = 3; i >= 0 && aceptado; i--) {

			for (Map.Entry<String, String> usucontra : verifContra.entrySet()) {

				if (usucontra.getKey().equals(usuario) && usucontra.getValue().equals(contrasena)) {

					System.out.println("Ha accedido al Panel de Administrador");
					aceptado = false;
					break;

				} else {
					System.out.println("Tiene " + i + " intentos");
					System.out.println("Introduce usuario de nuevo:");
					usuario = consola.nextLine();
					System.out.println("Introduce contraseña de nuevo:");
					contrasena = consola.nextLine();
					break;
				}

			}

		}
		consola.close();
	}

}
