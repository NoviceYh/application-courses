package com.application.courses.service.impl;

import com.application.courses.model.Course;
import com.application.courses.repository.CourseRepository;
import com.application.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }
}
