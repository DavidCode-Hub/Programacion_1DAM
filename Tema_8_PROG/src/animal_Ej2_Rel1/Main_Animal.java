package animal_Ej2_Rel1;

import java.util.ArrayList;

public class Main_Animal {

	public static void main(String[] args) {
		Animal gato1=new Perro();
		Animal perro1= new Perro();
		Animal caballo1=new Caballo();
		
		int cant=1;
		
		ArrayList<Animal> animales=new ArrayList<>();
		animales.add(gato1);
		animales.remove(cant);
		
		animales.add(gato1);
		animales.add(perro1);
		animales.add(caballo1);
		
		for (Animal animal : animales) {
			animal.hacerSonido();
		}
		for (int i = 0; i < animales.size(); i++) {
			Animal a=animales.get(i);
			a.hacerSonido();
		}
		gato1.hacerSonido();
	
		

	}

}
