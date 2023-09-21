package org.bedu.javabackendproyecto.proyectospringthymeleaft.models;

public class ItemFactura {

    private Producto producto;
    private Integer cantidad;

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    //retorna el valor del producto por la cantidad
    public Integer calcularImporte(){
        return cantidad * producto.getPrecio();
    }
}
