package poo2;



public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado objE= new Empleado("Ana");
		Directivo objD= new Directivo("Emiliano");
		Operario objOp = new Operario("Edvin");
		Oficial objOf = new Oficial("Mijail");
		Tecnico objTec = new Tecnico ("Anvin");
		Empleado objEmplTec = new Tecnico("Anallely");
		
		System.out.println(objE);
		System.out.println(objD);
		System.out.println(objOp);
		System.out.println(objOf);
		System.out.println(objTec);
		System.out.println(objEmplTec);

	}

}
