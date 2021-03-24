package mjv.sistemaauto.model;

public class Endereco {

	private Long id;
	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String localidade;
	private String uf;
	private Integer ibge;

	public Endereco() {

	}

	public Endereco(Long id, String cep, String logradouro, String numero, String bairro, String localidade, String uf,
			Integer ibge) {

		this.id = id;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ibge = ibge;

	}

	public Long getId() {
	
		return id;
	
	}

	public void setId(Long id) {
	
		this.id = id;
	
	}

	public String getCep() {
	
		return cep;
	
	}

	public void setCep(String cep) {
	
		this.cep = cep;
	
	}

	public String getLogradouro() {
	
		return logradouro;
	
	}

	public void setLogradouro(String logradouro) {
	
		this.logradouro = logradouro;
	
	}

	public String getNumero() {
	
		return numero;
	
	}

	public void setNumero(String numero) {
	
		this.numero = numero;
	
	}

	public String getBairro() {
	
		return bairro;
	
	}

	public void setBairro(String bairro) {
	
		this.bairro = bairro;
	
	}

	public String getLocalidade() {
	
		return localidade;
	
	}

	public void setLocalidade(String localidade) {
		
		this.localidade = localidade;
	
	}

	public String getUf() {
	
		return uf;
	
	}

	public void setUf(String uf) {
	
		this.uf = uf;
	
	}

	public Integer getIbge() {
	
		return ibge;
	
	}

	public void setIbge(Integer ibge) {
	
		this.ibge = ibge;
	
	}

	
	
	
	
	
	
	
	
}
