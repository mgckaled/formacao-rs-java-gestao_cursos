package com.br.mgck.gestao_cursos.modules.courses.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.mgck.gestao_cursos.modules.courses.CourseEntity;
import com.br.mgck.gestao_cursos.modules.courses.repository.CourseRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/")
    public void create(@Valid @RequestBody CourseEntity courseEntity) {
        this.courseRepository.save(courseEntity);
    }

}
