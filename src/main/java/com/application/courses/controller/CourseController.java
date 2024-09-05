package com.application.courses.controller;

import com.application.courses.model.Course;
import com.application.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping()
    public ResponseEntity<Course> createCourse(@RequestBody Course course){

        Course created = courseService.createCourse(course);

        return new ResponseEntity<>(course, HttpStatus.CREATED);

    }

}
