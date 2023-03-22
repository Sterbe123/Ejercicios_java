/*Nos piden hacer que gestionemos una serie de productos.

Los productos tienen los siguientes atributos:

Nombre
Precio
Tenemos dos tipos de productos:

Perecedero: tiene un atributo llamado d�as a caducar
No perecedero: tiene un atributo llamado tipo
Crea sus constructores, getters, setters y toString.

Tendremos una funci�n llamada calcular, que seg�n cada clase har� una cosa u otra, 
a esta funci�n le pasaremos un numero siendo la cantidad de productos

En Producto, simplemente seria multiplicar el precio por la cantidad de productos pasados.
En Perecedero, aparte de lo que hace producto, el precio se reducir� seg�n los d�as a caducar:
Si le queda 1 d�a para caducar, se reducir� 4 veces el precio final.
Si le quedan 2 d�as para caducar, se reducir� 3 veces el precio final.
Si le quedan 3 d�as para caducar, se reducir� a la mitad de su precio final.
En NoPerecedero, hace lo mismo que en producto
Crea una clase ejecutable y crea un array de productos y 
muestra el precio total de vender 5  productos de cada uno. Crea t� mismo los elementos del array.*/

package EjercicioVeinticuatro;

public class Producto {
	protected String nombre;
	protected double precio;
	
	public Producto(String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	
	public String toString() {
		return "\nNombre: "+nombre+"\nPrecio: "+precio;
	}
}
