package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTest {
	
	Partido objPartidoTest;

	@BeforeEach
	void setUp() throws Exception {objPartidoTest = new Partido();
	}

	@Test
	void testresultado(){
		objPartidoTest.setEquipo1(new Equipo("Suiza"));
		objPartidoTest.setEquipo2(new Equipo ("Francia"));
		objPartidoTest.setResultadoequipo1(2);
		objPartidoTest.setResultadoequipo2(1);
		System.out.println(objPartidoTest.toString());
		System.out.println(objPartidoTest.Resultados(new Equipo ("Francia")));
		fail("Not yet implemented");
	}

}
