package poo2;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("Constructor Oficial");// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +"->"+"T?cnico";
	}
}
