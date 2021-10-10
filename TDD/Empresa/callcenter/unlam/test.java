package Empresa.callcenter.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.callCenter.Celular;
import ar.edu.unlam.pb2.callCenter.Contacto;
import ar.edu.unlam.pb2.callCenter.Empresa;
import ar.edu.unlam.pb2.callCenter.Localidad;
import ar.edu.unlam.pb2.callCenter.Provincia;


public class test {

	@Test
	public void queSePuedaRealizarUnaNuevaLlamada() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com","Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular2 = new Celular(549,011,1562881349);
		Contacto contacto2 = new Contacto("Nadia Corvini",celular2,"nadiacorvini@gmail.com","Tapalque 230",1234,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular3 = new Celular(549,011,1533897799);
		Contacto contacto3 = new Contacto("Marcela Sartori",celular3,"marcelasartori@gmail.com","Tapalque 230",2222,Localidad.Haedo,Provincia.BUENOSAIRES);
		Contacto contactos[] = {contacto1,contacto2,contacto3};
		Integer cPValido[] = {1706,1904,1132};
		Empresa empresa1 = new Empresa("Nadia Inc.",contactos,cPValido);
		Contacto valorEsperado = contacto1;
		Contacto valorObtenido = empresa1.realizarNuevaLlamada();
		assertEquals(valorEsperado, valorObtenido);
		
	}
// git no te banco
}
