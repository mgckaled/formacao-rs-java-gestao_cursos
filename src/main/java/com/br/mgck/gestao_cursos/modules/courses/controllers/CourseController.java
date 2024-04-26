package com.br.mgck.gestao_cursos.modules.courses.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.mgck.gestao_cursos.modules.courses.CourseEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/course")
public class CourseController {

    @PostMapping("/")
    public void create(@Valid @RequestBody CourseEntity courseEntity) {
        System.out.println("Curso");
        System.out.println(courseEntity.getName());
    }
}
