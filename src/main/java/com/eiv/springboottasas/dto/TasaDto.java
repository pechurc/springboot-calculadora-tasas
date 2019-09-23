package com.eiv.springboottasas.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.enums.TipoTasa;

public class TasaDto {
    @NotNull
    private TipoTasa tipoTasaOrigen;
    @NotNull
    private TipoTasa tipoTasaDestino;
    @NotNull
    private Modulo moduloOrigen;
    @NotNull
    private Modulo moduloDestino;
    @NotNull
    @Min(0)
    private Double valorTasa;
    @NotNull
    @Min(0)
    private Integer diasAmortizacion;

    public TipoTasa getTipoTasaOrigen() {
        return tipoTasaOrigen;
    }

    public void setTipoTasaOrigen(TipoTasa tipoTasa) {
        this.tipoTasaOrigen = tipoTasa;
    }

    public Double getValorTasa() {
        return valorTasa;
    }

    public void setValorTasa(Double valorTasa) {
        this.valorTasa = valorTasa;
    }

    public Modulo getModuloOrigen() {
        return moduloOrigen;
    }

    public void setModuloOrigen(Modulo moduloOrigen) {
        this.moduloOrigen = moduloOrigen;
    }

    public TipoTasa getTipoTasaDestino() {
        return tipoTasaDestino;
    }

    public void setTipoTasaDestino(TipoTasa tipoTasaDestino) {
        this.tipoTasaDestino = tipoTasaDestino;
    }

    public Modulo getModuloDestino() {
        return moduloDestino;
    }

    public void setModuloDestino(Modulo moduloDestino) {
        this.moduloDestino = moduloDestino;
    }

    public Integer getDiasAmortizacion() {
        return diasAmortizacion;
    }

    public void setDiasAmortizacion(Integer diasAmortizacion) {
        this.diasAmortizacion = diasAmortizacion;
    }
}
