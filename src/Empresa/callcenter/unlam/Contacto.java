package Empresa.callcenter.unlam;

public class Contacto {
	private String nombre;
	private Celular celular;
	private String email;
	private Direccion direccion;
	private Localidad localidad;
	private Provincia provincia;
	
	
	public Contacto(String nombre, Celular celular, String email, String direccion, Integer numero, Localidad localidad,
			Provincia provincia) {
	
		this.nombre= nombre;
		this.celular= celular;
		this.email= email;
		this.direccion= new Direccion(direccion, numero);
		this.localidad= localidad;
		this.provincia=provincia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Celular getCelular() {
		return celular;
	}


	public void setCelular(Celular celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public Localidad getLocalidad() {
		return localidad;
	}


	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}


	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
	

}
