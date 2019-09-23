package com.eiv.springboottasas.conversor.razon;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.eiv.springboottasas.conversor.enums.Modulo;

public class RazonTasaNominalVencida extends RazonAbstract {
    
    public RazonTasaNominalVencida() {

    }
    
    public RazonTasaNominalVencida(Integer diasAmortizacion, Modulo moduloOrigen,
            Modulo moduloDestino, BigDecimal tasa) {
        
        this.diasAmortizacion = diasAmortizacion;
        this.moduloOrigen = moduloOrigen;
        this.moduloDestino = moduloDestino;
        this.tasa = tasa;        
    }
    
    @Override
    public BigDecimal getRazonTasaEfectiva() {
        BigDecimal base = tasa.multiply(new BigDecimal(diasAmortizacion))
                .divide(new BigDecimal(moduloOrigen.getDias()), 8, RoundingMode.HALF_UP)
                        .multiply(BigDecimal.TEN)
                        .multiply(BigDecimal.TEN)
                .add(BigDecimal.ONE);

        Double exponente = (double)moduloDestino.getDias() / diasAmortizacion;
        
        Double razon = Math.pow(base.doubleValue(), exponente);
        
        return new BigDecimal(razon);
    }

    @Override
    public BigDecimal getRazonTasaNominalAdelantada() {
        BigDecimal exponente = BigDecimal.ZERO.subtract(new BigDecimal(diasAmortizacion)
                .divide(new BigDecimal(moduloOrigen.getDias()), 8, RoundingMode.HALF_UP));
        
        BigDecimal base = getRazonTasaEfectiva().multiply(BigDecimal.TEN)
                .multiply(BigDecimal.TEN).add(BigDecimal.ONE);
        
        Double razon = Math.pow(base.doubleValue(), exponente.doubleValue());
        
        return BigDecimal.ONE.subtract(new BigDecimal(razon));
    }

}
