package mjv.sistemaauto.model;

import java.util.Date;

public class EndossoCancelamento {

	private Date dataHoraCancelamento; 

	
	public EndossoCancelamento() {
		
		
	}
	
	public EndossoCancelamento(Date dataHoraCancelamento) {
		
		this.dataHoraCancelamento = dataHoraCancelamento;
	
	}

	public Date getDataHoraCancelamento() {
	
		return dataHoraCancelamento;
	
	}

	public void setDataHoraCancelamento(Date dataHoraCancelamento) {
	
		this.dataHoraCancelamento = dataHoraCancelamento;
	
	}
	
	
	
	
}
