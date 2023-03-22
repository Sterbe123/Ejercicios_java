 /*Crearemos una clase llamada Serie con las siguientes características:
Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
Por defecto, el numero de temporadas es de 3 temporadas y entregado false. 
El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y creador. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
Crearemos una clase Videojuego con las siguientes características:

Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
Por defecto, las horas estimadas serán de 10 horas y entregado false. 
El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y horas estimadas. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
Como vemos, en principio, las clases anteriores no son padre-hija, 
pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:

entregar(): cambia el atributo prestado a true.
devolver(): cambia el atributo prestado a false.
isEntregado(): devuelve el estado del atributo prestado.
Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. 
Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. 
Recuerda el uso de los casting de objetos.
Implementa los anteriores métodos en las clases Videojuego y Serie. 
Ahora crea una aplicación ejecutable y realiza lo siguiente:

Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
Crea un objeto en cada posición del array, con los valores que desees, 
puedes usar distintos constructores.
Entrega algunos Videojuegos y Series con el método entregar().
Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. 
Muestralos en pantalla con toda su información (usa el método toString()).*/

package EjercicioQuince;

public class Serie implements Entregable{
	private String titulo;
	private int nTemporadas;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	public Serie() {
		
	}
	public Serie(String genero,String creador) {
		this.genero = genero;
		this.creador = creador;
	}
	public Serie(String titulo,int nTemporadas,String genero,String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getNtemporadas() {
		return nTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setNtemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String toString() {
		return "\nTitulo: "+titulo+"\nN° de Temporadas: "+nTemporadas+"\nGenero: "+genero+"\nCreador: "+creador;
	}
	@Override
	public void entregar() {
		entregado = true;
		
	}
	@Override
	public void devolver() {
		entregado = false;
	}
	@Override
	public boolean isEntragado() {
		if(entregado==true) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int compareTo(Object a) {
		Videojuego v = new Videojuego();
		int b = -1;
		if(this.nTemporadas==v.getHoraEsimada()) {
			return 0;
		} else if(this.nTemporadas<v.getHoraEsimada()) {
			return 1;
		}
		return b;
	}
}
