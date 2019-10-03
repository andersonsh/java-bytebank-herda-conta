package br.com.bytebank.modelo;

public class GuardadorDeContas {

	private Conta[] referencia;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencia = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencia[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Conta getRefencia(int pos) {
		return this.referencia[pos];
	}
	
	
}
