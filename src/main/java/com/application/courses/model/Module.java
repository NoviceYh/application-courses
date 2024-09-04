package com.application.courses.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Column(name = "module_order")
    private Integer moduleOrder;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
