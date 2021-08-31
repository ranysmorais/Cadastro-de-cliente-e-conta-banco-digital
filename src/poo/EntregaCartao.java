package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartao {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		//  dados do endere�o
		endereco.setCidade("Goi�nia");
		endereco.setEstado("GO");
		endereco.setEndereco("R. Silvia de Moraes");
		endereco.setBairro("Jd Das Flores");
		
		Cliente cliente = new Cliente();
		//  dados do cliente
		try {
			cliente.setDocumento("12345678900");
			cliente.setNome("Jo�o da Silva");			
		}catch(Exception e) {
			System.err.println("Houve um erro ao adicionar Documento: " 
					+ e.getMessage());
			return;
		}
		
		try {
			cliente.adicionaEndereco(endereco);
		}catch(Exception e) {
			System.err.println("Houve um erro ao adicionar endere�o: " 
		+ e.getMessage());
			return;
		}
		
		try {
			
			cliente.solicitarCartao(endereco, cliente);			
			cliente.imprimirDados();
		}catch(Exception e) {
			System.err.println("Houve um erro ao emitir dados: "
		+ e.getMessage());
			return;
		}
				
		
	}
}