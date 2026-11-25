package ejercicio_3;

public class Empleado {

	private String DNI;
	private String cargo;
	private int salario;
	private int productividad;
	
	
	/**
	 * @param dNI
	 * @param cargo
	 * @param salario
	 * @param productividad
	 */
	public Empleado(String dNI, String cargo, int salario, int productividad) {
		
		DNI = dNI;
		this.cargo = cargo;
		this.salario = salario;
		this.productividad = productividad;
	}


	/**
	 * 
	 */
	public Empleado() {
		
	}


	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}


	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}


	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}


	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}


	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}


	/**
	 * @return the productividad
	 */
	public int getProductividad() {
		return productividad;
	}


	/**
	 * @param productividad the productividad to set
	 */
	public void setProductividad(int productividad) {
		this.productividad = productividad;
	}


	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", cargo=" + cargo + ", salario=" + salario + ", productividad=" + productividad
				+ "]";
	}
	
	 
	
	
	
	
	

}
