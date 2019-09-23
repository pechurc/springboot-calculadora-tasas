package com.eiv.springboottasas.conversor.tasa;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public abstract class TasaAbstract implements Tasa {

    protected Razon razonOrigen;
    protected Modulo moduloDestino;
    protected int diasAmortizacion;
    
    public Modulo getModuloDestino() {
        return moduloDestino;
    }

    public void setModuloDestino(Modulo modulo) {
        this.moduloDestino = modulo;        
    }

    public Razon getRazonOrigen() {
        return razonOrigen;
    }

    public void setRazonOrigen(Razon razonOrigen) {
        this.razonOrigen = razonOrigen;
    }

    public int getDiasAmortizacion() {
        return diasAmortizacion;
    }

    public void setDiasAmortizacion(int diasAmortizacion) {
        this.diasAmortizacion = diasAmortizacion;
    }

}
