package EjercicioDiecinueve;

public class Pelicula {
	private String titulo;
	private String director;
	private int duracion;
	private int edadMinima;
	private double precio;
	
	public Pelicula() {
		this.titulo = "No Establecido";
		this.director = "No Establecido";
		this.duracion = 0;
		this.edadMinima = 7;
		this.precio = 1000;
	}
	
	public Pelicula(String titulo,String director,int duracion,int edadMinima,double precio) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.precio = precio;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getDirector() {
		return director;
	}
	public int getDuracion() {
		return duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public double getPrecio() {
		return precio;
	}
	public String toString() {
		return "Titulo: "+titulo+"\nDirector: "+director+"\nDuracion: "+duracion+"\nEdad minima: "+edadMinima+"\nPrecio: "+precio;
	}
}
