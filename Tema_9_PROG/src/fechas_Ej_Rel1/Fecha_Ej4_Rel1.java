package fechas_Ej_Rel1;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class Fecha_Ej4_Rel1 {

	public static void main(String[] args) {
		Clock reloj=Clock.systemUTC();
		
		System.out.println(reloj.instant());
		
		

	}

}
