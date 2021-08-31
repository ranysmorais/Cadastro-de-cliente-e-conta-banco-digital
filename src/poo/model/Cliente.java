package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{	
	
	private String numCartao;
	private String codCartao;
	
	private List<Endereco> enderecos;	
	
	public void adicionaEndereco(Endereco endereco) {
		
		if(endereco == null) {
			throw new NullPointerException("Logradouro nao pode ser nulo");
		}		
		if(endereco.getCidade() == null) {
			throw new NullPointerException("Cidade nao pode ser nulo");
		}
		if(endereco.getEstado() == null) {
			throw new NullPointerException("Estado nao pode ser nulo");
		}
		if(endereco.getEndereco() == null) {
			throw new NullPointerException("Endereço nao pode ser nulo");
		}
		if(endereco.getBairro() == null) {
			throw new NullPointerException("Bairro nao pode ser nulo");
		}
		getEnderecos().add(endereco);
	}
	
	private List<Endereco> getEnderecos() {
		if(enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
	
	public void solicitarCartao(Endereco endereco, Cliente cliente) {
		this.numCartao = "1111 2222 3333 4444";
		this.codCartao = "123";
		
	}
	
	public String getNumCartao() {
		if(this.numCartao == null) {
			throw new NullPointerException("Cartão não Solicitado");			
		}
		return this.numCartao;
	}
	
	public String getCodCartao() {
		if(this.codCartao == null) {
			throw new NullPointerException("Cartão não Solicitado");
		}
		return this.codCartao;
	}
	
	public void imprimirDados() {
		System.out.println(" --- NOVO CLIENTE ---");
		System.out.format("Nome: %s",super.nome);
		System.out.println("\n");
		System.out.format("Tipo de Pessoa: %s",super.tipo);
		System.out.println("\n");
		System.out.format("Documento: %s",super.documento);
		System.out.println("\n");
		System.out.format("Cartão: %s",getNumCartao());
		System.out.println("\n");
		System.out.format("Codigo: %s",getCodCartao());
		System.out.println("\n");
		System.out.println("Bandeira: Visa");
		System.out.println(" --- --- --- --- ---");
	}
	
}
