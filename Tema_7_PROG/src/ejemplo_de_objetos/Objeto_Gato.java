package ejemplo_de_objetos;

public class Objeto_Gato {

	// Atributos

	public String color;
	public String raza;
	public String sexo;
	public int edad;
	public double peso;
	
	//Constructor asignado vacio
	public Objeto_Gato() {

	}
	
	//Constructor asignado
	public Objeto_Gato(String color ,String raza, String sexo,int edad, double peso) {
		this.color=color;
		this.raza=raza;
		this.sexo=sexo;
		this.edad=edad;
		this.peso=peso;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "El gato es: [color= " + color + ", raza= " + raza + ", sexo= " + sexo + ", edad= " + edad + ", peso= " + peso
				+ "]";
	}
	
	public void suma(double a, double b) {
		double result=a+b;
		System.out.println("Resultado del peso es: "+result);
	}
	
	public void comida(String c) {
		
		if (c.equals("Pescado")) {
			System.out.println("Si me gusta mucho.");
		}else {
			System.out.println("No, no me gusta.");
			this.enfadado();
		}
	}
	
	public void enfadado() {
		System.out.println("Estoy enfadado");
	}
	
	public void peleacon(Objeto_Gato contrincante) {
		if (this.sexo.equals(contrincante.getSexo())) {
			
		}
		
	}
	
	
	
}
