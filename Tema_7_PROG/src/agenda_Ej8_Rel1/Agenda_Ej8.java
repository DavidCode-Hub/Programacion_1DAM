package agenda_Ej8_Rel1;

public class Agenda_Ej8 {

	private Contacto[] agenda;

	// Contructores
	public Agenda_Ej8() {

		this.agenda = new Contacto[10]; // Por defecto

	}

	public Agenda_Ej8(int tamano) {

		this.agenda = new Contacto[tamano];

	}

	public boolean existeContacto(Contacto c) {

		for (int i = 0; i < agenda.length; i++) {

			if (this.agenda[i] != null && this.agenda[i].getId() == c.getId()) {
				return true;
			}
		}
		return false;
	}
	// Metodos

	/**
	 * 
	 * @return
	 */
	public boolean agendallena() {

		for (int i = 0; i < agenda.length; i++) {
			if (this.agenda[i] == null) {
				return false;

			}
		}
		return true;
	}

	/**
	 * 
	 * @param c
	 */
	public void anadirContacto(Contacto c) {

		if (this.existeContacto(c)) {
			System.out.println("El id de contacto ya existe");

		} else if (this.agendallena()) {
			System.out.println("La agenda esta llenam no se pueden meter más contactos");

		}

		boolean introducido = false;

		for (int i = 0; i < agenda.length && !introducido; i++) {
			if (agenda[i] == null && introducido) {
				agenda[i] = c;
				introducido = true;
			}
		}

		if (introducido) {
			System.out.println("El contacto ha sido añadido con exito");
		} else if (!introducido) {
			System.out.println("El contacto no ha podido ser añadido");
		}
	}

	/**
	 * Elimina un objeto en concreto
	 * 
	 * @param c Object - Pasa un objeto como parametro
	 */
	public void eliminarcontacto(int i) {

		if (this.agenda[i].getId() == i) {

			agenda[i] = null;

		}

	}

	public void listarcontacto() {

		if (this.huecoslibres() == agenda.length) {
			System.out.println("No hay datos que mostrar");
		}
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("El id del contacto es: " + this.agenda[i].getId() + "El nombre es: "
					+ this.agenda[i].getNombre() + "El numero de telefono es: " + this.agenda[i].getNumerotlf());
			System.out.println("-----------------------------------------------------");
		}
	}

	public int huecoslibres() {
		int contadorLibres = 0;

		for (int i = 0; i < agenda.length; i++) {
			if (this.agenda[i] == null) {
				contadorLibres++;

			}
		}
		return contadorLibres;
	}

	public void buscarporid(int id) {

		boolean encontrado = false;
		for (int i = 0; i < agenda.length; i++) {

			if (this.agenda[i] == null && this.agenda[i].getId() == id) {
				System.out.println("Su nombre es: " + this.agenda[i].getNombre() + " el telefono es: "
						+ this.agenda[i].getNumerotlf());
			}
		}

		if (encontrado) {
			System.out.println("El contacto ha sido encontrado");
		}
	}

}
