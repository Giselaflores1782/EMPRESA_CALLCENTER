package Empresa.callcenter.unlam;

public class Empresa {
	
	private String nombre;
	private Contacto[] contacto;
	private Integer [] cPValido;
	private Integer agendaContacto;
	
	public Empresa(String nombre, Contacto[] contactos, Integer[] cPValido) {
		this.nombre= nombre;
		this.contacto= new Contacto[10];
		this.cPValido= new Integer[10];
		this.agendaContacto=0;
	}
	
	public Empresa(String nombre, Integer[] cPValido) {
		this.nombre= nombre;
		this.contacto= new Contacto[10];
		this.cPValido= new Integer[10];
		this.agendaContacto=0;
	}

	public Contacto realizarNuevaLlamada(String contactoLlamada) {
		Contacto contac= null ;
			
		for (int i = 0; i < agendaContacto; i++) {
			if(contacto[i].getNombre() == contactoLlamada) {
				contac= contacto[i];
				
			}
			
			
		}
		
		return contac;
	}
	public void  agregarContacto(Contacto nuevoContacto) {
		if(getAgendaContacto()< contacto.length) {
			this.contacto[agendaContacto++]=nuevoContacto;
			
		}
	
		}

	public Integer getAgendaContacto() {
		return agendaContacto;
	}

	public void setAgendaContacto(Integer agendaContacto) {
		this.agendaContacto = agendaContacto;
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
