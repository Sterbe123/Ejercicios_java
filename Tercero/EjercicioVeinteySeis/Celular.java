package EjercicioVeinteySeis;

import java.util.Scanner;

public class Celular {
    Agenda a = new Agenda();
    Scanner sc = new Scanner(System.in);
	
	public void celular() {
		a.capacidadContacto();
		int res;
		System.out.println("");
		do {
			System.out.println("Menu");
			System.out.println("1. Añadir contacto");
			System.out.println("2. Lista de contacto");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Memoria");
			System.out.println("6. Salir");
			do {
				System.out.print("\nElija una opcion: ");
				res = sc.nextInt();
				if(res<1 || res>6) {
					System.out.println("Error...");
					System.out.println("Numeros fuera de rango");
					System.out.println("Vuelva a digitar");
				}
			}while(res<1 || res>6);		
			switch(res) {
				case 1: a.añadirContacto();
					    break;
				case 2: a.listaAgenda();
						break;
				case 3: a.buscarContacto();
						break;
				case 4: a.eliminarContacto();
						break;
				case 5: a.espacioLibre();
						break;
			}
		}while(!(res==6));
	}
}
