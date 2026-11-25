package deporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
	private String nombre;
	private static double contador;
	private String pais;
	private ArrayList<Ciclista> listaciclistas;
	
	private Scanner consola = new Scanner(System.in);

	/**
	 * @param nombre
	 * @param pais
	 * @param listaciclistas
	 */
	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		listaciclistas = new ArrayList<Ciclista>();
	}

	public Equipo() {

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the contador
	 */
	public static double getContador() {
		return contador;
	}

	/**
	 * @param contador the contador to set
	 */
	private static void setContador(double contador) {
		Equipo.contador = contador;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	private void setPais(String pais) {
		this.pais = pais;
	}

	public void anadirCiclista(Ciclista Ciclis) {
		listaciclistas.add(Ciclis);

	}

	
	/**
	 * 
	 */
	public void listarEquipo() {
		for (int i = 0; i < listaciclistas.size(); i++) {
			if (!listaciclistas.isEmpty()) {
				System.out.println("Nombre del equipo: " + this.nombre+ ", pais=" + this.pais+", Identidicador: "+listaciclistas.get(i).getIdentificador()+
						", Nombre deportista: " +listaciclistas.get(i).getNombre()+", Tiempo acumulado "+listaciclistas.get(i).getTiempoAcumulado());
				
			}
		}  //Preguntar por el "imprimir los valores de los atributos propios".
		for (int i = 0; i < listaciclistas.size(); i++) {
			System.out.println("");
		}

	}
	
	

	/**
	 * 
	 */
	public void imprimir() {
		System.out.println("Equipo [nombre=" + nombre + ", pais=" + pais + ", listaciclistas=" + listaciclistas + ", consola="
				+ consola + "]");
	}
	
	
	public void calcularTotalTiempo() {
		for (int i = 0; i < listaciclistas.size(); i++) {
			if (!listaciclistas.isEmpty()) {
				contador+=listaciclistas.get(i).getTiempoAcumulado();
				
			}
		}System.out.println("El tiempo de todos los Ciclistas es: "+contador);
	}
	
	
	public void buscarCiclista() {
		System.out.println("Debe introducir un ID de un deportista");
		int id=consola.nextInt();
		boolean encontrado=false;
		
		for (int i = 0; i < listaciclistas.size() && !encontrado; i++) {
			if (!listaciclistas.isEmpty()) {
				
				if (listaciclistas.get(i).getIdentificador()==id) {
					System.out.println("Pais: "+this.pais+" nombre del deportista: "+listaciclistas.get(i).getNombre()+" el tiempo acumulado es de: "+listaciclistas.get(i).getTiempoAcumulado());
					encontrado=true;
					
				}else {
					
				}
			}
		}// Fin for
		
		if (!encontrado) {
			System.out.println("El identificador que ha introducido no esta en nuestra lista.");
		} 
	}
	

	
	
	
	
	
	
	
}
