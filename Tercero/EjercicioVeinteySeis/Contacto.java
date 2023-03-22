/*Nos piden realizar una agenda telef�nica de contactos.

Un contacto est� definido por un nombre y un tel�fono (No es necesario de validar). 
Un contacto es igual a otro cuando sus nombres son iguales.

Una agenda de contactos est� formada por un conjunto de contactos (Piensa en que tipo puede ser)

Se podr� crear de dos formas, indic�ndoles nosotros el tama�o o con un tama�o por defecto (10)

Los m�todos de la agenda ser�n los siguientes:

aniadirContacto(Contacto c): A�ade un contacto a la agenda, 
sino se pueden meter m�s a la agenda se indicara por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto tel�fono.
existeContacto(Conctacto c): indica si el contacto pasado existe o no.
listarContactos(): Lista toda la agenda
buscaContacto(String nombre): busca un contacto por su nombre y muestra su tel�fono.
eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
agendaLlena(): indica si la agenda est� llena.
huecosLibres(): indica cuantos contactos m�s podemos meter.
Crea un men� con opciones por consola para probar todas estas funcionalidades.*/

package EjercicioVeinteySeis;

public class Contacto {
	private String nombre;
	private String numero;
	
	public Contacto(String nombre,String numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public String getNumero() {
		return numero;
	}
	
	public String toString() {
		return "Contacto"+"\nNombre: "+nombre+"\nNumero: "+numero;
	}
}
