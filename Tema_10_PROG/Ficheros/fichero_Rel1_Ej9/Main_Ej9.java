package fichero_Rel1_Ej9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main_Ej9 {

	public static void main(String[] args) {
		
		try {
            int cont=0;
            BufferedReader br= new BufferedReader(new FileReader(args[0]));
            while (br.ready()) {
                String l=br.readLine();

                if (l.equalsIgnoreCase(args[1])) {
                    cont++;
                } 

            }
            
            System.out.println("La palabra "+args[1]+" se ha encontrado "+cont+" veces");
            cont=0;
            br.close();
            
            br= new BufferedReader(new FileReader(args[0]));
            while (br.ready()) {
                String linea=br.readLine();
                cont++;
                if (linea.equalsIgnoreCase(args[1])) {
                    System.out.println("Línea "+(cont));

                } 


            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("No ha encontrado ningun fichero");
        }catch (IOException e) {
            System.err.println("No ha encontrado nada en el fichero");
        }

	}

}
