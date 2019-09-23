package com.eiv.springboottasas.conversor.razon;

import java.math.BigDecimal;

import com.eiv.springboottasas.conversor.enums.Modulo;

public interface Razon {
    void setTasaOrigen(BigDecimal tasa);
    
    BigDecimal getTasaOrigen();
    
    void setModuloOrigen(Modulo modulo);
    
    Modulo getModuloOrigen();
    
    void setModuloDestino(Modulo modulo);
    
    Modulo getModuloDestino();
    
    void setDiasAmortizacion(int dias);
    
    int getDiasAmortizacion();
    
    BigDecimal getRazonTasaEfectiva();
    
    BigDecimal getRazonTasaNominalVencida();
    
    BigDecimal getRazonTasaNominalAdelantada();
}
