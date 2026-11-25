package fichero_Rel1_Ej1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero_Num_Primos {

	public static void main(String[] args) {
		String fichero1= "Ficheros/fichero_Rel1_Ej1/fichero1.txt";
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero1,false));
		for (int i = 0; i < 500; i++) {
			
			if (Varias.esPrimo(i)) {
				
				bw.write(String.valueOf(i));
				bw.newLine();
				
				System.out.println(String.valueOf(i));
			}
		}
		
		bw.close();
			
			
		} catch (IOException e) {
			System.out.println("Error de Escritura.");
		}
		

	}

}
