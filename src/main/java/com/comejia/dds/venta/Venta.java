package com.comejia.dds.venta;

import com.comejia.dds.producto.Item;

import java.util.Date;
import java.util.List;

public abstract class Venta {
    private List<Item> items;
    private Date fecha;

    public Venta(List<Item> items, Date fecha) {
        this.items = items;
        this.fecha = fecha;
    }

    public abstract Integer recargo();

    public Integer importe() {
        return importeDeItems() + recargo();
    }

    public Integer importeDeItems() {
        return items.stream().mapToInt(Item::importe).sum();
    }

    public boolean esDeFecha(Date fecha) {
        return this.fecha.equals(fecha);
    }
}
