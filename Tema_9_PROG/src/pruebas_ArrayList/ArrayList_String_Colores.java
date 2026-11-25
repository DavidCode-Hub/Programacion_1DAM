package pruebas_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_String_Colores {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();

		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("gris");
		colores.add("negro");

		System.out.println("Colores: " + colores);

		colores.remove(1);

		System.out.println("Colores: " + colores);

		colores.add(3, "pistacho");

		System.out.println("Colores" + colores);

		colores.removeLast();

		System.out.println("Colores" + colores);

		colores.remove(colores.size() - 1);

		Iterator<String> iterador = colores.iterator();

		while (iterador.hasNext()) {
			String color = (String) iterador.next();
			if (color.contains("a")) {
				System.out.println("Color:");
			}

		}

		colores.removeIf(colorelim -> colores.contains("a"));
	}

}
