package pruebaFileWriter_Con_2_Ficheros_en_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura_Lectura {

	public static void main(String[] args) {
		String fichero1 = "Ficheros/pruebaFileWriter_Con_2_Ficheros_en_1/fichero1.txt";
		String fichero2 = "Ficheros/pruebaFileWriter_Con_2_Ficheros_en_1/fichero2.txt";
		String fichero3final = "Ficheros/pruebaFileWriter_Con_2_Ficheros_en_1/fichero3.txt";

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
			BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
			
			
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(fichero3final,false));
			
			while (br1.ready()|| br2.ready()) {
				String Linea1=br1.readLine();
				String Linea2=br2.readLine();
				
				if (Linea1 != null) {
					bw1.write(Linea1);
					bw1.newLine();
				} 
				if (Linea2 != null) {
					bw1.write(Linea2);
					bw1.newLine();
				} 
				
			}
			
			
			br1.close();
			br2.close();
			bw1.close();
			
			
		} catch (FileNotFoundException ex) {
			System.out.println("Mensaje de exception: " + ex.getMessage());
		} catch (IOException ec) {
			System.out.println("Mensaje de exception: " + ec.getMessage());
		}

		
	}

}
