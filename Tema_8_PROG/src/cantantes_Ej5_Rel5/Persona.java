package cantantes_Ej5_Rel5;

public class Persona implements PuedeCantar {
	protected String tipo;

	@Override
	public void puedeCantar() {
		System.out.println("DO, RE, MI, FA, SOL");
	}

}
