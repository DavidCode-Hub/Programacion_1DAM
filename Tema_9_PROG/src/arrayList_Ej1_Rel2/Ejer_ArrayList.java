package arrayList_Ej1_Rel2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer_ArrayList {
	public static void main(String[] args) {
		Scanner consola= new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		
		numeros=leerValores(consola); 
		mostrar(numeros);
		
		System.out.println(suma(numeros));
		
		double media;
	
		media=suma(numeros)/numeros.size();
		
		System.out.println("La media es:"+media);		
		
		mayoresmedia(numeros, media);
		
		consola.close();
		
		
	}
	
	public static ArrayList leerValores(Scanner consola) {
		ArrayList<Integer>arr = new ArrayList<Integer>();
		boolean introducido=true;
		
		while (introducido) {
			System.out.println("Introduce un numero usa -99 para salir.");
			int numero=consola.nextInt();
			if (numero==-99) {
				introducido=false;
				System.out.println("SALIDA CORRECTA");
				
			} else {
				arr.add(numero);
				System.out.println("Se ha añadido conexito");
			}
			
		}// Fin While
		return arr;
	}
	
	public static void mostrar(ArrayList arr) {
		Iterator<Integer> it = arr.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			
			System.out.println(integer);
		}
		
	}
	
	public static int suma(ArrayList arr) {
		Iterator<Integer>itsuma=arr.iterator();
		int suma=0;
		
		while (itsuma.hasNext()) {
			Integer integer = (Integer) itsuma.next();
			suma+=integer;
		}
		return suma;
		
	}
	
	public static void mayoresmedia(ArrayList arr, double media) {
		Iterator<Integer> array= arr.iterator();
		System.out.println("Numeros mayores a la media: ");
		
		while (array.hasNext()) {
			Integer integer = (Integer) array.next();
			
			if (integer > media) {
				System.out.println(integer);
			} 
		}
		
	}
	
	
	
	
	
}
