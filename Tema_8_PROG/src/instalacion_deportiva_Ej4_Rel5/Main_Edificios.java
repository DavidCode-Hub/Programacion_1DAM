package instalacion_deportiva_Ej4_Rel5;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_Edificios {

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();

		Edificio edificio1 = new Polideportivo();

		Edificio edificio2 = new Polideportivo();

		Edificio edificio3 = new Polideportivo();
		
		Edificio edificio4 =new Oficina();
		
		Edificio edificio5 =new Oficina();
		
		edificios.add(edificio1);
		edificios.add(edificio2);
		edificios.add(edificio3);
		edificios.add(edificio4);
		edificios.add(edificio5);
		
		Iterator<Edificio> edif= edificios.iterator();
		
		System.out.println(edif);
		

	}

}
