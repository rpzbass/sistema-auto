package mjv.sistemaauto.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cotacao {

	private Long id;
	private boolean apolice;
	private Date inicioVigencia;
	private Date fimVigencia;
	private boolean cancelada;
	private Double valorPremio;
	private boolean veiculoTrabalho;
	private boolean pernoiteGaragem;
	private Double valorCobertura;
	
	Cadastro estipulante;
	
	Cadastro beneficiario;
	
	Veiculo carro;
	
	List<Endosso> endossos = new ArrayList<Endosso>();
	
	List<Parcela> parcelas = new ArrayList<Parcela>();  
	
	
	public Veiculo getCarro() {
		return carro;
	}

	public void setCarro(Veiculo carro) {
		this.carro = carro;
	}

	public List<Endosso> getEndossos() {
		return endossos;
	}

	public void setEndossos(List<Endosso> endossos) {
		this.endossos = endossos;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public Cotacao() {
		
		
	}
	
	public Cotacao(Long id,boolean apolice,Date inicioVigencia,Date fimVigencia,boolean cancelada,Double valorPremio,boolean veiculoTrabalho,boolean pernoiteGaragem,Double valorCobertura ) {
		
		this.id = id;
		this.apolice = apolice;
		this.inicioVigencia = inicioVigencia;
		this.cancelada = cancelada;
		this.valorPremio = valorPremio;
		this.veiculoTrabalho = veiculoTrabalho;
		this.pernoiteGaragem = pernoiteGaragem;
		this.valorCobertura = valorCobertura;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isApolice() {
		return apolice;
	}

	public void setApolice(boolean apolice) {
		this.apolice = apolice;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	public Double getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}

	public boolean isVeiculoTrabalho() {
		return veiculoTrabalho;
	}

	public void setVeiculoTrabalho(boolean veiculoTrabalho) {
		this.veiculoTrabalho = veiculoTrabalho;
	}

	public boolean isPernoiteGaragem() {
		return pernoiteGaragem;
	}

	public void setPernoiteGaragem(boolean pernoiteGaragem) {
		this.pernoiteGaragem = pernoiteGaragem;
	}

	public Double getValorCobertura() {
		return valorCobertura;
	}

	public void setValorCobertura(Double valorCobertura) {
		this.valorCobertura = valorCobertura;
	}

	public Cadastro getEstipulante() {
		return estipulante;
	}

	public void setEstipulante(Cadastro estipulante) {
		this.estipulante = estipulante;
	}

	public Cadastro getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Cadastro beneficiario) {
		this.beneficiario = beneficiario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beneficiario == null) ? 0 : beneficiario.hashCode());
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
		Cotacao other = (Cotacao) obj;
		if (beneficiario == null) {
			if (other.beneficiario != null)
				return false;
		} else if (!beneficiario.equals(other.beneficiario))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

	
}
