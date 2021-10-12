package Empresa.callcenter.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {


	@Test
	public void queSePuedaRealizarUnaNuevaLlamada() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com","Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		
		Celular celular2 = new Celular(549,011,1562881349);
		Contacto contacto2 = new Contacto("Nadia Corvini",celular2,"nadiacorvini@gmail.com","Tapalque 230",1234,Localidad.Haedo,Provincia.BUENOSAIRES);
		
		Celular celular3 = new Celular(549,011,1533897799);
		Contacto contacto3 = new Contacto("Marcela Sartori",celular3,"marcelasartori@gmail.com","Tapalque 230",2222,Localidad.Haedo,Provincia.BUENOSAIRES);
		
		//Contacto contactos[] = null ;
		 //contactos[0] =  contacto1;
		 //contactos[1] =  contacto2;
		 //contactos[2] =  contacto3;
		
		Integer cPValido[] = {1706,1904,1132};
		
		Empresa empresa1 = new Empresa("Nadia Inc.",cPValido);
		
		empresa1.agregarContacto(contacto1);
		empresa1.agregarContacto(contacto2);
		empresa1.agregarContacto(contacto3);
		
		Contacto valorEsperado = contacto1;
		Contacto valorObtenido = empresa1.realizarNuevaLlamada("Cintia Pinaud");
		
		assertEquals(valorEsperado, valorObtenido);

		
	}

}
