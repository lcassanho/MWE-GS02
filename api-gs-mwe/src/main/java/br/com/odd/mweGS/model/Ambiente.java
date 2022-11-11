package br.com.odd.mweGS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ambiente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String bairro;
	private String cidade;
	private String estado;
	private String temperatura;
	private String qualidadeAr;

	public Ambiente() {
	}

	public Ambiente(String bairro, String cidade, String estado, String temperatura, String qualidadeAr) {
		super();
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.temperatura = temperatura;
		this.qualidadeAr = qualidadeAr;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getQualidadeAr() {
		return qualidadeAr;
	}

	public void setQualidadeAr(String qualidadeAr) {
		this.qualidadeAr = qualidadeAr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}