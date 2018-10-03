package com.example.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "PROFESOR")
@Entity
public class profesor implements Serializable {

    public profesor() {

    }

    public profesor(long profesorId, String nombres_profesor, int apellidos_profesor, curso curso) {
        this.profesorId = profesorId;
        this.nombres_profesor = nombres_profesor;
        this.apellidos_profesor = apellidos_profesor;
        this.curso = curso;
    }
    
    @GeneratedValue
    @Id
    @Column(name = "ID_PROFESOR")
    private long profesorId;

    @Column(name = "NOMBRES_PROFESOR")
    private String nombres_profesor;

    @Column(name = "APELLIDOS_PROFESOR")
    private int apellidos_profesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CURSO", nullable = false)
    private curso curso;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "profesor", joinColumns = {
        @JoinColumn(name = "ID_PROFESOR")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_MATERIA")})
    private Set<materia> materia = new HashSet();

    public long getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(long profesorId) {
        this.profesorId = profesorId;
    }

    public String getNombres_profesor() {
        return nombres_profesor;
    }

    public void setNombres_profesor(String nombres_profesor) {
        this.nombres_profesor = nombres_profesor;
    }

    public int getApellidos_profesor() {
        return apellidos_profesor;
    }

    public void setApellidos_profesor(int apellidos_profesor) {
        this.apellidos_profesor = apellidos_profesor;
    }

    public curso getCurso() {
        return curso;
    }

    public void setCurso(curso curso) {
        this.curso = curso;
    }

    public Set<materia> getMateria() {
        return materia;
    }

    public void setMateria(Set<materia> materia) {
        this.materia = materia;
    }

   
}
