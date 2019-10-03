package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22,11);
		referencias[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22,22);
		referencias[1] = cc2;
		
		ContaPoupanca cp1 = new ContaPoupanca(11,222);
		referencias[0] = cp1;
		
		Conta ref = (ContaCorrente)referencias[1];
		
		System.out.println(ref.getAgencia());
	}

}
