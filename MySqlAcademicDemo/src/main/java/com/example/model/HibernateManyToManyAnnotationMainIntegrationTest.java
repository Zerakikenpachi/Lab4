/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import com.example.model.cursos_por_materia;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author victor restrepo
 */
public class HibernateManyToManyAnnotationMainIntegrationTest {
    
    private static SessionFactory sessionFactory;
    private Session session;
 
    // ...
 
    @Test
    public void givenData_whenInsert_thenCreatesMtoMrelationship() {
        String[] profesorData = { "1027","Peter Oven", "Allan Norman" , "Arquitectura" };
        String[] materiaData = {"1", "arquitectura", "5041" };
        Set<materia> materias = new HashSet<>();
        
        //public materia(long id, String nombre_materia, cursos_por_materia cursos_por_materia)
 
        for (String proj : materiaData) {
            materias.add(new materia());//mirar por si falla
        }
 
        for (String emp : profesorData) {
            profesor profesorr = new profesor();//mirar bien
  
            assertEquals(emp, profesorr.getMateria());//verificar
            profesorr.setMateria(materias);
            session.persist(profesorr);
  
            assertNotNull(profesorr);
        }
    }
 
    @Test
    public void givenSession_whenRead_thenReturnsMtoMdata() {
        @SuppressWarnings("unchecked")
        List<profesor> profesorList = session.createQuery("FROM profesor").list();
  
        assertNotNull(profesorList);
  
        for(profesor profesor : profesorList) {
            assertNotNull(profesor.getMateria());
        }
    }
 
    // ...
}
