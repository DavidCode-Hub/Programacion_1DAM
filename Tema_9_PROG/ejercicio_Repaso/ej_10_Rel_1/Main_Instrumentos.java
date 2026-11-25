package ej_10_Rel_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import ej_10_Rel_1.Instrumentos.tipoinstru;

public class Main_Instrumentos {

	public static void main(String[] args) {
		Scanner consola= new Scanner(System.in);
		ArrayList<Instrumentos> listaInstru= new ArrayList<Instrumentos>();
		
		int contador=0;
		
		HashMap<String, ArrayList<Instrumentos>>sucursales= new HashMap<String, ArrayList<Instrumentos>>();
		
		listaInstru.add(new Instrumentos(contador, 15, tipoinstru.PERCUSION));
		listaInstru.add(new Instrumentos(contador, 20, tipoinstru.CUERDA));
		listaInstru.add(new Instrumentos(contador, 15, tipoinstru.VIENTO));
		
		sucursales.put("Madrid", listaInstru);
		sucursales.put("Sevilla", listaInstru);
		sucursales.put("Malaga", listaInstru);
		
		
		System.out.println(sucursales);
		
		System.out.println("1.-Percusion\n2.- Viento\n3.-Cuerda");
		
		System.out.println("Introduce el tipo de Instrumentos");
		int tipo=consola.nextInt();
		
		Iterator<Instrumentos> instrumentos= listaInstru.iterator();
		
		switch (tipo) {
		case 1:
			System.out.println("Tipo instrumento Percusión");
			while (instrumentos.hasNext()) {
				Instrumentos instrumentos2 = (Instrumentos) instrumentos.next();
				if (instrumentos2.getTipoInstrumento()==tipoinstru.PERCUSION) {
					System.out.println(instrumentos2);
				}
			}
			break;
		case 2:
			System.out.println("Tipo instrumento Viento");
			while (instrumentos.hasNext()) {
				Instrumentos instrumentos2 = (Instrumentos) instrumentos.next();
				if (instrumentos2.getTipoInstrumento()==tipoinstru.VIENTO) {
					System.out.println(instrumentos2);
				}
			}
			break;

		case 3:
			System.out.println("Tipo instrumento Cuerda");
			while (instrumentos.hasNext()) {
				Instrumentos instrumentos2 = (Instrumentos) instrumentos.next();
				if (instrumentos2.getTipoInstrumento()==tipoinstru.CUERDA) {
					System.out.println(instrumentos2);
				}
			}
			
			break;

		default:
			break;
		}
		
	}

}
