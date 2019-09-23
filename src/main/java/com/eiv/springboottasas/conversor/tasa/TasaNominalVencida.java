package com.eiv.springboottasas.conversor.tasa;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public class TasaNominalVencida extends TasaAbstract {
  
    public BigDecimal getTasa() {
        
        BigDecimal numerador = new BigDecimal(moduloDestino.getDias())
                .multiply(BigDecimal.TEN)
                .multiply(BigDecimal.TEN);
        
        BigDecimal tasa = numerador.divide(new BigDecimal(diasAmortizacion),
                8, RoundingMode.HALF_UP);
        
        return razonOrigen.getRazonTasaNominalVencida().multiply(tasa);
    }    
    
    public BigDecimal getRazon() {
        return razonOrigen.getRazonTasaNominalVencida();
    }

    @Override
    public BigDecimal calcular(Razon razon, Modulo modulo, int diasAmortizacion) {
        BigDecimal numerador = new BigDecimal(modulo.getDias())
                .multiply(BigDecimal.TEN)
                .multiply(BigDecimal.TEN);
        BigDecimal tasa = numerador.divide(new BigDecimal(diasAmortizacion),
                8, RoundingMode.HALF_UP);
         
        return razon.getRazonTasaNominalVencida().multiply(tasa);
    }

}
