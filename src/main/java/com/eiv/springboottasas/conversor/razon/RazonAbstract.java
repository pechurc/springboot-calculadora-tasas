package com.eiv.springboottasas.conversor.razon;

import com.eiv.springboottasas.conversor.enums.Modulo;

public abstract class RazonAbstract implements Razon {

    protected Double tasa;
    protected Modulo moduloOrigen;
    protected Modulo moduloDestino;
    protected int diasAmortizacion;

    public void setTasaOrigen(Double tasa) {
        this.tasa = tasa;
    }

    public void setModuloOrigen(Modulo modulo) {
        this.moduloOrigen = modulo;
    }
    
    public void setModuloDestino(Modulo modulo) {
        this.moduloDestino = modulo;
    }

    public void setDiasAmortizacion(int dias) {
        this.diasAmortizacion = dias;
    }
    
    public Double getTasaOrigen() {
        return tasa;
    }

    public Modulo getModuloOrigen() {
        return moduloOrigen;
    }

    public Modulo getModuloDestino() {
        return moduloDestino;
    }

    public int getDiasAmortizacion() {
        return diasAmortizacion;
    }
    
    public Double getRazonTasaEfectiva() {
        return tasa;
    }

    public Double getRazonTasaNominalVencida() {
        return tasa;
    }
    
    public Double getRazonTasaNominalAdelantada() {
        return tasa;
    }
}
