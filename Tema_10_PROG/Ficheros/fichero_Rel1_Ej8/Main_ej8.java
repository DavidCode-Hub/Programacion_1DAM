package fichero_Rel1_Ej8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main_ej8 {

	public static void main(String[] args) {
		String filepathwords="Ficheros/fichero_Rel1_Ej8/ficheropalabras.txt";
		String filesort="Ficheros/fichero_Rel1_Ej8/ficheropalabras_sort.txt";
		ArrayList<String> palabras=new ArrayList<String>();
		
		try {
			BufferedReader br1 =new BufferedReader(new FileReader(filepathwords));
			
			BufferedWriter bw1 =new BufferedWriter(new FileWriter(filesort,false));
			
			while (br1.ready()) {
				String linea=br1.readLine();
				
				palabras.add(linea);
				
			}
			
			Collections.sort(palabras);
			
			for (int i = 0; i < palabras.size(); i++) {
				String linea=palabras.get(i);
				bw1.write(linea);
				bw1.newLine();
			}
			
			br1.close();
			bw1.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		}catch (IOException e) {
			System.out.println("No ha encontrado nada en el fichero");
		}

	}

}
