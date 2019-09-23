package com.eiv.springboottasas.conversor.razon;

import com.eiv.springboottasas.conversor.enums.Modulo;

public class RazonTasaEfectiva extends RazonAbstract {

    public RazonTasaEfectiva() {        
    }
    
    public RazonTasaEfectiva(Integer diasAmortizacion, Modulo moduloOrigen, Double tasa) {
        
        this.diasAmortizacion = diasAmortizacion;
        this.moduloOrigen = moduloOrigen;
        this.tasa = tasa;
    }
    
    @Override
    public Double getRazonTasaNominalVencida() {
        Double exponente = (double)diasAmortizacion / moduloOrigen.getDias();
        Double base = (tasa / 100) + 1;
        
        Double razon = Math.pow(base, exponente) - 1;
        
        return razon;
    }
    
    @Override
    public Double getRazonTasaNominalAdelantada() {
        Double exponente = -((double)diasAmortizacion / moduloOrigen.getDias());
        Double base = (tasa / 100) + 1;
        
        Double razon = 1 - Math.pow(base, exponente);
        
        return razon;
    }

}
