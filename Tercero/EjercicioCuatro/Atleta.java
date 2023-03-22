//Construir un programa para una competencia de atletismo, 
//el programa debe gestionar una serie de atletas caracterizados por su número de atleta, 
//nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.

package EjercicioCuatro;

public class Atleta {
	private String nombre;
	private String dorsal;
	private float tiempo;
	
	public Atleta(String nombre,String dorsal,float tiempo) {
		this.nombre=nombre;
		this.dorsal=dorsal;
		this.tiempo=tiempo;
	}

	public float getTiempo() {
		return tiempo;
	}
	public String mostrarResultado() {
		return "Atleta: "+nombre+"\nDorsal: "+dorsal+"\nTiempo: "+tiempo;
	}
}
