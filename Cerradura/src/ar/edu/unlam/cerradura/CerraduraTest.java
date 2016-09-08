package ar.edu.unlam.cerradura;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraTest {

	@Test
	public void test() {
		
	}
Cerradura Micerradura = new Cerradura();

public void CrearConClave(){
int clave=1234;
Micerradura.abrir(clave);
}


public void SaberSiEstaAbierta(){
	int clave=1234;
	Micerradura.SaberSiEstaAbierta(clave);
	
}


public void Cerrar(){
	int clave=1234;
	Micerradura.Cerrar(clave);
}


}

