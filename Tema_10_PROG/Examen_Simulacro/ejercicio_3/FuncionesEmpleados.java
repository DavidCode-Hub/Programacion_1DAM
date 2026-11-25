package ejercicio_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FuncionesEmpleados {
	private ArrayList<Empleado> listaempleado;
	static String filepathR="Examen_Simulacro/ejercicio_3/Datos.txt";
	static String filepathW="Examen_Simulacro/ejercicio_3/empleados.txt";
	/**
	 * @param listaempleado
	 */
	public FuncionesEmpleados(ArrayList<Empleado> listaempleado) {

		this.listaempleado = new ArrayList<Empleado>();
	}

	/**
	 * @return the listaempleado
	 */
	public ArrayList<Empleado> getListaempleado() {
		return listaempleado;
	}

	/**
	 * @param listaempleado the listaempleado to set
	 */
	public void setListaempleado(ArrayList<Empleado> listaempleado) {
		this.listaempleado = listaempleado;
	}

	@Override
	public String toString() {
		return "FuncionesEmpleados [listaempleado=" + listaempleado + "]";
	}
	
	
	public void leerFichero() {
		
		String []tokens;
		try {
			BufferedReader br1= new BufferedReader(new FileReader(filepathR));
			
			while (br1.ready()) {
				br1.readLine();
				
				String linea=br1.readLine();
				tokens=linea.split(linea);
				
				listaempleado.add(new Empleado(tokens[0],tokens[1] , Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])));
				
			}
			
			
			System.out.println(listaempleado);
			
			br1.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			
		}catch (IOException e) {
			System.err.println("Error de lectura");
		}
	}
	
	
	public void escribirFichero() {
		
	}
	
	
}
