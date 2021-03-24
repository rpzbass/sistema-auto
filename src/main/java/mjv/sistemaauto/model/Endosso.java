package mjv.sistemaauto.model;

import java.util.Date;

public class Endosso {

	private Integer id;
	private Date dataHora;
	
    Cotacao endosso;
    
    EndossoTipo endossotipo;
    
    EndossoCancelamento endocancel;
	
	
	public Endosso() {
		
		
	}
	
	public Endosso(Integer id, Date dataHora) {
		
		this.id = id;
		this.dataHora = dataHora;
		
	}

	public Integer getId() {
	
		return id;
	
	}

	public void setId(Integer id) {
	
		this.id = id;
	
	}

	public Date getDataHora() {
	
		return dataHora;
	
	}

	public void setDataHora(Date dataHora) {
	
		this.dataHora = dataHora;
	
	}
	
	
	
	
	
}
