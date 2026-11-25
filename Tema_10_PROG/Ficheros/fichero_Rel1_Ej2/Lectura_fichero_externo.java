package fichero_Rel1_Ej2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura_fichero_externo {

	public static void main(String[] args) {
		String fichero= "Ficheros/fichero_Rel1_Ej2/fichero1.txt";

		try {
			
			BufferedReader br1= new BufferedReader(new FileReader(fichero));
			
			String linea1="";
			
			while (linea1 !=null) {
				System.out.print(linea1 + "");
				linea1 = br1.readLine();
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede mostrar el archivo");
		}catch (IOException e) {
			System.out.println("Error de Lectura");
		}
	}

}
