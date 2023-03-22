package Veintecinco;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	 static ArrayList <Almacen>almacen = new ArrayList<Almacen>();
	 static Scanner sc = new Scanner(System.in);
	 static App a1 = new App();
	 
	 String id;
	 String nombre;
	 boolean promo;
	 boolean azucar;
	 int porcentaje;
	 int cantidad;
	 double precio;
	 boolean mineral;
	 double pTotal = 0;
	 
	 public void llenarAlmacen() {
		 						 //Id    Bebida	   promo  azucar %  cantidad  mineral 
		 almacen.add(new Almacen("0001","Coca-Cola",false,true,22,24,2500,false));
		 almacen.add(new Almacen("0002","Sprit",false,true,20,150,2000,false));
		 almacen.add(new Almacen("0003","Fanta",true,true,19,15,2500,false));
		 almacen.add(new Almacen("0004","Pepsi",false,true,22,25,2300,false));
		 almacen.add(new Almacen("0005","Ken",false,true,15,20,2100,false));
		 almacen.add(new Almacen("0006","Canchantun",false,false,0,33,2500,true));
		 almacen.add(new Almacen("0007","Awua",false,false,0,19,2500,true));
		 almacen.add(new Almacen("0008","Power",false,true,10,17,1500,false));
		 almacen.add(new Almacen("0009","Aquiarium",true,true,10,14,1500,false));
		 almacen.add(new Almacen("0010","Lipton Ice Tea",true,false,0,45,1500,false));
		
	 }
	 
	 public void precioTotal() {	 
		 for(Almacen total:almacen) {
			 pTotal += total.precioFinal();
		 }
		 System.out.println("El precio total de los producto es $"+pTotal);
	 }
	 
	 public void mostrarProducto() {
		 for(Almacen mostrar:almacen) {
			 System.out.println(mostrar.toString());
			 System.out.println("");
		 }
	 }
	 public void agregarProducto() {
		 String pro,pro1,pro2;
		 boolean pas = false;
		 System.out.println("");
		 System.out.println("Introduzca el producto correspondiente");
		 do {
			 System.out.print("ID: ");
			 id = sc.nextLine();
			 for(Almacen a:almacen) {
				 if(id.equals(a.getId())) {
					 System.out.println("El ID ingresado ya existe...");
					 a1.interaccion();
				 }
			 }
		 }while(pas==true);		 
		 System.out.print("Nombre: ");
		 nombre = sc.nextLine();
		 do {
			 System.out.print("El producto tiene promo (si-no): ");
			 pro = sc.nextLine();
			 if(!(pro.equals("si") || pro.equals("no"))) {
				 System.out.println("Error...");
				 System.out.println("Vuelva a digitar");
			 }
		 }while(!(pro.equals("si") || pro.equals("no")));		 
		 if(pro.equals("si")) {
			 promo = true;
		 }else {
			 promo = false;
		 }
		 do {
			 System.out.print("El producto tiene azucar (si-no): ");
			 pro1 = sc.nextLine();
			 if(!(pro1.equals("si") || pro1.equals("no"))) {
				 System.out.println("Error...");
				 System.out.println("Vuelva a digitar");
			 }
		 }while(!(pro1.equals("si") || pro1.equals("no")));		 
		 if(pro1.equals("si")) {
			 azucar = true;
		 }else {
			 azucar = false;
		 }
		 System.out.print("Porcentaje de azucar: ");
		 porcentaje = sc.nextInt();
		 System.out.print("Cantidad de litros: ");
		 cantidad = sc.nextInt();
		 System.out.print("Precio por litro: ");
		 precio = sc.nextDouble();
		 sc.nextLine();
		 do {
			 System.out.print("El producto es agua mineral (si-no): ");
			 pro2 = sc.nextLine();
			 if(!(pro2.equals("si") || pro2.equals("no"))) {
				 System.out.println("Error...");
				 System.out.println("Vuelva a digitar");
			 }
		 }while(!(pro2.equals("si") || pro2.equals("no")));		 
		 if(pro2.equals("si")) {
			 mineral = true;
		 }else {
			 mineral = false;
		 }
		 System.out.println("");
		 Almacen a = new Almacen(id,nombre,promo,azucar,porcentaje,cantidad,precio,mineral);
		 almacen.add(0,a);
	 }
	 
	 public void eliminarProducto() {
		 String bus = "null";
		 int clear = 0,i=0;
		 System.out.println("Elemento a buscar por el ID");
		 System.out.print("Digite el ID: ");
		 bus = sc.nextLine();
		 System.out.println("");
		 for(Almacen al:almacen) {
			 if(bus.equals(al.getId())) {
				 clear = i;
			 }
			 i++;
		 }
		 almacen.remove(clear);
	 }
}


















