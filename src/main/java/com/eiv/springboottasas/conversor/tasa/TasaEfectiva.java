package com.eiv.springboottasas.conversor.tasa;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.razon.Razon;

public class TasaEfectiva extends TasaAbstract {

    public Double getTasa() {
        
        return (razonOrigen.getRazonTasaEfectiva() - 1) * 100;
    }    
    
    public Double getRazon() {
        return razonOrigen.getRazonTasaEfectiva();
    }

    @Override
    public Double calcular(Razon razon, Modulo modulo, int diasAmortizacion) {
        return (razon.getRazonTasaEfectiva() - 1) * 100;
    }

}
