package com.company.intecap.apibooks.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity // crear tabla en la DB
@Table(name = "categoria")
public class Categoria implements Serializable {

    //serializar el objeto y enviarlo por la red
    private static final long serialVersionUID = 1L;

    @Id //@Id para crear llave primara de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Se definen metodos de la clase
    private long id;
    private String nombre;
    private String descripcion;

    //Getters y setters (encapsulamiento)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
