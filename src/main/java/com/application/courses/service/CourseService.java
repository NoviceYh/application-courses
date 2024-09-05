package com.application.courses.service;

import com.application.courses.model.Course;

import java.util.List;

public interface CourseService {

    Course createCourse(Course course);

    List<Course> findAllCourses();

}
