package br.com.bytebank.modelo;

import java.io.Serializable;

/**
 * Classe abstrata de uma conta
 * @author Anderson
 * @version 0.1
 */
public abstract class Conta implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
	//	System.out.println("O total de conta é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("Conta " + numero + " criada!");
	}
	
	public abstract void deposita(double valor);
	
	public void saca (double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + 
					" Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo(){
		return this.saldo;
	}

	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é permitido valor menor igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não é permitido valor menor igual a zero");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Agência: " + this.agencia + " Numero: " + this.numero + " Saldo: " + this.saldo;
	}
	
}
