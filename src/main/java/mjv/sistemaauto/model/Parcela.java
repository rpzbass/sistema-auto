package mjv.sistemaauto.model;

import java.util.Date;

public class Parcela {

	private Integer id;
	private Integer numero;
	private Date dataVencimento;
	private Double valor;
	private boolean compensada;
	
	Cotacao parcela;
	
	public Parcela() {
		
		
	}

	public Parcela(Integer id, Integer numero, Date dataVencimento, Double valor, boolean compensada) {
		
		this.id = id;
		this.numero = numero;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.compensada = compensada;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isCompensada() {
		return compensada;
	}

	public void setCompensada(boolean compensada) {
		this.compensada = compensada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Parcela other = (Parcela) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
