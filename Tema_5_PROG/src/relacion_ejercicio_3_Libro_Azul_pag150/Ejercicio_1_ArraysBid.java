package relacion_ejercicio_3_Libro_Azul_pag150;

public class Ejercicio_1_ArraysBid {

	public static void main(String[] args) {
		int [][] numero= new int[3][6];
		
		numero[0][0]=0;
		numero[0][1]=30;
		numero[0][2]=2;
		numero[0][5]=5;
		
		numero[1][0]=75;
		numero[1][4]=0;
		
		numero[2][2]=-2;
		numero[2][3]=9;
		numero[2][5]=11;
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero[i].length; j++) {
			System.out.println("Fila :  "+(i)+" Columna   "+(j)+"  Numero:  ");	
			
			}
		}
		
	
	}
}
