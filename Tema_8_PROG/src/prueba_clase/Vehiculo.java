package prueba_clase;

public class Vehiculo {
	public int matricula;
	public String modelo;
	public int potenciaCV;
	
	public Vehiculo(int matricula, String modelo, int potenciaCV) {
		this.matricula=matricula;
		this.modelo=modelo;
		this.potenciaCV=potenciaCV;
		
	}
	public Vehiculo() {
		
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotenciaCV() {
		return potenciaCV;
	}
	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	protected void arrancar() {
		System.out.println("Arrancado");
	}
	
}
