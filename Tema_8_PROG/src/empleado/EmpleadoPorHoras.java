package empleado;

public class EmpleadoPorHoras extends Empleado{
	protected int Tarifahora;
	/**
	 * @param nombre
	 * @param salario
	 * @param salario2
	 * @param tarifahora
	 */
	public EmpleadoPorHoras(String nombre, double salario, int tarifahora) {
		super(nombre, salario);
		this.Tarifahora = tarifahora;
	}
	
	@Override
	public void calcularSalario(){
		System.out.println("El salario del trabajador "+this.nombre+" es: "+super.salario*this.Tarifahora);
	}
	
}
