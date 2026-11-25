package agroalimentaria_Ej3_Rel1;

public class Main_empresa {

	public static void main(String[] args) {
		Prod_Fresco prodFresco = new Prod_Fresco("2024-12-31", 101, "2024-06-01", "España");
		Prod_refri prodRefri = new Prod_refri("2025-01-15", 202, 555123);
		Prod_conge prodConge = new Prod_conge("2026-03-20", 303, -18.0);

		System.out.println("Producto Fresco:");
		System.out.println("Fecha de Caducidad: " + prodFresco.getFecha_Caducidad());
		System.out.println("Número de Lote: " + prodFresco.getNum_Lote());
		System.out.println("Fecha de Envasado: " + prodFresco.getFecha_envasado());
		System.out.println("País de Origen: " + prodFresco.getPais_origen());

		System.out.println("\nProducto Refrigerado:");
		System.out.println("Fecha de Caducidad: " + prodRefri.getFecha_Caducidad());
		System.out.println("Número de Lote: " + prodRefri.getNum_Lote());
		System.out.println("Código del Organismo Supervisor: " + prodRefri.getCod_org_super());

		System.out.println("\nProducto Congelado:");
		System.out.println("Fecha de Caducidad: " + prodConge.getFecha_Caducidad());
		System.out.println("Número de Lote: " + prodConge.getNum_Lote());
		System.out.println("Temperatura de Congelación: " + prodConge.getTemp_conge() + "°C");

	}

}
