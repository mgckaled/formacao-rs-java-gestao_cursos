package com.br.mgck.gestao_cursos.modules.courses;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Length(min = 3, max = 100, message = "O nome do curso dever ter de 3 e 100 caracteres")
    private String name;

    @NotBlank
    private String category;

    @Pattern(regexp = "^(Ativo|Inativo)$", message = "Defina se o curso está Ativo ou Inativo")
    @Column(nullable = false)
    private String status;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

}
