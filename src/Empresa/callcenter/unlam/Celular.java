package Empresa.callcenter.unlam;

public class Celular {
		private Integer caracteristica;
		private Integer prefijo;
		private Integer numero;
		
		public Celular(Integer caracteristica, Integer prefijo, Integer numero) {
			
			this.caracteristica = caracteristica;
			this.prefijo = prefijo;
			this.numero = numero;
		}

		public Integer getCaracteristica() {
			return caracteristica;
		}

		public void setCaracteristica(Integer caracteristica) {
			this.caracteristica = caracteristica;
		}

		public Integer getPrefijo() {
			return prefijo;
		}

		public void setPrefijo(Integer prefijo) {
			this.prefijo = prefijo;
		}

		public Integer getNumero() {
			return numero;
		}

		public void setNumero(Integer numero) {
			this.numero = numero;
		}
	

}
