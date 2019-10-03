package br.com.bytebank.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteSerialiazacao {

	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome("And");
		cliente.setProfissao("desenvolvedor");
		cliente.setCpf("123456789");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream
				(new FileOutputStream("cc.bin"));
		
		oos.writeObject(cc);
		oos.close();

	}

}
