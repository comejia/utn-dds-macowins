package com.comejia.dds.estado_prenda;

public class Promocion implements Estado {

    private final Integer descuento;

    public Promocion(Integer descuento) {
        this.descuento = descuento;
    }

    @Override
    public Integer precioFinal(Integer precioBase) {
        return precioBase - this.descuento;
    }
}
