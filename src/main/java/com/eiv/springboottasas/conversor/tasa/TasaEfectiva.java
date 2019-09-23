package com.eiv.springboottasas.conversor.tasa;

import java.math.BigDecimal;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public class TasaEfectiva extends TasaAbstract {

    public BigDecimal getTasa() {
        
        return razonOrigen.getRazonTasaEfectiva().subtract(BigDecimal.ONE)
                .multiply(BigDecimal.TEN)
                .multiply(BigDecimal.TEN);
    }    
    
    public BigDecimal getRazon() {
        return razonOrigen.getRazonTasaEfectiva();
    }

    @Override
    public BigDecimal calcular(Razon razon, Modulo modulo, int diasAmortizacion) {
        return razon.getRazonTasaEfectiva().subtract(BigDecimal.ONE)
                .multiply(BigDecimal.TEN)
                .multiply(BigDecimal.TEN);
    }

}
