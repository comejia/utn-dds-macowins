package com.comejia.dds.producto;

import com.comejia.dds.estado_prenda.Estado;
import com.comejia.dds.tipo_prenda.Tipo;

public class Prenda {

    private final Integer precioBase;
    private Estado estado;
    private final Tipo tipo;

    public Prenda(Integer precioBase, Estado estado, Tipo tipo) {
        this.precioBase = precioBase;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Integer precio() {
        return estado.precioFinal(precioBase);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }
}
