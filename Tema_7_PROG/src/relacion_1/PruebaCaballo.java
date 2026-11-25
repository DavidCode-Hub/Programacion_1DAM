package relacion_1;

public class PruebaCaballo {

	public static void main(String[] args) {
		Caballo cab1=new Caballo();
		Caballo cab2=new Caballo("Lluvia","Pura Sangre","Blanco",5,8);
		
		cab1.setNombre("Spirit");
		cab1.setRaza("Mustang");
		cab1.setColor("Marrón");
		cab1.setEdad(6);
		cab1.setCarrerasGanadas(3);
		
		System.out.println("Caballo 1: "+cab1.toString());
		
		System.out.println("\nCaballo 2: "+cab2.toString());
		
		cab1.accciones();
		cab2.accciones();

	}

}
