/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.curso;
import com.example.model.cursos_por_materia;
import java.util.List;

/**
 *
 * @author victor restrepo
 */
public interface academicoService {

    public List<String> getAllCursosAlumnos(long cursoId);

    public void addAlumnoToCurso(long id, String nombres, String apellidos, String direccion, int numero, curso curso);
    
   /* 
    public List<String> getAllMateriasProfesores(long ID_CURSO);

    public void addMateriasToProfesores(long id, String nombre_materia, cursos_por_materia cursos_por_materia);
    
    
    public List<String> getAllMateriasCursos(long ID_CURSO);

    public void addMateriasToCursos(long id, String nombre_materia, cursos_por_materia cursos_por_materia);*/
}
