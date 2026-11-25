package ejemplo_de_objetos;

import java.util.Scanner;

public class Ejeccucion_Gato_Objeto {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		Objeto_Gato migato=new Objeto_Gato();
		Objeto_Gato migato2=new Objeto_Gato("Naranja","Egipcio","Hembra",6,4);
		
		Objeto_Gato migato3=new Objeto_Gato();
		Objeto_Gato migato4=new Objeto_Gato();
		
		
		System.out.println("Introduce el color de tu gato: ");
		migato3.setColor(consola.nextLine());
		
		System.out.println("Introduce la edad de tu gato: ");
		migato3.setEdad(consola.nextInt());
		
		System.out.println("introduce el peso de tu gato: ");
		migato3.setPeso(consola.nextDouble());
		
		System.out.println("Introduce la raza de tu gato: ");
		consola.next();
		migato3.setRaza(consola.nextLine());
		
		System.out.println("Introduce el sexo de tu gato: ");
		migato3.setSexo(consola.nextLine());
		
		
		//Gato 4
		
		System.out.println("Introduce el color de tu gato: ");
		migato4.setColor(consola.nextLine());
		
		System.out.println("Introduce la edad de tu gato: ");
		migato4.setEdad(consola.nextInt());
		
		System.out.println("introduce el peso de tu gato: ");
		migato4.setPeso(consola.nextDouble());
		
		System.out.println("Introduce la raza de tu gato: ");
		consola.next();
		migato4.setRaza(consola.nextLine());
		
		System.out.println("Introduce el sexo de tu gato: ");
		migato4.setSexo(consola.nextLine());
		
		migato.setColor("Marrón");
		migato.setEdad(6);
		migato.setPeso(3);
		migato.setSexo("Hembra");
		migato.setRaza("Egipcio");
		
		double suma=0;
		
		suma+=migato.getPeso();
		
		suma+=migato2.getPeso();
		
		String comida;
		
		System.out.println("Que le vas a dar de comer al gato: ");
		comida=consola.nextLine().toLowerCase();
		 
		migato.comida(comida);		
		
		migato.peleacon(migato2);
		
		//Objeto_Gato.suma(migato.getPeso(),migato2.getPeso());
		
		System.out.println("El peso de los dos gatos es: "+suma);
		
		System.out.println(migato.toString());
		
		System.out.println("El constructor es: "+migato2.toString());
		
		System.out.println("\n\n\n");
		
		
		System.out.println(migato3.toString()+"\n"+migato4.toString());
		
		
	}
}
