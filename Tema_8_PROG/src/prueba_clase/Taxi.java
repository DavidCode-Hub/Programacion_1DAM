package prueba_clase;

public class Taxi extends Vehiculo{
	
	
	public Taxi() {
		
	}

	public Taxi(int matricula, String modelo, int potenciaCV) {
		super(matricula, modelo, potenciaCV);
		
	}
	
	@Override
	public void arrancar() {
		System.out.println("Taxi arrancado");
	}
	
}
