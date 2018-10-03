/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victor restrepo
 */
@Table(name = "CURSOS_POR_MATERIA")
@Entity
public class cursos_por_materia implements Serializable {

    public cursos_por_materia() {

    }

    public cursos_por_materia(long CRMId, materia materia, List<curso> curso) {
        this.CRMId = CRMId;
        this.materia = materia;
        this.curso = curso;
    }

    @GeneratedValue
    @Id
    @Column(name = "ID_CURSO_POR_MATERIA")
    private long CRMId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MATERIA", nullable = false)
    private materia materia;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "curso_por_materia")
    private List<curso> curso;

    public long getCRMId() {
        return CRMId;
    }

    public void setCRMId(long CRMId) {
        this.CRMId = CRMId;
    }

    public materia getMateria() {
        return materia;
    }

    public void setMateria(materia materia) {
        this.materia = materia;
    }

    public List<curso> getCurso() {
        return curso;
    }

    public void setCurso(List<curso> curso) {
        this.curso = curso;
    }

    
}
