package poo;


import java.util.Properties;

import comun.LeerProperties;

public class TestProprerties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeerProperties prop = new LeerProperties();
		prop.getSystemProperties();
		
		String mensaje = System.getProperty("MENSAJE");
		String mensaje2 = System.getProperty("HOLA");
		String mensaje3 = System.getProperty("ANALLELY");
		System.out.println(mensaje);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		
		int numero = Integer.parseInt(System.getProperty("NUMERO"));
		System.out.println(numero);
			
		
		prop.setSystemPropFileName(System.getProperty("user.id")+"src\\main\\resources\\datafiles\\data2.properties");
		prop.getSystemProperties();
		String archivo = System.getProperty("MENSAJE");
		System.out.println(archivo);
		
		
	}

}
