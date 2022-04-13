package com.comejia.dds.estado_prenda;

public class Liquidacion implements Estado {

    @Override
    public Integer precioFinal(Integer precioBase) {
        return precioBase / 2;
    }
}
