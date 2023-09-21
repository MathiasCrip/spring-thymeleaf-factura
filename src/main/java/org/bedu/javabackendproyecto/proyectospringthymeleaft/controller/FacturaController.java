package org.bedu.javabackendproyecto.proyectospringthymeleaft.controller;

import org.bedu.javabackendproyecto.proyectospringthymeleaft.models.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    //Sube el título + el objeto factura a la pagina ver.html
    @GetMapping("/ver")
    public String ver(Model model) {
        model.addAttribute("factura", factura);
        model.addAttribute("titulo", "Ejemplo Factura con inyeccion de dependencia");
        return "ver";
    }
}
