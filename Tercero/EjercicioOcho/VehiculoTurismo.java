package EjercicioOcho;

public class VehiculoTurismo extends Vehiculo{
	private int nPuertas;
	
	public VehiculoTurismo(String matricula,String modelo,String marca,int nPuertas) {
		super(matricula,modelo,marca);
		this.nPuertas = nPuertas;
	}
	public int getNpuertas() {
		return nPuertas;
	}
	public String mostrarDato() {
		return "\nMatricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumeros de puertas: "+nPuertas+" puertas.";
	}
}
