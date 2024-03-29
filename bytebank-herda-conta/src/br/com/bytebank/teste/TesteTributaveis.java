package br.com.bytebank.teste;

import br.com.bytebank.modelo.CalculadorDeImposto;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 3333);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(sv);
		
		System.out.println(calc.getTotalImposto());
	}

}
