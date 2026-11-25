package inmuebles_Ej3_Rel2;

import java.util.ArrayList;

public class Main_Inmuebles {
	public static void main(String[] args) {
		/**
		 * 
		 * 
		 */
		ArrayList<Inmueble> Inmueble=new ArrayList<>();
		
		Inmueble casaindependiente1=new Casa();
		
		Inmueble.add(casaindependiente1);
		
		Casa casaindependiente2=new Casa();
		
		casaindependiente2.calcularPrecioVenta(300);
		
		casaindependiente1.calcularPrecioVenta(300);
		
		for (int i = 0; i < Inmueble.size(); i++) {
		
			
		}
	}

}
