package com.eiv.springboottasas.conversor.enums;

public enum Modulo {
    ANUAL(365),
    ANUAL_COMERCIAL(360),
    SEMESTRAL(180),
    TRIMESTRAL(90),
    BIMESTRAL(60),
    MENSUAL(30)
    ;
    
    int dias;
    
    private Modulo(int dias) {
        this.dias = dias;
    }
    
    public int getDias() {
        return dias;
    }
    
    public static Modulo getModulo(int id) {
        switch (id) {
            case 1:
                return ANUAL;
            case 2:
                return ANUAL_COMERCIAL;
            case 3:
                return SEMESTRAL;
            case 4:
                return TRIMESTRAL;
            case 5:
                return BIMESTRAL;
            case 6:
                return MENSUAL;
            default:
                return null;
        }
    }
}
