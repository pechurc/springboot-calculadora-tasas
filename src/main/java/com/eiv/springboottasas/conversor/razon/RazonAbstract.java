package com.eiv.springboottasas.conversor.razon;

import java.math.BigDecimal;

import com.eiv.springboottasas.conversor.enums.Modulo;

public abstract class RazonAbstract implements Razon {

    protected BigDecimal tasa;
    protected Modulo moduloOrigen;
    protected Modulo moduloDestino;
    protected int diasAmortizacion;

    public void setTasaOrigen(BigDecimal tasa) {
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
    
    public BigDecimal getTasaOrigen() {
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
    
    public BigDecimal getRazonTasaEfectiva() {
        return tasa;
    }

    public BigDecimal getRazonTasaNominalVencida() {
        return tasa;
    }
    
    public BigDecimal getRazonTasaNominalAdelantada() {
        return tasa;
    }
}
