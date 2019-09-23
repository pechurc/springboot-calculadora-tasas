package com.eiv.springboottasas.conversor.razon;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.eiv.springboottasas.conversor.enums.Modulo;

public class RazonTasaEfectiva extends RazonAbstract {

    public RazonTasaEfectiva() {        
    }
    
    public RazonTasaEfectiva(Integer diasAmortizacion, Modulo moduloOrigen, BigDecimal tasa) {
        
        this.diasAmortizacion = diasAmortizacion;
        this.moduloOrigen = moduloOrigen;
        this.tasa = tasa;
    }
    
    @Override
    public BigDecimal getRazonTasaNominalVencida() {
        BigDecimal exponente = new BigDecimal(diasAmortizacion)
                .divide(new BigDecimal(moduloOrigen.getDias()), 8, RoundingMode.HALF_UP);
        
        BigDecimal base = tasa.divide(BigDecimal.TEN).divide(BigDecimal.TEN).add(BigDecimal.ONE);
        
        Double potencia = Math.pow(base.doubleValue(), exponente.doubleValue());
        
        BigDecimal razon = BigDecimal.valueOf(potencia).subtract(BigDecimal.ONE);
        return razon;
    }
    
    @Override
    public BigDecimal getRazonTasaNominalAdelantada() {
        BigDecimal exponente = new BigDecimal(diasAmortizacion)
                .divide(new BigDecimal(moduloOrigen.getDias()), 8, RoundingMode.HALF_UP);
        
        BigDecimal base = tasa.divide(BigDecimal.TEN).divide(BigDecimal.TEN).add(BigDecimal.ONE);
        
        Double potencia = Math.pow(base.doubleValue(),
                BigDecimal.ZERO.subtract(exponente).doubleValue());
        
        BigDecimal razon = BigDecimal.ONE.subtract(BigDecimal.valueOf(potencia));
        
        return razon;
    }
}
