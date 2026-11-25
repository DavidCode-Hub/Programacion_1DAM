package ejercicio_Clase_Random;

public class Ejercicio_2 {

	public static void main(String[] args) {
		String numcartas[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		String paloscartas[]= {"Corazones","Picas", "Diamante", "Trebol"};
		
		int numi=(int)(Math.random()*((13-0)+1)+0);
		
		int numj=(int)(Math.random()*((4-0)+1)+0);
		
		System.out.println("Tu carta es: "+numcartas[numi]+" de: "+paloscartas[numj]);

	}

}
