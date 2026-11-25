package deporte;


public class Main_Deporte {
	public static void main(String[] args) {
		Equipo equipo1 = new Equipo("Sky", "EEUU");
		
		Equipo equipo2=new Equipo("Snow","España");

		Ciclista velocista1 = new Velocista("David", "Italia", 0, 35, 50, 120);
		Ciclista escalador1 = new Escalador("Sergio", "España", 3, 40, 60, 100);
		
		
		
		Ciclista escalador2 = new Escalador("Armando Guerra", "España", 12, 180, 60, 100);
		Ciclista velocista2 = new Velocista("Ana", "Inglaterra", 3, 47, 85, 100);

		equipo1.anadirCiclista(velocista1);
		equipo1.anadirCiclista(escalador1);
		
		equipo2.anadirCiclista(escalador2);
		equipo2.anadirCiclista(velocista2);

		equipo1.listarEquipo();
		equipo2.listarEquipo();
		
		equipo1.calcularTotalTiempo();
		
		equipo1.buscarCiclista();

		
		

	}
}
