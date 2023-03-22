/*Nos piden hacer un almac�n, vamos a usar programaci�n orientado a objetos.

En un almac�n se guardan un conjunto de  bebidas.

Estos productos son bebidas como agua mineral y bebidas azucaradas (coca-cola, fanta, etc). 
De los productos nos interesa saber su identificador (cada uno tiene uno distinto), cantidad de litros, precio y marca.

Si es agua mineral nos interesa saber tambi�n el origen (manantial tal sitio o donde sea).

Si es una bebida azucarada queremos saber el porcentaje 
que tiene de az�car y si tiene o no alguna promoci�n (si la tiene tendr� un descuento del 10% en el precio).

En el almac�n iremos almacenado estas bebidas por estanter�as (que son las columnas de la matriz).

Las operaciones del almac�n son las siguientes:

Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almac�n.
Calcular el precio total de una marca de bebida: dada una marca, calcular el precio total de esas bebidas.
Calcular el precio total de una estanter�a: dada una estanter�a (columna) calcular el precio total de esas bebidas.
Agregar producto: agrega un producto en la primera posici�n libre, 
si el identificador esta repetido en alguno de las bebidas, no se agregar� esa bebida.
Eliminar un producto: dado un ID, eliminar el producto del almac�n.
Mostrar informaci�n: mostramos para cada bebida toda su informaci�n.
Puedes usar un main para probar las funcionalidades (a�ade productos, calcula precios, muestra informaci�n, etc)*/

package Veintecinco;

public class Almacen {
	private String id;
	private String bebida;
	private boolean promocion;
	private boolean azucar;
	private int porcentaje;
	private int cantidad;
	private double precio;
	private boolean mineral;
	
	public Almacen(String id,String bebida,boolean promo,boolean azucar,int porcentaje,int cLitros,double precio,boolean mineral) {
		this.id = id;
		this.bebida = bebida;
		this.promocion = promo;
		this.azucar = azucar;
		this.porcentaje = porcentaje;
		this.cantidad = cLitros;
		this.precio = precio;
		this.mineral = mineral;
	}
	public String getId() {
		return id;
	}
	public String getBebida() {
		return bebida;
	}
	public boolean getPromo() {
		return promocion;
	}
	public boolean getAzucar() {
		return azucar;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public int getCLitros() {
		return cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public void setPromo(boolean promo) {
		this.promocion = promo;
	}
	public void setAzucar(boolean azucar) {
		this.azucar = azucar;
	}
	public void setPorcentaje(int por) {
		this.porcentaje = por;
	}
	public void setCLitros(int litro) {
		this.cantidad = litro;
	}
	public void serPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isMineral() {
		return mineral;
	}
	public void setMineral(boolean mineral) {
		this.mineral = mineral;
	}
	
	public double precioFinal() {
		double pre = precio;
		double desc;
		if(promocion==true) {
			desc = ((pre*10)/100);
			pre -= desc;
			pre *= cantidad;
		}else {
			pre *= cantidad;
		}
		return pre;
	}
	public String toString() {
			if(azucar==true) {
				return "ID: "+id+"\nMarca: "+bebida+"\nCantidad de litros:"+cantidad+"\nPrecio por litro: "
						+precio+"\nPrecio Total: "+precioFinal()+"\nContiene azucar: si"+"\nPorcentaje de azucar: "+porcentaje;
			}else {
				return "ID: "+id+"\nMarca: "+bebida+"\nCantidad de litros:"+cantidad+"\nPrecio por litro: "
						+precio+"\nPrecio Total: "+precioFinal()+"\nContiene azucar: no";
			}
	}	
}

