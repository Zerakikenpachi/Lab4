/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;

import com.example.model.alumno;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author victor restrepo
 */
 @Repository
public interface alumnoRepository extends CrudRepository<alumno, Long>{
     List<alumno> findByCursoId(long cursoId);
}

