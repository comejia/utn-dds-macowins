package com.comejia.dds.estado_prenda;

public class Nueva implements Estado {

    @Override
    public Integer precioFinal(Integer precioBase) {
        return precioBase;
    }
}
