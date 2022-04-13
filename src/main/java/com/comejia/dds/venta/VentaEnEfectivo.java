package com.comejia.dds.venta;

import com.comejia.dds.producto.Item;

import java.util.Date;
import java.util.List;

public class VentaEnEfectivo extends Venta {

    public VentaEnEfectivo(List<Item> items, Date fecha) {
        super(items, fecha);
    }

    @Override
    public Integer recargo() {
        return 0;
    }
}
