package com.application.courses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String lastname;

    @Column
    private String username;

    @Column
    private String paswword;

    @Column
    private String dni;

    @Column
    private String email;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime lastUpdate;

    @Column
    private LocalDateTime deleteDate;

    @Column
    private Role role;


}
