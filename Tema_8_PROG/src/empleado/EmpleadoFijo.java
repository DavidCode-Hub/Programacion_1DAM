package empleado;

public class EmpleadoFijo extends Empleado {
	protected double salarioFijo;

	/**
	 * @param nombre
	 * @param salario
	 * @param salarioFijo
	 */
	public EmpleadoFijo(String nombre, double salario, double salarioFijo) {
		super(nombre, salario);
		this.salarioFijo = salarioFijo;
	}

	@Override
	public void calcularSalario() {
		System.out.println("El salario del trabajador " + super.nombre + " es: " + super.salario);
	}
}
