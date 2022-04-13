package com.comejia.dds;

import com.comejia.dds.producto.Prenda;
import com.comejia.dds.tipo_prenda.Tipo;
import com.comejia.dds.venta.Venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Negocio {

    private List<Venta> ventas = new ArrayList<>();

    public Integer precioDePrenda(Prenda prenda) {
        return prenda.precio();
    }

    public Tipo tipoDePrenda(Prenda prenda) {
        return prenda.getTipo();
    }

    public void registrarVenta(Venta venta) {
        this.ventas.add(venta);
    }

    public Integer gananciaDeUnDia(Date fecha) {
        return this.ventas.stream()
                .filter(venta -> venta.esDeFecha(fecha))
                .mapToInt(Venta::importe)
                .sum();
    }
}
