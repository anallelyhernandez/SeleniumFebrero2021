package polimosfirmo;

public class VehiculoDeportivo extends Vehiculo {
	private int cilindrada;

	public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada=cilindrada;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String mostrarDatos() {
		return "Matricula " + matricula + "/nMarca " + marca + "/nModelo " + modelo + "/nCilindrada " + cilindrada;
	}

}
