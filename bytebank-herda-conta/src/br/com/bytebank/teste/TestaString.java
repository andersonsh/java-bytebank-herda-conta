package br.com.bytebank.teste;

public class TestaString {

	public static void main(String[] args) {

		String nome = "Alura";
		
		String nomeAlterado = nome.replace("Al", "cu");
		
		System.out.println(nomeAlterado);
		
		nomeAlterado = nome.toUpperCase();
		
		System.out.println(nomeAlterado);
		
		System.out.println(nome.charAt(2));
		
		System.out.println(nome.indexOf("ur"));
		
		System.out.println(nome.substring(1));
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome.isEmpty());
		
		String vazio = "   ";
		String outroVazio = vazio.trim();
		
		System.out.println(outroVazio.isEmpty());
	}

}
