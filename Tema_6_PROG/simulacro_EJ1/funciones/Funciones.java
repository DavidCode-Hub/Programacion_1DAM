package funciones;

public class Funciones {

	public static void menu() {

		System.out.println(
				"1. Tabla de multiplicar\n2. Devuelve el máximo y mínimo de dos números\n3. Devuelve la división de dos números");
		System.out.println("4. Calculo de operaciones trigonometricas.");

	}

	public static void tablamulti(int a){
		
		int resmulti;
		for (int i = 1; i <= 10; i++) {
			resmulti=i*a;
			System.out.print(i+" x "+a+"="+resmulti);
			System.out.println();
		}
		
	}
	
	
	public static void maxmin(int a, int b) {
		int max,min;
		
		if (a>=b) {
			max=a;
			min=b;
			
		}else {
			max=b;
			min=a;
		}
		System.out.println("El número máximo es: "+max+" El número mínimo es: "+min);
	
	}
	public static double division(double a, double b) {
		double resultado;
		
		resultado=a/b;
		
		return resultado;
	}
	
	public static void opertrig() {
		
	}
	public static void menu2() {
		System.out.println("1. Calcular el seno\n2. Calcular el coseno\n3. Calcular la tangente");
	}
	
	public static double seno(double a) {
		double resultadogrados,resultadoseno;
		
		/*resultadogrados=Math.toRadians(a);
		
		resultadoseno=Math.sin(resultadogrados);*/
		
		resultadoseno=Math.sin(Math.toRadians(a));
		
		
		return resultadoseno;
		
	
	}
	public static double coseno(double a) {
		double resultadocoseno;
		
		/*resultadogrados=Math.toRadians(a);
		
		resultadoseno=Math.sin(resultadogrados);*/
		
		resultadocoseno=Math.cos(Math.toRadians(a));
		
		
		return resultadocoseno;
		
	
	}
	public static double tangente(double a) {
		double resultadotan;
		
		/*resultadogrados=Math.toRadians(a);
		
		resultadoseno=Math.sin(resultadogrados);*/
		
		resultadotan=Math.tan(Math.toRadians(a));
		
		
		return resultadotan;
		
	
	}

}
