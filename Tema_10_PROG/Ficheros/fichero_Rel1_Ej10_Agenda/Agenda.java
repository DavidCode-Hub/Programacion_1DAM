package fichero_Rel1_Ej10_Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.SysexMessage;

public class Agenda {
	private ArrayList<Contacto> listaagenda;
	static String filepath = "Ficheros/fichero_Rel1_Ej10_Agenda/agenda_base.txt";
	static String filepath2= "Ficheros/fichero_Rel1_Ej10_Agenda/agenda_final.txt";

	
	
	public Agenda() {

		this.listaagenda = new ArrayList<>();
	}
	
	
	public void anadirContacto(String Nombre, int tlf) {
		listaagenda.add(new Contacto(Nombre, tlf));
		
		
		try {
			//BufferedWriter bw1 =new BufferedWriter(new FileWriter(filepath,false));
			
			BufferedWriter bw1 =new BufferedWriter(new FileWriter(filepath2,true));
			
				bw1.write(Nombre+";"+tlf+"\n");
			
			bw1.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se ha encontrado.");
			
		} catch (IOException e) {
			System.out.println("Error de escritura.");
		}

	}// Fin AnadirContacto
	
	
	public void mostrarContactos() {
		String []token=null;
		try {
			
			BufferedReader br1= new BufferedReader(new FileReader(filepath2));
			 while (br1.ready()) {
				String linea=br1.readLine();
				if (!linea.isEmpty()) {
					token=linea.split(";");
				System.out.println("Nombre "+token[0]+" numero telefono "+token[1]);
				}
				
				
			}
			 br1.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error en la ruta del fichero");
		}catch (IOException e) {
			System.err.println("Error en la escritura/escritura del fichero");
		}
		
	}//Fin mostrarContactos
	
	public void eliminar(String nombre) {
		
		for (int i = 0; i < listaagenda.size(); i++) {
			
			if (listaagenda.get(i).getNombre().equalsIgnoreCase(nombre)) {
				listaagenda.remove(i);
				
			}
		}
		
		try {
			BufferedWriter bw1= new BufferedWriter(new FileWriter(filepath2,false));
			
			for (int i = 0; i < listaagenda.size(); i++) {
				
				String nombreObj=listaagenda.get(i).getNombre();
				int numerotlf=listaagenda.get(i).getTelefono();
				
				String resultadoString= nombreObj+";"+numerotlf;
				bw1.write(resultadoString);
				bw1.newLine();
				
			}
			
			bw1.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error en la ruta del fichero");
		}catch (IOException e) {
			System.err.println("Error en la escritura/escritura del fichero");
		}
		
		
	}

	
	
	
}
