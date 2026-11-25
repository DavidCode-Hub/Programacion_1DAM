package trabajdoras_Ej2_Rel4;

public abstract class Persona  {
	protected int edad;
	protected String nombre;
	protected  float salario_base;
	
	/**
	 * @param edad
	 * @param nombre
	 * @param salario_base
	 */
	public Persona(int edad, String nombre, float salario_base) {
		this.edad = edad;
		this.nombre = nombre;
		this.salario_base = salario_base;
	}
	
	
	public Persona() {
		
	}

	
	/**
	 * @return the salario_base
	 */
	public float getSalario_base() {
		return salario_base;
	}
	
	protected abstract int calcular_horas_sem();
	
	protected abstract float calcular_salario_mes();
	
	
	
}
