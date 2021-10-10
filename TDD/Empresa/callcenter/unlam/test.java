package Empresa.callcenter.unlam;

import static org.junit.Assert.*;

import org.junit.Test;


public class test {

	@Test
	public void queSePuedaDarDeAltaUnContacto() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com",
				"Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		assertNotNull(contacto1);
	}
// git no te banco y no te quiero
}
