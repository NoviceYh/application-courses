package com.application.courses.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "lesson_order")
    private Integer lessonOrder;

    // Muchas lecciones pueden tener un modulo
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;
}

