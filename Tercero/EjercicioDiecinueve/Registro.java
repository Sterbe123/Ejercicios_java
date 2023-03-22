package EjercicioDiecinueve;

import java.util.Scanner;

public class Registro {
	static Scanner sc = new Scanner(System.in);
	Pelicula p1 = new Pelicula();
	Cliente c1 = new Cliente();
	Sala s1 = new Sala();
	
	//Pelicula
	public String titulo;
	public String director;
	public int duracion;
	public int edadMinima;
	public double precio;
	
	//Cliente
	public String nombre;
	public int edad;
	public double dineroTotal;
	
	public void entrada() {
		registroPelicula();
		sc.nextLine();
		registroCliente();
		dato();
	}
	
	public void registroPelicula() {
		System.out.println("");
		System.out.println("Pelicula");
		System.out.print("Nombre: ");
		titulo = sc.nextLine();
		System.out.print("Director: ");
		director = sc.nextLine();
		System.out.print("Duracion: ");
		duracion = sc.nextInt();
		System.out.print("Edad minima: ");
		edadMinima = sc.nextInt();
		System.out.print("Precio de la entrada: ");
		precio = sc.nextDouble();
		System.out.println("");
		
		Pelicula p = new Pelicula(titulo,director,duracion,edadMinima,precio);
		System.out.println(p.toString());
	}
	public void registroCliente() {
		System.out.println("");
		System.out.println("Cliente");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		System.out.print("Dinero Actual: ");
		dineroTotal = sc.nextDouble();
		System.out.println("");
		
		Cliente c = new Cliente(nombre,edad,dineroTotal);
		System.out.println(c.toString());
		System.out.println("");
	}
	
	public void dato() {
		if(c1.getDinerototal()>=p1.getPrecio()) {
			if(c1.getEdad()>=p1.getEdadMinima()) {
				System.out.println("Puede ver la pelicula\n");
				System.out.println("Los asientos disponibles son: ");
				s1.asiento();
				System.out.println("");
				System.out.println("Gracias por preferirnos");
				System.out.println("");
			}else {
				System.out.println("No puede ver la pelicula edad insuficiente");
			}
		}else {
			System.out.println("No puede ver la pelicula dinero insuficiente");
		}
	}
}
