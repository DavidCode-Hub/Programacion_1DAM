package pruebaFileWriter_Escribir_Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Prueba_Escribir_Ficheros {

	public static void main(String[] args) {
		String [] lineas = {"Uno", "Dos", "Tres", "Cuatro","Cinco","..."};
		
		try {
			FileWriter fichero= new FileWriter("Ficheros/pruebaFileWriter_Escribir_Ficheros/pruebaescritura.txt", true);
			
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}
			
			
			
		} catch (IOException e) {
			System.out.println("Mensaje de la exception: "+ e.getMessage());
		}

	}

}
