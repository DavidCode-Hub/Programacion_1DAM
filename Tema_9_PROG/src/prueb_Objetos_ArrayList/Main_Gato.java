package prueb_Objetos_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_Gato {

	public static void main(String[] args) {
		Gato gato1 = new Gato("Flufi", 4, "albino");

		Gato gato2 = new Gato("Roberto", 2, "Dalmata");

		ArrayList<Gato> gato = new ArrayList<>();

		gato.add(gato1);
		gato.add(gato2);

		for (Gato gato3 : gato) {
			System.out.println(gato3);

		}

		for (int i = 0; i < gato.size(); i++) {

			System.out.println(gato.get(i));

		}

		Iterator<Gato> it = gato.iterator();

	}

}
