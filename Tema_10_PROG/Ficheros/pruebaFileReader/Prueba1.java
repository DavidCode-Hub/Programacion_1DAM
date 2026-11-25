package pruebaFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba1 {

	public static void main(String[] args) {
		String miFichero = "Fichero/prueba/prueba.txt";

		try {
			FileReader fr = new FileReader(miFichero);

			int c = fr.read(); // Leo un caracter como entero

			while (c != -1) {
				System.out.println("El caracter UNICODE: " + c);
				System.out.println("El caracter: " + (char) c);

				c = fr.read();
			}

			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero especificado.");
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
