package explicacion_Tokens;

import java.io.BufferedReader;
import java.io.FileReader;

public class Token_1 {

	public static void main(String[] args) {
		
		String edad;
		String trabajo;
		
		String linea;
		String[] token = null;
		String fichero = "src/token/fichero1.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			
			System.out.println("hola");
			
			while (br.ready()) {
				
				linea = br.readLine();
				token = linea.split(";");
				
				System.out.println(token[0] + " " + token[1] + " " + token[2] + " " + token[3]);

				if (token[1].equals("Alex Johnson")) {
					edad = token[2];
					trabajo = token[3];
				} else {

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
