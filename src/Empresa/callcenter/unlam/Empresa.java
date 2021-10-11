package Empresa.callcenter.unlam;

public class Empresa {
	
	private String nombre;
	private Contacto[] contacto;
	private Integer [] cPValido;
	
	public Empresa(String nombre, Contacto[] contactos, Integer[] cPValido) {
		this.nombre= nombre;
		this.contacto= new Contacto[10];
		this.cPValido= new Integer[10];
	}

	public Contacto realizarNuevaLlamada(String contactoLlamada) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Contacto[] getContacto() {
		return contacto;
	}

	public void setContacto(Contacto[] contacto) {
		this.contacto = contacto;
	}

	public Integer[] getcPValido() {
		return cPValido;
	}

	public void setcPValido(Integer[] cPValido) {
		this.cPValido = cPValido;
	}
	

}
