package com.company.intecap.apibooks.controllers;

import com.company.intecap.apibooks.response.CategoriaResponseRest;
import com.company.intecap.apibooks.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") //endpoint
public class CategoriaRestController {

    @Autowired //Inyeccion de dependencia
    private ICategoriaService service;

    @GetMapping("/categorias")
    public CategoriaResponseRest buscarCategorias() {
        return service.buscarCategorias();
    }

}
