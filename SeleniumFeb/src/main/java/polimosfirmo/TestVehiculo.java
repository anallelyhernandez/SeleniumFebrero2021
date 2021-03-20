package polimosfirmo;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos[0] = new Vehiculo("GFER", "Ford", "2020");
		misVehiculos[1] = new VehiculoTurismo(2,"AVEO","CHEVROLET","2020");
		misVehiculos[2] = new VehiculoDeportivo("AVEO","CHEVROLET","2020", 8);
		misVehiculos[3] = new VehiculoFurgoneta("AVEO","CHEVROLET","2020",8);

		 
		
		for (Vehiculo vehiculo : misVehiculos) {
			System.out.println(vehiculo.mostrarDatos());
			System.out.print("");

		}
		
		Vehiculo vehiculoDeportivo = new VehiculoDeportivo("GFER", "Ford", "2020",8);
		System.out.println(vehiculoDeportivo.mostrarDatos());
		

	}

}
