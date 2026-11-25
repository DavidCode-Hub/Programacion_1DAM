package nif_Ej2_Rel2;

public class NIF {
	private int numDNI;
	private char letraDNI;
	
	//Constructor por defecto
	public NIF() {
		this.numDNI=0;
		this.letraDNI=' ';
	}
	//Constructor para obtener Letra
	public NIF(int numDNI) {
		this.numDNI=numDNI;
		CalcularLetra(numDNI);
		
	}
	
	
	
	
	//Getters and Setters
	
	public int getNumDNI() {
		return numDNI;
	}
	public void setNumDNI(int numDNI) {
		this.numDNI = numDNI;
	}
	public char getLetraDNI() {
		return letraDNI;
	}
	public void setLetraDNI(char letraDNI) {
		this.letraDNI = letraDNI;
	}
	
	
	private void CalcularLetra(int numDNI) {
		
	
		
		int divisionletra=numDNI%23;
		
		char arrayLetra[]= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 
				'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
				'C', 'K', 'E'};
		
		 this.letraDNI=arrayLetra[divisionletra];
	}
	@Override
	public String toString() {
		return "NIF [numDNI=" + numDNI + ", letraDNI=" + letraDNI + "]";
	}
	
}
