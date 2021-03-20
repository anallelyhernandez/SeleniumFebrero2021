package poo2;

/**
 * @author Ana
 *
 */
public class Operario extends Empleado {

	public Operario(String nombre) {
		super(nombre);
		System.out.println("Constructor de Operario" + nombre);

	}

	@Override
	public String toString() {
		return super.toString() + "->" + "Operario";
	}

}
