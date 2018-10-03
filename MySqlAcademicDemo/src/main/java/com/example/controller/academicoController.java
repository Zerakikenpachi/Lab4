/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.model.curso;
import com.example.repository.alumnoRepository;
import com.example.repository.cursoRepository;
import com.example.repository.cursos_por_materiaRepository;
import com.example.repository.materiaRepository;
import com.example.repository.profesorRepository;
import com.example.service.academicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping(path = "/academicoController")
public class academicoController {

    @Autowired
    private academicoService soccerService;
    @Autowired
    private alumnoRepository alumnoRepository;
    @Autowired
    private cursoRepository cursoRepository;
    @Autowired
    private cursos_por_materiaRepository cursos_por_materiaRepository;
    @Autowired
    private materiaRepository materiaRepository;
    @Autowired
    private profesorRepository profesorRepository

    @PostMapping("/curso")
    ResponseEntity<?> curso(@RequestBody curso curso, UriComponentsBuilder ucBuilder) {
        cursoRepository.save(curso);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/academicoController/curso/{cursoId}").buildAndExpand(curso.getCursoId()).toUri()
        );
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    @GetMapping(path = "/all/{id}")
    public @ResponseBody
    Iterable<String> getAllStudents(@PathVariable("id") Long cursoId) {
// This returns a JSON or XML with the users
        return soccerService.getAllCursosAlumnos(cursoId);
    }
}
