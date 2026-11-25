package trabajdoras_Ej2_Rel4;

public class Profesor extends Persona {
	
	
	
	/**
	 * @param edad
	 * @param nombre
	 * @param salario_base
	 */
	public Profesor(int edad, String nombre, float salario_base) {
		super(edad, nombre, salario_base);
	}

	protected int calcular_horas_sem() {
		return 8*5;
	}

	protected float calcular_salario_mes() {
		return this.salario_base*(calcular_horas_sem()*4);
	}

	@Override
	public String toString() {
		return "Profesor [edad=" + edad + ", nombre=" + nombre + ", salario_base=" + salario_base + "]";
	}
	
	
}
