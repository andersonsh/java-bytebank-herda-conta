package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapping {

	public static void main(String[] args) {

		int [] idades = new int[5];
		String [] nomes = new String[5];
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(29); 
		
		int idade = 32;
		Integer idadeRef = Integer.valueOf(29);//Autoboxing
		System.out.println(idadeRef.doubleValue());
		
		int valor = idadeRef.intValue(); //Unboxing
		
		String s = args[0];
		
		int numero = Integer.parseInt(s);
		
	}

}
