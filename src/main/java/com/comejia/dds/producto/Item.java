package com.comejia.dds.producto;

public class Item {
    private final Prenda prenda;
    private final Integer cantidad;

    public Item(Prenda prenda, Integer cantidad) {
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public Integer importe() {
        return this.prenda.precio() * this.cantidad;
    }
}
