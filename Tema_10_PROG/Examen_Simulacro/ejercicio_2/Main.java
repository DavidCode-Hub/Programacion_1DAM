package ejercicio_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		final String filepath="Examen_Simulacro/ejercicio_2/persona.txt";
		final String filepath2="Examen_Simulacro/ejercicio_2/localidad.txt";
		boolean sigue=false;
		String nombre,profesion;
		int edad;
		
		do {
			
		} while (sigue);
		try {
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(filepath,false));			
			System.out.println("Introduce el nombre de la persona;");
			nombre=consola.nextLine();
			System.out.println("Introduce la edad de la persona;");	
			edad=consola.nextInt();
			consola.nextLine();
			System.out.println("Introduce la profesion de la persona;");
			profesion=consola.nextLine();
			
			bw1.write(nombre+";"+edad+";"+profesion);
			bw1.newLine();
			
			bw1.close();
			
			
			BufferedReader br1=new BufferedReader(new FileReader(filepath));
			BufferedReader br2 = new BufferedReader(new FileReader(filepath));
			
			while (br1.ready()) {
				String linea=br1.readLine();
				String linea2=br2.readLine();
				
				
			}
		
		
		
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		}catch (IOException e) {
			System.err.println("Error de lectura");
		}catch (InputMismatchException e) {
			System.err.println("El tipo introducido no es el esperado");
		}
				

	}

}
