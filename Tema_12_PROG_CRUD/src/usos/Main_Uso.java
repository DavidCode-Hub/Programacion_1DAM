package usos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import animal.Animal;
import animal.AnimalDAO;
import connection.ConnectBD;

public class Main_Uso {

	public static void main(String[] args) {
		Connection conn = ConnectBD.conectar();
		
		AnimalDAO animal_funciones= new AnimalDAO(conn);
		Scanner consola= new Scanner (System.in);
		
		
		
		
		
		try {
			
			
			
			Animal animal1= new Animal("ruben", "León", 25, 74, 3, "Las jirafas", "LATERAL2");
			
//			animal_funciones.create(animal1);
//			System.out.println("Operación de lectura");
			
//			
//			animal_funciones.read();
//			
			System.out.println("Parte de Update");
			animal_funciones.update("RUBEN", "RODOLFO" , conn);
//			
//			animal_funciones.delete("RODOLFO");
			
			conn.close();
			
		} catch ( SQLException e) {
			
		}
		
		
		
		

	}

}
