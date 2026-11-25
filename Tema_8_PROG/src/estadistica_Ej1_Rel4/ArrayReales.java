package estadistica_Ej1_Rel4;


public class ArrayReales implements Estadisticas{

	double[] valor;

	/**
	 * @param valor
	 */
	public ArrayReales() {

		this.valor = new double[5];
	}
	
	/**
	 * 
	 */
	public void anadirnum() {
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] == 0.0) {
				valor[i] = 0000;
			}
		}

		for (int i = 0; i < valor.length; i++) {
			if (valor[i] == 0000) {
				valor[i] = Math.random();
			}
		}

	}
	
	/**
	 * 
	 */
	public void vervalores() {
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != 0000) {
				System.out.println("Valor "+(i+1)+": "+ valor[i]+"\n");
			}
		}
	}
	/**
	 * 
	 */
	public double minimo() {
		double nummini = valor[0];
		for (int i = 0; i < valor.length; i++) {
			if (nummini < valor[i]) {
				nummini=valor[i];
				
			}
		}return nummini;

	}
	/*
	 * 
	 */
	public double maximo() {
		double nummaxi = valor[0];
		for (int i = 0; i < valor.length; i++) {
			if (nummaxi > valor[i]) {
				nummaxi=valor[i];
				
			}
		}return nummaxi;

	}
	/**
	 * 
	 */
	public double sumatorio() {
		double suma=0;
		for (int i = 0; i < valor.length; i++) {
			if (valor[i]!=0000) {
				suma+=valor[i];
				
			}
		}return suma;
	}

}
