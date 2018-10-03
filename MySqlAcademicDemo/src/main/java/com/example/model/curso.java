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

@Table(name = "CURSO")
@Entity
public class curso implements Serializable {

    public curso() {

    }

    public curso(long cursoId, String nombre_curso, int numero_alumnos, String aula, String horario, List<alumno> alumnos, 
            List<profesor> profesor, cursos_por_materia cursos_por_materia) {
        this.cursoId = cursoId;
        this.nombre_curso = nombre_curso;
        this.numero_alumnos = numero_alumnos;
        this.aula = aula;
        this.horario = horario;
        this.alumnos = alumnos;
        this.profesor = profesor;
        this.cursos_por_materia = cursos_por_materia;
    }

    @GeneratedValue
    @Id
    @Column(name = "ID_CURSO")
    private long cursoId;

    @Column(name = "NOMBRE_CURSO")
    private String nombre_curso;

    @Column(name = "NUMERO_ALUMNOS")
    private int numero_alumnos;

    @Column(name = "AULA")
    private String aula;

    @Column(name = "HORARIO")
    private String horario;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "curso")
    private List<alumno> alumnos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "curso")
    private List<profesor> profesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CURSO_POR_MATERIA", nullable = false)
    private cursos_por_materia cursos_por_materia;

    public long getCursoId() {
        return cursoId;
    }

    public void setCursoId(long cursoId) {
        this.cursoId = cursoId;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getNumero_alumnos() {
        return numero_alumnos;
    }

    public void setNumero_alumnos(int numero_alumnos) {
        this.numero_alumnos = numero_alumnos;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(List<profesor> profesor) {
        this.profesor = profesor;
    }

    public cursos_por_materia getCursos_por_materia() {
        return cursos_por_materia;
    }

    public void setCursos_por_materia(cursos_por_materia cursos_por_materia) {
        this.cursos_por_materia = cursos_por_materia;
    }

}
