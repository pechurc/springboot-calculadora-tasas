package com.eiv.springboottasas.conversor.tasa;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public interface Tasa {
   
    public Double calcular(Razon razon, Modulo modulo, int diasAmortizacion);

    Double getTasa();
    
    public Modulo getModuloDestino();

    public void setModuloDestino(Modulo modulo);

    public Razon getRazonOrigen();
    
    public void setRazonOrigen(Razon razonOrigen);

    public int getDiasAmortizacion();

    public void setDiasAmortizacion(int diasAmortizacion);
}
