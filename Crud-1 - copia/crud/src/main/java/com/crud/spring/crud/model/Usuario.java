package com.crud.spring.crud.model;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "correo", nullable = false, unique = true)
    private String correo;
    
    @Column(name = "edad")
    private Integer edad;

    public Usuario(){

    }

    public Usuario(String nombre,String correo,Integer edad){
        this.nombre= nombre;
        this.correo= correo;
        this.edad= edad;

    }
      // Getters y setters
      public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
