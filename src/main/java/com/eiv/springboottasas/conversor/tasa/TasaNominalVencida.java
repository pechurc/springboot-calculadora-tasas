package com.eiv.springboottasas.conversor.tasa;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public class TasaNominalVencida extends TasaAbstract {
  
    public Double getTasa() {
        
        Double numerador = moduloDestino.getDias() * 100.0;
        Double tasa = numerador / diasAmortizacion;
        
        return razonOrigen.getRazonTasaNominalVencida() * tasa;
    }    
    
    public Double getRazon() {
        return razonOrigen.getRazonTasaNominalVencida();
    }

    @Override
    public Double calcular(Razon razon, Modulo modulo, int diasAmortizacion) {
        Double numerador = modulo.getDias() * 100.0;
        Double tasa = numerador / diasAmortizacion;
         
        return razon.getRazonTasaNominalVencida() * tasa;
    }

}
