package pruebas_ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Nombres {

	public static void main(String[] args) {
		HashMap<Integer, String> Hash = new HashMap<Integer, String>();

		ArrayList<Integer> ids = new ArrayList<Integer>();
		ArrayList<String> valores = new ArrayList<String>();

		Hash.put(10, "hola");
		Hash.put(30, "Armando Guerra");
		Hash.put(45, "qwsda");
		Hash.put(10, "asi");
		Hash.put(13, "Josema");

		System.out.println(Hash.get(10));
		System.out.println(Hash.get(30));



	}

}
