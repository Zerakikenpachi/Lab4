/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;


import com.example.model.cursos_por_materia;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author victor restrepo
 */
public interface cursos_por_materiaRepository extends CrudRepository<cursos_por_materia, Long>{
     List<cursos_por_materia> findByMateriaId(long ID_MATERIA);
     cursos_por_materia findByCursoPorMateria(long ID_CURSO_POR_MATERIA); 
}
