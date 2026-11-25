package fichero_Rel1_Ej5;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main_Ejercicio {

	public static void main(String[] args) {
		LocalTime timenow= LocalTime.now();
		DateTimeFormatter timeform = DateTimeFormatter.ofPattern("HH_mm_ss");
		
		
		String filePath= "Ficheros/fichero_Rel1_Ej5/"+timenow.format(timeform)+".txt";
		
		try {
			
			
			BufferedWriter bw1= new BufferedWriter(new FileWriter(filePath, false));
			
			for (int i = 0; i < 5; i++) {
				
				int numAlet = (int)(Math.random()*((100-5)+1)+5);
				bw1.write(String.valueOf(numAlet));
				bw1.newLine();
			}
			
			bw1.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero asignado");
		}catch (IOException e) {
			System.err.println("El tipo de dato no es valido");
		}
				
		

	}

}
