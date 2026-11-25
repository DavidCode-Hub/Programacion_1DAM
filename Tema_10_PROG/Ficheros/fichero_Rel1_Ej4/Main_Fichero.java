package fichero_Rel1_Ej4;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main_Fichero {

	public static void main(String[] args) {
		String fichero1 = "Ficheros/fichero_Rel1_Ej4/FicheroBase1.txt";
		String fichero2 = "Ficheros/fichero_Rel1_Ej4/Ficherobase2.txt";

		String fichero3 = "Ficheros/fichero_Rel1_Ej4/FicheroFinal3.txt";

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
			BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
			
			BufferedWriter bw1 =new BufferedWriter(new FileWriter(fichero3, false));
			
			
			while (br1.ready() || br2.ready()) {
				String linea1= br1.readLine();
				String linea2= br2.readLine();
				
				if (linea1!=null) {
					bw1.write(linea1);
					bw1.newLine();
				}
				if (linea2!=null) {
					bw1.write(linea2);
					bw1.newLine();
				}
			}
			br1.close();
			br2.close();
			bw1.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("No se pueden leer los valores");
		}

	}

}
