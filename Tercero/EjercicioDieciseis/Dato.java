package EjercicioDieciseis;

public class Dato {
	
	public void dato() {
		Libro l1 = new Libro("000d131as","El viaje al centro de la Tierra","Julio Verne",464);
		Libro l2 = new Libro("ad46546sx","Papelucho","Marcela Paz",46);
		
		System.out.println("");
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println("");
		
		if(l1.getPagina()>l2.getPagina()) {
			System.out.println("El primer libro tiene mas paginas");
		}else if(l2.getPagina()>l1.getPagina()) {
			System.out.println("El segundo libro tiene mas paginas");
		}else {
			System.out.println("Los libros tienen la mismas paginas");
		}	
	}
}
