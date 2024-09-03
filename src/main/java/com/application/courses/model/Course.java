package com.application.courses.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String price;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime lastUpdate;

    @Column
    private LocalDateTime deleteDate;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private User instructor;
}
