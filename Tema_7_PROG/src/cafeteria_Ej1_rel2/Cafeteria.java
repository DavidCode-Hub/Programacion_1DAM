package cafeteria_Ej1_rel2;


public class Cafeteria {
	private Cafetera[] cafeteria;

	// Constructor predeterminado.
	public Cafeteria() {

		this.cafeteria = new Cafetera[3];
	}

	public Cafeteria(int tamano) {

		this.cafeteria = new Cafetera[tamano];
	}

	public boolean cafeteriallena() {
		
		for (int i = 0; i < cafeteria.length; i++) {
			if (cafeteria[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	public void anadircafetera(Cafetera caf) {

		if (!this.cafeteriallena()) {

			boolean introducido = false;

			for (int i = 0; i < cafeteria.length && !introducido; i++) {
				
				if (cafeteria[i] == null && !introducido) {
					cafeteria[i] = caf;
					introducido = true;

				}

			} // Fin for
			
			if (introducido) {
				System.out.println("La cafetera "+caf.getId()+" ha sido introducida con exito");
			} else if (!introducido) {
				System.out.println("La cafetera no ha posido ser añadida");
			}
		} else {
			System.out.println("La cafetera no ha posido ser añadida");
		}
	}
	
	
	public void mostrarcafeteras() {
		
		boolean encontrada=false;
		
		for (int i = 0; i < cafeteria.length; i++) {
			
			if (cafeteria[i].getCapacidadActual()>=200) {
				
				System.out.println("La cafetera "+this.cafeteria[i].getId()+" tiene de liquido "+ 
						this.cafeteria[i].getCapacidadActual());
				encontrada=true;
				
			}
		}
	}

}
