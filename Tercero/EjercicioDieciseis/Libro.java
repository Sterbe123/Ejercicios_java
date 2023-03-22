/* Crear una clase Libro que contenga los siguientes atributos:
– ISBN

– Titulo

– Autor

– Número de páginas

Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:

“El libro con ISBN creado por el autor tiene páginas”

En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.

Por último, indicar cuál de los 2 tiene más páginas.*/

package EjercicioDieciseis;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int pagina;
	
	public Libro(String isbn,String titulo,String autor,int pagina) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.pagina = pagina;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getPagina() {
		return pagina;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	
	public String toString() {
		return "\nISBN: "+isbn+"\nTitulo: "+titulo+"\nAutor: "+autor+"\nN° de paginas: "+pagina;
	}	
}
