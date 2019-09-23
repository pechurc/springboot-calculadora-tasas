package com.eiv.springboottasas.conversor.razon;

import com.eiv.springboottasas.conversor.enums.Modulo;

public class RazonTasaNominalVencida extends RazonAbstract {
    
    public RazonTasaNominalVencida() {

    }
    
    public RazonTasaNominalVencida(Integer diasAmortizacion, Modulo moduloOrigen,
            Modulo moduloDestino, Double tasa) {
        
        this.diasAmortizacion = diasAmortizacion;
        this.moduloOrigen = moduloOrigen;
        this.moduloDestino = moduloDestino;
        this.tasa = tasa;        
    }
    
    @Override
    public Double getRazonTasaEfectiva() {
        Double base = ((tasa * diasAmortizacion) / (moduloOrigen.getDias() * 100)) + 1;
        Double exponente = (double)moduloDestino.getDias() / diasAmortizacion;
        
        Double tasa = Math.pow(base, exponente);
        
        return tasa;
    }

    @Override
    public Double getRazonTasaNominalAdelantada() {
        Double exponente = -((double)diasAmortizacion / moduloOrigen.getDias());
        Double base = (getRazonTasaEfectiva() / 100) + 1;
        
        Double razon = 1 - Math.pow(base, exponente);
        
        return razon;
    }

}
