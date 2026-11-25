package cafeteria_Ej1_rel2;

public class Prueba_Cafeteria {

	public static void main(String[] args) {
	
		Cafetera cafetera1=new Cafetera(1);
		Cafetera cafetera2=new Cafetera(500,2);
		Cafetera cafetera3=new Cafetera(1000,150,3);
		
		Cafeteria listadecafeteras=new Cafeteria();
		
		listadecafeteras.anadircafetera(cafetera1);
		listadecafeteras.anadircafetera(cafetera2);
		listadecafeteras.anadircafetera(cafetera3);
		
		listadecafeteras.mostrarcafeteras();
	}

}
