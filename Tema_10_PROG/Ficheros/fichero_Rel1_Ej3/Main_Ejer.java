package fichero_Rel1_Ej3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main_Ejer {

	public static void main(String[] args) {
		String fichero = "Ficheros/fichero_Rel1_Ej3/fichero1.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			
			String linea ="";
			
			int suma=0, numero;
			
			while (br.ready()) {
				linea= br.readLine();
				
				numero=Integer.parseInt(linea);
				
				System.out.println(numero);
				suma+=numero;
			}
			
			System.out.println(suma);
			
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.err.println("Error en la lectura.");
		}
	}

}
