package com.college.managment.collegemanagment.service;

import com.college.managment.collegemanagment.dto.CourseRequest;
import com.college.managment.collegemanagment.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getcourse(long courseId);

    public Course deleteCourse(long courseId);

    public Course addCourses(CourseRequest request);

    public Course updateCourse(CourseRequest courseRequest);
}
