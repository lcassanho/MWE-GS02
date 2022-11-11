package br.com.odd.mweGS.model;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_regional;
	private Date dataOperacao;
	@ElementCollection
	private List<Veiculo> veiculos;
	
	public Regional(Date dataOperacao, List<Veiculo> veiculos) {
		super();
		this.dataOperacao = dataOperacao;
		this.veiculos = veiculos;
	}

	public Integer getId_regional() {
		return id_regional;
	}

	public void setId_regional(Integer id_regional) {
		this.id_regional = id_regional;
	}

	public Date getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

}
