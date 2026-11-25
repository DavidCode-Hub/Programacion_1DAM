package pruebas;

public class ExceptionAlturaFueraDeRango extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ExceptionAlturaFueraDeRango() {
		System.err.println("Ha superado el limite de altura");
	}
	
}
