package fechas_y_horas_ej_clase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Ejercicio_1_clase_Fecha {

	public static void main(String[] args) {
		System.out.println("La fecha actual es de: "+LocalDate.now());
		System.out.println("La hora actual es de: "+ LocalTime.now());
		System.out.println("Mi cumpleaños es:"+LocalDate.of(2000, Month.SEPTEMBER, 6));
		

	}

}
