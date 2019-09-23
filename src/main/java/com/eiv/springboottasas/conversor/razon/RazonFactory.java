package com.eiv.springboottasas.conversor.razon;

import com.eiv.springboottasas.conversor.enums.TipoTasa;


public class RazonFactory {
    public static Razon getRazon(TipoTasa tipoTasa) {
        switch (tipoTasa) {
            case EFECTIVA:
                return new RazonTasaEfectiva();
            case NOMINAL_VENCIDA:
                return new RazonTasaNominalVencida();
            default:
                return new RazonTasaNominalAdelantada();
        }
    }
}
