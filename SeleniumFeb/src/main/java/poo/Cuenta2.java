package poo;

public class Cuenta2 {

	private String nombre;
	private String numeroCuenta;
	private double interes;
	private double saldo;

	/**
	 * @param nombre
	 * @param numeroCuenta
	 * @param interes
	 * @param saldo
	 */
	public Cuenta2(String nombre, String numeroCuenta, double interes, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.interes = interes;
		this.saldo = saldo;
	}

	/**
	 * @param nombre
	 */
	public Cuenta2(Cuenta2 cuenta) {
		this.nombre = cuenta.nombre;
		this.numeroCuenta = cuenta.numeroCuenta;
		this.interes = cuenta.interes;
		this.saldo = cuenta.saldo;

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}

	/**
	 * @param interes the interes to set
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
