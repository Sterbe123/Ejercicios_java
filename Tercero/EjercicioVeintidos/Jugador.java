package EjercicioVeintidos;

public class Jugador {
	Revolver r = new Revolver();
	private int id;
	private String nombre;
	private boolean dead = false;
	
	public Jugador(int id,String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean getDead() {
		return dead;
	}
	
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	public void disparar() {
		if(r.disparo()==true) {
			dead = true;
			System.out.println("Estas muerto");
		}else {
			dead = false;
			System.out.println("Sigues vivo");
		}
		r.siguienteBala();
	}
}
