package empleado;

abstract class Empleado {
	protected String nombre;
	protected double salario;
	
	/**
	 * @param nombre
	 * @param salario
	 */
	public Empleado(String nombre, double salario) {
		
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public Empleado() {
		
		
	}
	
	
	public abstract void calcularSalario();
	
	
	
}
