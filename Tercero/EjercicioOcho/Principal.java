package EjercicioOcho;

public class Principal {

	public static void main(String[] args) {
		Vehiculo v[] = new Vehiculo[4];
		
		v[0]= new Vehiculo("BB-26-48","Audi","Z350");
		v[1]= new VehiculoTurismo("CD-55-69","Toyota","Yaris",4);
		v[2]= new VehiculoDeportivo("DF-89-77","Ferrari","154F",500);
		v[3]= new VehiculoFurgoneta("SS-88-94","Jeep","SS",2500);
		
		for(Vehiculo veh:v) {
			System.out.println(veh.mostrarDato());
			System.out.println("");
		}
	}

}
