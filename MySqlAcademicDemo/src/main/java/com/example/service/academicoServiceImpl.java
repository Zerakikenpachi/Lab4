/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.alumno;
import com.example.model.curso;
import com.example.model.cursos_por_materia;
import com.example.repository.alumnoRepository;
import com.example.repository.cursoRepository;
import com.example.repository.cursos_por_materiaRepository;
import com.example.repository.materiaRepository;
import com.example.repository.profesorRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author victor restrepo
 */
public class academicoServiceImpl implements academicoService {

    @Autowired
    private alumnoRepository alumnoRepository;
    @Autowired
    private cursoRepository cursoRepository;
    @Autowired
    private cursos_por_materiaRepository cursos_por_materiaRepository;
    @Autowired
    private materiaRepository materiaRepository;
    @Autowired
    private profesorRepository profesorRepository;

    @Override
    public List<String> getAllCursosAlumnos(long ID_CURSO) {
        List<String> result = new ArrayList<String>();
        List<alumno> alumnos = alumnoRepository.findByCursoId(ID_CURSO);
        for (alumno alumno : alumnos) {
            result.add(alumno.getNombres());
        }
        return result;
    }

    @Override
    public void addAlumnoToCurso(long id, String nombres, String apellidos, String direccion, int numero, curso curso) {
        curso course = cursoRepository.findByAlumnos(cursoId).get();
        alumno newAlumno = new alumno();
        newAlumno.setNombres(nombres);
        newAlumno.setApellidos(apellidos);
        newAlumno.setDireccion(direccion);
        newAlumno.setNumero(numero);
        newAlumno.setCurso(curso);
        alumnoRepository.save(newAlumno);
    }
/*
    @Override
    public List<String> getAllMateriasProfesores(long ID_CURSO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addMateriasToProfesores(long id, String nombre_materia, cursos_por_materia cursos_por_materia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getAllMateriasCursos(long ID_CURSO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addMateriasToCursos(long id, String nombre_materia, cursos_por_materia cursos_por_materia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}
