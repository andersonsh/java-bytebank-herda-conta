package br.com.bytebank.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}

//	@Override
//	public String toString() {
//		return "ContaPoupanca [getSaldo()=" + getSaldo() + ", getAgencia()=" + getAgencia() + ", getNumero()="
//				+ getNumero() + ", getTitular()=" + getTitular() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	
}
