package EjercicioSiete;

public class Principal {

	public static void main(String[] args) {
		Planta p = new Planta();
		Carnivoro c = new Carnivoro();
		Hervivoro h = new Hervivoro();

		p.alimentarse();
		c.alimentarse();
		h.alimentarse();
		
		//Las clases abtractas no se pueden crear objetos como ejemplo
		//la clase SerVivo y la clase Animal.
	}
}
