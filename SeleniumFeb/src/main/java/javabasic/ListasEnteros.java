package javabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar lista de enteros
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(100);
		listaNumeros.add(3);
		listaNumeros.add(3);
		listaNumeros.add(2);
		listaNumeros.add(2);
		listaNumeros.add(2);
		listaNumeros.add(2);
		listaNumeros.add(4);
		listaNumeros.add(4);
		listaNumeros.add(20);

		System.out.println(listaNumeros);// muestra la lista

		Collections.sort(listaNumeros);// Ordene la lista de Mayor a Menor
		System.out.println(listaNumeros);// muestra la lista de Mayor a Menor

		Collections.sort(listaNumeros, Collections.reverseOrder()); // Se invierte el orden de la lista
		System.out.println(listaNumeros);// se muestra la cadena invertida

		// QUITAR ELEMENTOS REPETIDOS

		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaNumeros.iterator();

		while (i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++;

			} else {
				last = temp;

			}
		}
		System.out.println(listaNumeros);
		Collections.reverse(listaNumeros); // Se invierte el orden de la lista
		System.out.println(listaNumeros);

		// COMO SACAR EL NUMERO MAYOR Y EL NUMERO MENOR DE LA LISTA

	}// main

}// class
