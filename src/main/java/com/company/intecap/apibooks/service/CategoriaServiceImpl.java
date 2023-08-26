package com.company.intecap.apibooks.service;

import com.company.intecap.apibooks.dao.ICategoriaDao;
import com.company.intecap.apibooks.model.Categoria;
import com.company.intecap.apibooks.response.CategoriaResponseRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoriaServiceImpl implements ICategoriaService{
    //Errores, capturar en la consola

    private  static  final Logger log = LoggerFactory.getLogger(CategoriaServiceImpl.class);
    // el log es para mostrar en cosola los errores

    @Autowired // Inyeccion de dependencia
    private ICategoriaDao categoriaDao;

    @Override
    public CategoriaResponseRest buscarCategorias() {
        //Logica de negocio

        log.info("Inicio metodo buscarCategorias()");
        CategoriaResponseRest response = new CategoriaResponseRest(); // instancia de la clase categoriaREsponseRest

        try {
            List<Categoria> categoria = (List<Categoria>) categoriaDao.findAll();
            response.getCategoriaResponse().setCategorias(categoria);
            response.setMetadata("Respuesta ok", "200", "Respuesta exitosa");
        } catch (Exception e) {
            response.setMetadata("Respuesta no ok", "500", "Error al consultar categorias");
            log.error("Error al consultar categorias {}", e.getMessage());
            e.getStackTrace(); //mostrar erroe en consola en caso que exista
        }

        return response;
    }
}
