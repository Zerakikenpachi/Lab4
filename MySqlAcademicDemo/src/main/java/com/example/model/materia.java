package com.example.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "MATERIA")
@Entity
public class materia implements Serializable {

    public materia() {

    }

    public materia(long  materiaId, String nombre_materia, cursos_por_materia cursos_por_materia) {
        this. materiaId =  materiaId;
        this.nombre_materia = nombre_materia;
        this.cursos_por_materia = cursos_por_materia;
    }
    
    @GeneratedValue
    @Id
    @Column(name = "ID_MATERIA")
    private long materiaId;

    @Column(name = "NOMBRE_MATERIA")
    private String nombre_materia;
    
    @ManyToMany(mappedBy = "materia")
    private Set<materia> materia = new HashSet<>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CURSO_POR_MATERIA", nullable = false)
    private cursos_por_materia cursos_por_materia;

    public long getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(long materiaId) {
        this.materiaId = materiaId;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public Set<materia> getMateria() {
        return materia;
    }

    public void setMateria(Set<materia> materia) {
        this.materia = materia;
    }

    public cursos_por_materia getCursos_por_materia() {
        return cursos_por_materia;
    }

    public void setCursos_por_materia(cursos_por_materia cursos_por_materia) {
        this.cursos_por_materia = cursos_por_materia;
    }

}
