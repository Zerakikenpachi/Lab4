/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;

import com.example.model.materia;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author victor restrepo
 */
public interface materiaRepository extends CrudRepository<materia, Long>{
    List<materia> findByMateriaId(long ID_MATERIA);
    List<materia> findByCursoPorMateriaId(long ID_CURSO_POR_MATERIA);
}
