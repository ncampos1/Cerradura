package ar.edu.unlam.circulos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	
	public void queSeCreeConElRadioCorrecto(){
		
		Circulo Circulo=new Circulo(2.00);
		assert.assertEquals(2.00, Circulo.getRadio(), 2);
		
	}

	
	
	
	
	


	
}	

