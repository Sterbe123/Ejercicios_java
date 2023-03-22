/*Nos piden hacer una un programa que gestione empleados.

Los empleados se definen por tener:

Nombre
Edad
Salario
Tambi�n tendremos una constante llamada PLUS, que tendr� un valor de 300�

Tenemos dos tipos de empleados: repartidor y comercial.

El comercial, aparte de los atributos anteriores, tiene uno m�s llamado comisi�n (double).

El repartidor, aparte de los atributos de empleado, tiene otro llamado zona (String).

Crea sus constructores, getters and setters y toString (piensa como aprovechar la herencia).

No se podr�n crear objetos del tipo Empleado (la clase padre) pero si de sus hijas.

Las clases tendr�n un m�todo llamado plus, que seg�n en cada clase tendr� una implementaci�n distinta. 
Este plus b�sicamente aumenta el salario del empleado.

En comercial, si tiene m�s de 30 a�os y cobra una comisi�n de m�s de 200 euros, se le aplicara el plus.
En repartidor, si tiene menos de 25 y reparte en la �zona 3�, este recibir� el plus.
Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elecci�n.

Crea una clase ejecutable donde crees distintos empleados y le apliques el plus para comprobar que funciona.
*/

package EjercicioVeintitres;

public abstract class Persona {
	protected String nombre;
	protected int edad;
	protected double salario;
	protected int PLUS = 300;
	
	public Persona(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;	
	}
	
	public abstract boolean plus();
	
	public String toString() {
		return "Nombre: "+nombre+"\nEdad: "+edad+"\nSalirio: "+salario;
	}
}
