package poo.model;

public class Pessoa {
	
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;	
	
	public enum TipoPessoa{FISICA, JURIDICA}
	
	private Integer codigo;
	protected String nome;
	protected String documento;
	protected TipoPessoa tipo;
	
//------------------------------------------------------------------------------	
	public TipoPessoa getTipo() {
		return tipo;
	}
	public String getDocumento() {
		return documento;
	}
	
	// verificação pessoa fisíca ou juridica.
	public void setDocumento(String documento) {
		// testando se o documento é nulo ou fazio
		if(documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio");
		}
		// testa caso o documento tenha 11 digitos
		if(documento.length() == TAMANHO_CPF) {
			setDocumento(documento, TipoPessoa.FISICA);
		}
		// ou se o documento tem 14 digitos
		else if(documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, TipoPessoa.JURIDICA);
		}
		// em caso de nenhumas das alternativas acima
		else {
			
			throw new RuntimeException("Documento invalido para pessoa fisíca ou jurídica");
		}
		this.documento = documento;
	}
	
	// adiciona os dados as propriedades documento e tipo
	private void setDocumento(String documento, TipoPessoa tipo) {
 		
		this.documento = documento;
		this.tipo = tipo;
		
	}
		
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
}
