package trabajdoras_Ej2_Rel4;

public class Administrativo extends Persona{
	
	
	
	/**
	 * @param edad
	 * @param nombre
	 * @param salario_base
	 */
	public Administrativo(int edad, String nombre, float salario_base) {
		super(edad, nombre, salario_base);
	}

	protected int calcular_horas_sem() {
		return 5*5;
	}

	protected float calcular_salario_mes() {
		return this.salario_base*(calcular_horas_sem()*4);
	}
	
	@Override
	public String toString() {
		return "Administrativo [edad=" + edad + ", nombre=" + nombre + ", salario_base=" + salario_base + "]";
	}
}
