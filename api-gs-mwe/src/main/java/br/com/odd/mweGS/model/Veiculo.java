package br.com.odd.mweGS.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.odd.mweGS.dto.VeiculoDTO;

@Entity
public class Veiculo {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String marca;
	    private String modelo;
	    private String placa;
	    private String quilometragem;
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "id_ambiente")
	    private Ambiente ambiente;
	    
	    public Veiculo(VeiculoDTO veDTO){
	        this.marca = veDTO.getMarca();
	        this.modelo = veDTO.getModelo();
	        this.placa = veDTO.getPlaca();
	        this.quilometragem = veDTO.getQuilometragem();
	        this.ambiente = veDTO.getAmbiente();
	    }
		
		public Veiculo() {
			super();
		}	
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getQuilometragem() {
			return quilometragem;
		}
		public void setQuilometragem(String quilometragem) {
			this.quilometragem = quilometragem;
		}
		public Ambiente getAmbiente() {
			return ambiente;
		}
		public void setAmbiente(Ambiente ambiente) {
			this.ambiente = ambiente;
		} 

}
