package EjercicioVeinteySeis;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	static ArrayList <Contacto> contacto = new ArrayList<Contacto>();
	static Scanner sc = new Scanner(System.in);
	static Celular c = new Celular();	
	
	public void añadirContacto() {
		String nombre;
		String numero;
		if(contacto.size()==10) {
			agendaLlena();
		}else {
			System.out.println("");
			System.out.println("Ingrese el contacto");
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("Numero: ");
			numero = sc.nextLine();
			System.out.println("");
			
			Contacto c = new Contacto(nombre,numero);
			contacto.add(c);
		}
	}
	
	public void capacidadContacto() {
		contacto.ensureCapacity(10);
	}
	
	public void listaAgenda() {
		int i=1;
		if(contacto.isEmpty()) {
			System.out.println("");
			System.out.println("Su lista de contacto esta vacia");
			System.out.println("");
		}else {
			System.out.println("");
			for(Contacto a:contacto) {
				System.out.print("N°"+i+" ");
				System.out.println(a.toString());
				System.out.println("");
				i++;
			}
		}
	}
	
	public void buscarContacto() {
		String nombre;
		int bus=0,i=0;
		System.out.println("");
		System.out.println("Escriba el nombre del contacto a buscar");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("");
		for(Contacto c:contacto) {
			if(nombre.equals(c.getNombre())) {
				bus = i;
			}				
			i++;
		}
		if(contacto.size()==bus) {
			System.out.println("");
			System.out.println("No se encontro el contacto...");
			System.out.println("");
			c.celular();
		}else {
			System.out.println("Se encontro su contacto");
			System.out.println(contacto.get(bus).toString());
			System.out.println("");
		}
	}
	
	public void eliminarContacto() {
		String nombre;
		int bus = contacto.size(),i = 0;
		System.out.println("");
		System.out.println("Escriba el nombre del contacto a eliminar");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("");
		for(Contacto c:contacto) {
			if(nombre.equals(c.getNombre())) {
				bus = i;
			}
			i++;
		}
		if(contacto.size()==bus) {
			System.out.println("");
			System.out.println("No se encontro el contacto...");
			System.out.println("");
			c.celular();
		}
		contacto.remove(bus);
		System.out.println("");
		System.out.println("El contacto se elimino con exito...");
		System.out.println("");
	}
	
	public void agendaLlena() {
		System.out.println("");
		if(contacto.size()==10) {
			System.out.println("La agenda esta llena");
			System.out.println("");
		}else {
			System.out.println("Aun quedan espacios libres");
			System.out.println("");
		}
	}
	
	public void espacioLibre() {
		System.out.println("");
		System.out.println("Aun quedan "+(contacto.size())+" espacio libres");
		System.out.println("");
	}
}











