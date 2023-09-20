package org.bedu.javabackendproyecto.proyectospringthymeleaft;

import org.bedu.javabackendproyecto.proyectospringthymeleaft.models.dominio.ItemFactura;
import org.bedu.javabackendproyecto.proyectospringthymeleaft.models.dominio.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("itemsFacturaCasa")
    @Primary
    public List<ItemFactura> registarItems() {
        ItemFactura linea1 = new ItemFactura(new Producto("Cama 2 plazas", 50), 2);
        ItemFactura linea2 = new ItemFactura(new Producto("Ropero 1,80 x 1,20", 200), 5);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaTecno")
    public List<ItemFactura> registrarItemOficina() {
        ItemFactura linea1 = new ItemFactura(new Producto("Monitor LG LCD 24", 250), 2);
        ItemFactura linea2 = new ItemFactura(new Producto("Notebook Asus", 500), 1);
        ItemFactura linea3 = new ItemFactura(new Producto("Impresora HP multifunción", 80), 1);
        ItemFactura linea4 = new ItemFactura(new Producto("Celular Motorola G20", 300), 1);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }


}
