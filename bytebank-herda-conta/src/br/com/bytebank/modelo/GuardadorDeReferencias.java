package br.com.bytebank.modelo;

public class GuardadorDeReferencias {

	private Object[] referencia;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencia = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencia[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Object getRefencia(int pos) {
		return this.referencia[pos];
	}
	
	
}
