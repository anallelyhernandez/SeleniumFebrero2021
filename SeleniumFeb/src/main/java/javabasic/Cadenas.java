package javabasic;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Hola Curso Selenium";
		String subcadena=cadena.substring(5,10);
		System.out.println(subcadena);
		
		if(cadena.equals("Hola curso selenium")) {
		System.out.println("Cadenas iguales");
		}
		else { 
			System.out.println("Caden diferente");
		}
		if(cadena.equalsIgnoreCase("HOLA CURSO SELENIUM")) {
			System.out.println("Cadena igual");
		}
		else {
			System.out.println("Cadena diferente");
		}
		if(cadena.contains("Ana")) {
			System.out.println("Si contiene la cadena");
		}
		else {
			System.out.println("No la contiene");
		}
	}

}
