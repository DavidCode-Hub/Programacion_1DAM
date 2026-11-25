package fechas_y_horas_ej_clase;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Ejercicio_2_clase_Fecha {
	public static void main(String[] args) {
		LocalDateTime fechahora=LocalDateTime.now();
		
		LocalDate cumpleanos=LocalDate.of(6, Month.SEPTEMBER, 6);
		
		System.out.println(fechahora.plusYears(2).minusMonths(2).getDayOfWeek());
		
		System.out.println("Mi cumpleaños es: "+cumpleanos);
		
		LocalDateTime.now().with(TemporalAdjusters.firstDayOfMonth());
		
		LocalDate edad= LocalDate.of(2000, Month.SEPTEMBER, 6);		
		
		System.out.println(ChronoUnit.DAYS.between(cumpleanos, fechahora));
		
	}

}
