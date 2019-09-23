package com.eiv.springboottasas.conversor.tasa;

import java.math.BigDecimal;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public interface Tasa {
   
    public BigDecimal calcular(Razon razon, Modulo modulo, int diasAmortizacion);

    BigDecimal getTasa();
    
    public Modulo getModuloDestino();

    public void setModuloDestino(Modulo modulo);

    public Razon getRazonOrigen();
    
    public void setRazonOrigen(Razon razonOrigen);

    public int getDiasAmortizacion();

    public void setDiasAmortizacion(int diasAmortizacion);
}
