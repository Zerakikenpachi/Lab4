/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;

import com.example.model.alumno;
import com.example.model.curso;

/**
 *
 * @author victor restrepo
 */
public class alumnoModel {

    public alumnoModel() {

    }

    public alumnoModel(alumno alumno) {
        this.id = alumno.getAlumnoId();
        this.nombres = alumno.getNombres();
        this.apellidos = alumno.getApellidos();
        this.direccion = alumno.getDireccion();
        this.numero = alumno.getNumero();
        this.curso = alumno.getCurso();
    }

    public alumnoModel(long id, String nombres, String apellidos, String direccion, int numero, curso curso) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numero = numero;
        this.curso = curso;
    }


    private long id;

    private String nombres;

    private String apellidos;

    private String direccion;
    
    private int numero;
    
    private curso curso;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public curso getCurso() {
        return curso;
    }

    public void setCurso(curso curso) {
        this.curso = curso;
    }
    
}
