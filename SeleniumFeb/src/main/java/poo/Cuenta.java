package poo;

public class Cuenta {
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta() {

	}

	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;

	}

	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;

	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

	public String getNombre() {
		return nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;

		if (n < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + n;
		}

		return ingresoCorrecto;
	}
	
	public boolean reintegro(double n) {
		boolean reintregroCorrecto = true;
		if (n < 0) {
			reintregroCorrecto = false;
		} else if (saldo >= n) {
			// saldo=saldo-n;
			saldo -= n;
		} else {
			reintregroCorrecto = false;
		}

		return reintregroCorrecto;
	}
	
	public boolean trasferencia(Cuenta c, double n) {
		boolean correcto = true;
		if (n < 0) {
			correcto = false;
		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		} else {
			correcto = false;
		}

		return correcto;
	}
	
}
