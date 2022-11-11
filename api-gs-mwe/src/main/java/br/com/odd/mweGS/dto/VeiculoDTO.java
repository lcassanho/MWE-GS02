package br.com.odd.mweGS.dto;

import br.com.odd.mweGS.model.Ambiente;

public class VeiculoDTO {
	    private String marca;
	    private String modelo;
	    private String placa;
	    private String quilometragem;
	    private Ambiente ambiente;
	    
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
