/*Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. 
No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el m�s adecuado, tambi�n su tipo. 
Si quieres a�adir alg�n atributo puedes hacerlo.

Por defecto, todos los atributos menos el DNI ser�n valores por defecto 
seg�n su tipo (0 n�meros, cadena vac�a para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.

Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como par�metro.

Los m�todos que se implementaran son:
	
calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), 
si esta f�rmula devuelve un valor menor que 20, la funci�n devuelve un -1, 
si devuelve un n�mero entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal 
la funci�n devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, 
la funci�n devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.

esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. 
Si no es correcto, sera H. No sera visible al exterior.

toString(): devuelve toda la informaci�n del objeto.

generaDNI(): genera un n�mero aleatorio de 8 cifras, 
genera a partir de este su n�mero su letra correspondiente. 
Este m�todo sera invocado cuando se construya el objeto. 
Puedes dividir el m�todo para que te sea m�s f�cil. No ser� visible al exterior.

M�todos set de cada par�metro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendr� las anteriores variables pedidas por teclado, 
el segundo objeto obtendr� todos los anteriores menos el peso y la altura y el �ltimo por defecto, 
para este �ltimo utiliza los m�todos set para darle a los atributos un valor.
Para cada objeto, deber� comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por �ltimo, mostrar la informaci�n de cada objeto.
Puedes usar m�todos en la clase ejecutable, para que os sea mas f�cil.*/

package EjercicioDoce;

public class Persona {
	private String nombre;
	private int edad;
	private int DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona() {
		
	}
	public Persona(String nombre,int edad,char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public Persona(String nombre,int edad,char sexo,double peso,double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC(double peso,double altura) {
		double imc = (this.peso/(Math.pow(this.altura, 2)));
		int a = 0;
		if(imc<20) {
			a= -1;
		}
	    if(imc>=20 || imc<=25) {
			a = 0;
		}
		if(imc>25){
			a = 1;
		}
		return a;
	}
	public boolean esMayorEdad(int edad) {
		boolean mayor=true;
		if(this.edad>=18) {
			mayor = true;
		}
		if(this.edad<18) {
			mayor=false;
		}
		return mayor;
	}
	public char comprobarSexo(char sexo) {
		char sex = 'H';
		if(this.sexo == 'M') {
			sex = 'M';
		}
		return sex;
	}
	char r = comprobarSexo(sexo);
	
	public String toString() {
		return "Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+r+"\nPeso: "+peso+"\nAltura: "+altura;
	}
	public void generarDNI() {
		DNI = (int) (Math.random()*99999998 + 10000000);
		System.out.println("Su DNI: "+DNI);
		System.out.println("");
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
}
