package pruebaBufferdReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba3_LecturaDeDosFicheros {

	public static void main(String[] args) {

		String miFichero1 = "Fichero/prueba/prueba.txt";
		String miFichero2 = "Fichero/prueba/prueba2.txt";

		try {
			FileReader fr = new FileReader(miFichero1);
			BufferedReader br = new BufferedReader(fr);

			FileReader fr2 = new FileReader(miFichero2);
			BufferedReader br2 = new BufferedReader(fr2);

			String Linea = "";

			while (br.ready()) {
				
				Linea=br.readLine();
				System.out.println("La linea es: " + Linea);

				
			}

			fr.close();
			br.close();

			fr2.close();
			br2.close();

		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero especificado.");
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero.");
		}
	}

}
