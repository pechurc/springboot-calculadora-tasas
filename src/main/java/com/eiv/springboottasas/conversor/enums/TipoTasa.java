package com.eiv.springboottasas.conversor.enums;

public enum TipoTasa {
    EFECTIVA(1),
    NOMINAL_ADELANTADA(2),
    NOMINAL_VENCIDA(3);

    int id;

    private TipoTasa(int id) {
        this.id = id;
    }
    
    public static TipoTasa getTipoTasa(int id) {
        switch (id) {
            case 1:
                return EFECTIVA;
            case 2:
                return NOMINAL_ADELANTADA;
            case 3:
                return NOMINAL_VENCIDA;
            default:
                return null;
        }
    }
    
    public int getId() {
        return id;
    }
}
