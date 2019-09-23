package com.eiv.springboottasas.conversor.tasa;

import com.eiv.springboottasas.conversor.enums.TipoTasa;

public class TasaFactory {

    public static Tasa getTasa(TipoTasa tipoTasa) {
        switch (tipoTasa) {
            case EFECTIVA:
                return new TasaEfectiva();
            case NOMINAL_VENCIDA:
                return new TasaNominalVencida();
            default:
                return new TasaNominalAdelantada();
        }
    }
}
