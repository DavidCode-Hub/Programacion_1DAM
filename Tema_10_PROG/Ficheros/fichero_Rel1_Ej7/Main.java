package fichero_Rel1_Ej7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner consola =new Scanner (System.in);
		
		System.out.println("Introducir el nombre del fichero a recoger");
		String nombreFich= consola.nextLine();
		
		String filePath="Ficheros/fichero_Rel1_Ej7/"+nombreFich+".txt";
		int suma=0,numero=0,contador=0;
		try {
			
			BufferedReader br1= new BufferedReader(new FileReader(filePath));
			
			while (br1.ready()) {
				
					String linea=br1.readLine(); 
					numero=Integer.parseInt(linea);
					System.out.println("Los numeros son:" + numero);
					suma+=numero;
					contador++;
					
				
			}
			
			System.out.println("La media es: "+suma/contador);
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
			
		}catch (IOException e) {
			System.err.println("Error en lectura");
		}
	}

}
