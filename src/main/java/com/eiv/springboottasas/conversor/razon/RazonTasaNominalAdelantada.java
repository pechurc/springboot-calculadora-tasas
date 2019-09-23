package com.eiv.springboottasas.conversor.razon;

import com.eiv.springboottasas.conversor.enums.Modulo;

public class RazonTasaNominalAdelantada extends RazonAbstract {
    
    public RazonTasaNominalAdelantada() {
        
    }
    
    public RazonTasaNominalAdelantada(Integer diasAmortizacion, Modulo moduloOrigen,
            Modulo moduloDestino, Double tasa) {
        
        this.diasAmortizacion = diasAmortizacion;
        this.moduloOrigen = moduloOrigen;
        this.moduloDestino = moduloDestino;
        this.tasa = tasa;        
    }
    
    @Override
    public Double getRazonTasaEfectiva() {
        Double base = 1 - ((tasa * diasAmortizacion) / (moduloOrigen.getDias() * 100));
        Double exponente = -((double)moduloDestino.getDias() / diasAmortizacion);
        
        Double tasa = Math.pow(base, exponente);
        
        return tasa;
    }
    
    @Override
    public Double getRazonTasaNominalVencida() {
        Double exponente = (double)diasAmortizacion / moduloOrigen.getDias();
        Double base = (getRazonTasaEfectiva() / 100) + 1;
        
        Double razon = Math.pow(base, exponente) - 1;
        
        return razon;
    }

}
