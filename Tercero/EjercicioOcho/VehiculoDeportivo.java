package EjercicioOcho;

public class VehiculoDeportivo extends Vehiculo{
	private int cilindrada;
	
	public VehiculoDeportivo(String matricula, String marca, String modelo,int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public String mostrarDato() {
		return "\nMatricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCilindrada: "+cilindrada+" cilindradas.";
	}
}
