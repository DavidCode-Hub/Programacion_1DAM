package pruebas_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Enteros {

	public static void main(String[] args) {
		ArrayList<Integer> Numeros = new ArrayList<Integer>();

		
		Numeros.add(1);
		Numeros.add(20);
		Numeros.add(50);
		Numeros.add(70);
		
		Iterator<Integer /*Tipo de dato que vas a tratar*/> Iterator= Numeros/*Nombre del Array que has cogido*/.iterator();
		
		while (Iterator.hasNext()) {
			Integer integer = (Integer) Iterator.next();
			System.out.println(integer);
			if (integer==1) {
				System.out.println(integer);
			}
		}
		
		for (Integer integer : Numeros) {
			System.out.println(integer);
		}
		
	}

}
