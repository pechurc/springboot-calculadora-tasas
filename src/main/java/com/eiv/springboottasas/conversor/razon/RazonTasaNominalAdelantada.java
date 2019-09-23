package com.eiv.springboottasas.conversor.razon;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.eiv.springboottasas.conversor.enums.Modulo;

public class RazonTasaNominalAdelantada extends RazonAbstract {
    
    public RazonTasaNominalAdelantada() {
        
    }
    
    public RazonTasaNominalAdelantada(Integer diasAmortizacion, Modulo moduloOrigen,
            Modulo moduloDestino, BigDecimal tasa) {
        
        this.diasAmortizacion = diasAmortizacion;
        this.moduloOrigen = moduloOrigen;
        this.moduloDestino = moduloDestino;
        this.tasa = tasa;        
    }
    
    @Override
    public BigDecimal getRazonTasaEfectiva() {
        BigDecimal base = BigDecimal.ONE.subtract(tasa.multiply(new BigDecimal(diasAmortizacion))
                .divide(new BigDecimal(moduloOrigen.getDias()), 8, RoundingMode.HALF_UP)
                        .multiply(BigDecimal.TEN)
                        .multiply(BigDecimal.TEN));
        
        BigDecimal exponente = new BigDecimal(moduloDestino.getDias())
                .divide(new BigDecimal(diasAmortizacion), 8, RoundingMode.HALF_UP);
        
        Double a = base.doubleValue();
        BigDecimal b = BigDecimal.ZERO.subtract(exponente);
        Double potencia = Math.pow(a, 
                b.doubleValue());
        
        return new BigDecimal(potencia);
    }
    
    @Override
    public BigDecimal getRazonTasaNominalVencida() {
        BigDecimal exponente = new BigDecimal(diasAmortizacion)
                .divide(new BigDecimal(moduloOrigen.getDias()));
        
        BigDecimal base = tasa.divide(BigDecimal.TEN).divide(BigDecimal.TEN).add(BigDecimal.ONE);
        
        Double potencia = Math.pow(base.doubleValue(), exponente.doubleValue());
        
        return new BigDecimal(potencia).subtract(BigDecimal.ONE);
    }

}
