package com.college.managment.collegemanagment.service;

import com.college.managment.collegemanagment.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getcourse(long courseId);

    public Course addCourse(Course course);

    Course updateCourse(Course course);

    Course deleteCourse(long courseId);
}
