package com.eiv.springboottasas.conversor.razon;

import com.eiv.springboottasas.conversor.enums.Modulo;

public interface Razon {
    void setTasaOrigen(Double tasa);
    
    Double getTasaOrigen();
    
    void setModuloOrigen(Modulo modulo);
    
    Modulo getModuloOrigen();
    
    void setModuloDestino(Modulo modulo);
    
    Modulo getModuloDestino();
    
    void setDiasAmortizacion(int dias);
    
    int getDiasAmortizacion();
    
    Double getRazonTasaEfectiva();
    
    Double getRazonTasaNominalVencida();
    
    Double getRazonTasaNominalAdelantada();
}
