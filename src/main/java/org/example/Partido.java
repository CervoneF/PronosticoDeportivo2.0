package org.example;

//import modelo.Equipo;
//import modelo.ResultadoEnum.Resultados;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int resultadoequipo1;
    private int resultadoequipo2;

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getResultadoequipo1() {
        return resultadoequipo1;
    }

    public void setResultadoequipo1(int resultadoequipo1) {
        this.resultadoequipo1 = resultadoequipo1;
    }

    public int getResultadoequipo2() {
        return resultadoequipo2;
    }

    public void setResultadoequipo2(int resultadoequipo2) {
        this.resultadoequipo2 = resultadoequipo2;
    }

    public Partido(Equipo equipo1, Equipo equipo2, int resultadoequipo1, int resultadoequipo2) {
        super();
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultadoequipo1 = resultadoequipo1;
        this.resultadoequipo2 = resultadoequipo2;
    }

    public Partido() {
        super();
    }
    
    
    public String toString() {
	    return "Equipo uno: " + getEquipo1().getNombre() + " que metió " + getResultadoequipo1() + " goles." +
	    		" - Equipo dos: " + getEquipo2().getNombre() + " que metió " + getResultadoequipo2() + " goles.";
	}

    
    
    public resultadoEnum Resultados (Equipo equipo) {

    	if (equipo.getNombre().equals(this.equipo1.getNombre())) {

    	    if (this.resultadoequipo1 > this.resultadoequipo2) {
    	        return resultadoEnum.ganador;
    	    } else if (this.resultadoequipo1 < this.resultadoequipo2) {
    	        return resultadoEnum.perdedor;
    	    }
    	} else if (equipo.getNombre().equals(this.equipo2.getNombre())) {
    	    if (this.resultadoequipo2 > this.resultadoequipo1) {
    	        return resultadoEnum.ganador;
    	    } else if (this.resultadoequipo2 < this.resultadoequipo1) {
    	        return resultadoEnum.perdedor;
    	    }
    	}
    	
    	if (this.resultadoequipo2 == this.resultadoequipo1) {
    	    return resultadoEnum.empate;
    	} else {
    	    return resultadoEnum.error;
    	}

	}
		
	
}