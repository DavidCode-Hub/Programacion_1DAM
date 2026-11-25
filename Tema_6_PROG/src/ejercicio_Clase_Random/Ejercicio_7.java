package ejercicio_Clase_Random;

public class Ejercicio_7 {

	public static void main(String[] args) {
		boolean dadosiguales=true;
		int cont=0;
		
		while (dadosiguales) {
			
			int dado1=(int)(Math.random()*((6-1)+1)+1);
			int dado2=(int)(Math.random()*((6-1)+1)+1);
			
			if (dado1==dado2) {
				dadosiguales=false;
				
			}else {
				dadosiguales=true;
				cont++;
			}
		}//fin While
		
		System.out.println("Las tiradas de dados para ser iguales son: "+cont);
		
		

	}

}
