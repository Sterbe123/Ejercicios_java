/* Queremos representar con programaci�n orientada a objetos, un aula con estudiantes y un profesor.
Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y sexo. 
De los estudiantes, queremos saber tambi�n su calificaci�n actual (entre 0 y 10) y del profesor que materia da.
Las materias disponibles son matem�ticas, filosof�a y f�sica.
Los estudiantes tendr�n un 50% de hacer novillos, 
por lo que si hacen novillos no van a clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su sitio).
El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.)
Las dos operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).
El aula debe tener un identificador num�rico, el n�mero m�ximo de estudiantes y para que esta destinada (matem�ticas, filosof�a o f�sica). 
Piensa que m�s atributos necesita.
Un aula para que se pueda dar clase necesita que el profesor est� disponible, 
que el profesor de la materia correspondiente en el aula correspondiente (un profesor de filosof�a no puede dar en un aula de matem�ticas) 
y que haya m�s del 50% de alumnos.
El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase, teniendo en cuenta las condiciones antes dichas.
Si se puede dar clase mostrar cuantos alumnos y alumnas (por separado) est�n aprobados de momento (imaginad que les est�n entregando las notas).
NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) 
siempre y cuando tengan sentido (edad no puede ser 80 en un estudiante o calificaci�n ser 12).*/

package EjercicioDieciocho;

public abstract class Persona {
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	public Persona() {
		
	}
	public Persona(String nombre,int edad,String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getSexo() {
		return sexo;
	}
	public abstract int asistencia();
	
	public String toString() {
		return "\nNombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo;
	}
}
