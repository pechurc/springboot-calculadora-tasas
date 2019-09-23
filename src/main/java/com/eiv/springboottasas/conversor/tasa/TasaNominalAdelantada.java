package com.eiv.springboottasas.conversor.tasa;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public class TasaNominalAdelantada extends TasaAbstract {

    public Double getTasa() {
        
        Double numerador = moduloDestino.getDias() * 100.0;
        Double tasa = numerador / diasAmortizacion;
        
        return razonOrigen.getRazonTasaNominalAdelantada() * tasa;
    }    
    
    public Double getRazon() {
        return razonOrigen.getRazonTasaNominalAdelantada();
    }

	@Override
	public Double calcular(Razon razon, Modulo modulo, int diasAmortizacion) {
		Double numerador = modulo.getDias() * 100.0;
        Double tasa = numerador / diasAmortizacion;
        
        return razon.getRazonTasaNominalAdelantada() * tasa;
	}

}
