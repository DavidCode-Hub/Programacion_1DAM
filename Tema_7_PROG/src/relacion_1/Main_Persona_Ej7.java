package relacion_1;

import java.util.Scanner;

public class Main_Persona_Ej7 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		//Introduccion de datos de la persona 1:
		System.out.println("Persona 1: ");
		
		System.out.println("Introduce el nombre de la persona:");
		String nombre = consola.nextLine();
		
		System.out.println("Introduce la edad: ");
		int edad = consola.nextInt();

		System.out.println("Introduce el sexo: (H/M)");
		char sexo = consola.next().charAt(0);

		System.out.println("Debe introducir el peso: ");
		int peso = consola.nextInt();

		System.out.println("Debe introducir la altura: ");
		double altura = consola.nextDouble();
		consola.nextLine();
		

		Persona_Ej7 persona1 = new Persona_Ej7(nombre, edad, sexo, peso, altura);

		//Introduccion de datos de la persona 2:
		
		System.out.println("\n Persona 2: ");

		System.out.println("Introduce el nombre de la persona:");
		String nombre1 = consola.nextLine();
		
		
		System.out.println("Introduce la edad: ");
		int edad1 = consola.nextInt();
		
		consola.nextLine();
		
		System.out.println("Introduce el sexo: (H/M)");
		char sexo1 = consola.next().charAt(0);
		consola.nextLine();
		
		Persona_Ej7 persona2 = new Persona_Ej7(nombre1, edad1, sexo1);
		
		
		//Introduccion de datos de la persona 3:
		System.out.println("\n Persona 3: ");

		System.out.println("Introduce el nombre de la persona:");
		String nombre2 = consola.nextLine();
		
		
		System.out.println("Introduce la edad: ");
		int edad2 = consola.nextInt();
		
		consola.nextLine();
		System.out.println("Introduce el sexo: (H/M)");
		char sexo2 = consola.next().charAt(0);
		
		
		Persona_Ej7 persona3 = new Persona_Ej7();
		persona3.setNombre(nombre2);
		persona3.setEdad(edad2);
		persona3.setSexo(sexo2);
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		
		
		consola.close();
	}

}
