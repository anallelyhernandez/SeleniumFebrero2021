package poo2;

public class Directivo extends Empleado {

	public Directivo() {
		super();
	}

	public Directivo(String nombre) {
		super(nombre);
		System.out.println("Constructor del Directivo");
	}

	@Override
	public String toString() {
		return super.toString() + "->"+"Directivo";
	}

}
