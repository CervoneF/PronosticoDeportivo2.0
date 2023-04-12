package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PronosticoTest {

	Pronostico objPronosticoTest;
	
	
	@BeforeEach
	void setUp() throws Exception {objPronosticoTest = new Pronostico();}

	
	
	@Test
	void testCalcularPuntos() {
		
		objPronosticoTest.setResultado(resultadoEnum.perdedor);
		objPronosticoTest.setEquipo(new Equipo ("Argentina"));
		objPronosticoTest.setPartido(new Partido (new Equipo ("Argentina"),new Equipo ("Arabia Saudita"),1,2));
		System.out.println(objPronosticoTest.puntos());
		fail("Not yet implemented");
	}

}
