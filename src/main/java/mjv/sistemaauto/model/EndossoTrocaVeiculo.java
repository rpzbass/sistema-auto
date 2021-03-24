package mjv.sistemaauto.model;

public class EndossoTrocaVeiculo extends Endosso{

	
	Veiculo veiculoNovo;
	
	Veiculo veiculoAntigo;
	
	public EndossoTrocaVeiculo() {
		
		
	}

	public EndossoTrocaVeiculo(Veiculo veiculoAntigo,Veiculo veiculoNovo) {
		
		this.veiculoNovo = veiculoNovo;
		this.veiculoAntigo = veiculoAntigo;
	
	}
	
	public EndossoTrocaVeiculo(Veiculo veiculoNovo) {
		
		this.veiculoNovo = veiculoNovo;
	
	}
	
	public Veiculo getVeiculoNovo() {
		return veiculoNovo;
	}

	public void setVeiculoNovo(Veiculo veiculoNovo) {
		this.veiculoNovo = veiculoNovo;
	}

	public Veiculo getVeiculoAntigo() {
		return veiculoAntigo;
	}

	public void setVeiculoAntigo(Veiculo veiculoAntigo) {
		this.veiculoAntigo = veiculoAntigo;
	}
	
	
	
}
