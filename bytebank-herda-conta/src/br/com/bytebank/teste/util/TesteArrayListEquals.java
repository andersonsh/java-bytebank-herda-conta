package br.com.bytebank.teste.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		List<Conta> lista = new Vector<Conta>(); //thread safe
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("J� existe? " + existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
