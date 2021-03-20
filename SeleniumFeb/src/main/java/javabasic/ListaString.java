package javabasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> listaNombre=new ArrayList <>();
		listaNombre.add("e");
		listaNombre.add("z");
		listaNombre.add("x");
		listaNombre.add("y");
		listaNombre.add("c");
		listaNombre.add("b");
		listaNombre.add("a");
		listaNombre.add("a");

		
		System.out.println(listaNombre);
		Collections.sort(listaNombre);
		System.out.println(listaNombre);
		Collections.sort(listaNombre, Collections.reverseOrder());
		System.out.println(listaNombre);
		
		List <String> quitaRepetidos =listaNombre.stream()
				.distinct().
				collect(Collectors.toList());
		System.out.println(quitaRepetidos);
		Collections.reverse(quitaRepetidos);
		System.out.println(quitaRepetidos);
		
		
		//Eliminar los elementos repetidos de la lista String
		
		
	}

}
