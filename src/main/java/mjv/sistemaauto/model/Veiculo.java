package mjv.sistemaauto.model;

public class Veiculo {

	private Integer id;
	private String placa;
	private String chassi;
	private String descricao;
	private Double valorMercado;
	private Integer anoFabricacao;
	private boolean zeroKm;
	
	
	public Veiculo() {
		
		
	}

	public Veiculo(Integer id, String placa, String chassi, String descricao, Double valorMercado,Integer anoFabricacao, boolean zeroKm) {
		
		this.id = id;
		this.placa = placa;
		this.chassi = chassi;
		this.descricao = descricao;
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
		this.zeroKm = zeroKm;
	
	}


	public Integer getId() {
	
		return id;
	
	}


	public void setId(Integer id) {
	
		this.id = id;
	
	}


	public String getPlaca() {
	
		return placa;
	
	}


	public void setPlaca(String placa) {
	
		this.placa = placa;
	
	}


	public String getChassi() {
	
		return chassi;
	
	}


	public void setChassi(String chassi) {
	
		this.chassi = chassi;
	
	}


	public String getDescricao() {
	
		return descricao;
	
	}


	public void setDescricao(String descricao) {
	
		this.descricao = descricao;
	
	}


	public Double getValorMercado() {
	
		return valorMercado;
	
	}


	public void setValorMercado(Double valorMercado) {
	
		this.valorMercado = valorMercado;
	
	}


	public Integer getAnoFabricacao() {
	
		return anoFabricacao;
	
	}


	public void setAnoFabricacao(Integer anoFabricacao) {
	
		this.anoFabricacao = anoFabricacao;
	
	}


	public boolean isZeroKm() {
	
		return zeroKm;
	
	}


	public void setZeroKm(boolean zeroKm) {
	
		this.zeroKm = zeroKm;
	
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	
	
	
	
}
