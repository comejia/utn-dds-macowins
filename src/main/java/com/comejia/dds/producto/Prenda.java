package com.comejia.dds.producto;

import com.comejia.dds.estado_prenda.Estado;

public class Prenda {

    private final Integer precioBase;
    private final Estado estado;

    public Prenda(Integer precioBase, Estado estado) {
        this.precioBase = precioBase;
        this.estado = estado;
    }

    public Integer precio() {
        return estado.precioFinal(precioBase);
    }
}
