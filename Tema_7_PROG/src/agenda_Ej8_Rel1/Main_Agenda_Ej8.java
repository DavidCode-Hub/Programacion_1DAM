package agenda_Ej8_Rel1;

import java.util.Scanner;

public class Main_Agenda_Ej8 {

	public static void main(String[] args) {
		Scanner consola= new Scanner (System.in);
		
		Contacto contacto1= new Contacto(1,"David","682959123");
		Contacto contacto2=new Contacto(2,"Seva","999999999");
		
		
		Agenda_Ej8 agendaTelefonica=new Agenda_Ej8(3);
		
		boolean salir=false;
		
		while (!salir) {
			
			System.out.println("1.-Añadir contacto"+
								"\n2.-Listar contacto"+
								"\n3.-Buscar contacto"+
								"\n4.-Existe contacto"+
								"\n5.-Eliminar contacto"+
								"\n6.-Contactos disponible"+
								"\n7.-Agenda llena");
			
			
			System.out.println("Escribe de alguna de las opciones:");
			int opc=consola.nextInt();
			
			
			
			
			switch (opc) {
			case 1:  //Añadir contacto
				
				agendaTelefonica.anadirContacto(contacto1);
				agendaTelefonica.anadirContacto(contacto2);
				
				break;
			case 2:  //Listar contacto
				
				agendaTelefonica.listarcontacto();
				
				break;
			case 3:  //Buscar contacto
				int id;
				System.out.println("Escribe un ID:");
				id=consola.nextInt();
				
				agendaTelefonica.buscarporid(id);
				
				break;
				
				
			case 5:  //Eliminar contacto
				
				System.out.println("Posición del contacto a eliminar");
				int poselim=consola.nextInt();
				
				agendaTelefonica.eliminarcontacto(poselim);
				
				break;

			default:
				break;
			}
			
		}
		
	}

}
