package com.br.mgck.gestao_cursos.modules.courses.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.mgck.gestao_cursos.modules.courses.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, UUID> {

}
