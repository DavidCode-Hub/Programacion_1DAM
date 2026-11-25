package estadistica_Ej1_Rel4;

public class Main_Ej1_Rel4 {

	public static void main(String[] args) {
		
		ArrayReales valor=new ArrayReales();
		
		valor.anadirnum();
		valor.vervalores();
		
		
		System.out.println("Valor maximo: "+valor.maximo());
		System.out.println("Valor minimo: "+valor.minimo());
		System.out.println("Sumatorio de todos los numeros: "+valor.sumatorio());
		
		
		int []a= {0,5,1,5,7,9,1,0,10,100};
		double []b= {0.0,5.0,1.0,5.0,7.0,9.0,1.0,0.0,10.0,100.0};
		
		Math3 valores=new Math3();
		
		
		System.out.println("Valor maximo: "+valores.min(a));
		System.out.println("Valor minimo: "+valores.max(a));
		System.out.println("Valor maximo: "+valores.min(b));
		System.out.println("Valor minimo: "+valores.max(b));
		
		
		
		
	}

}
