package Empresa.callcenter.unlam;

public class Direccion {
	private String direccion;
	private Integer numero;
	
	public Direccion(String direccion, Integer numero) {
		super();
		this.direccion = direccion;
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion [direccion=" + direccion + ", numero=" + numero + "]";
	}
	
	
}
