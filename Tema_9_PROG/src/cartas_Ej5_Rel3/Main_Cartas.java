package cartas_Ej5_Rel3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main_Cartas {

	public static void main(String[] args) {
		ArrayList<Carta> listacartas = new ArrayList<Carta>();
		HashMap<String, Integer> cartas = new HashMap<String, Integer>();
		String[] figuras = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey" };
		String[] palos = { "oros", "copas", "espadas", "bastos" };

		cartas.put("as", 11);
		cartas.put("tres", 10);
		cartas.put("sota", 2);
		cartas.put("caballo", 3);
		cartas.put("rey", 4);

		for (int i = 0; i < 5; i++) {
			listacartas.add(new Carta(figuras[(int) (Math.random() * ((9 - 0) + 1) + 0)],
					palos[(int) (Math.random() * ((3 - 0) + 1) + 0)]));

		}
		int suma = 0;

		System.out.println(listacartas);

		for (int i = 0; i < cartas.size(); i++) {
			if (cartas.containsKey(listacartas.get(i).getNombre())) {
				suma += cartas.get(listacartas.get(i).getNombre());
			}
		}

		System.out.println("Tienes " + suma + " puntos");

	}

}
