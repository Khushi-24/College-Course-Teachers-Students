package com.college.managment.collegemanagment.controller;

import com.college.managment.collegemanagment.entities.Course;
import com.college.managment.collegemanagment.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

     // it will create the object of CourseService Implementation class
    private CourseService courseService;

    public MyController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/home")
    public String home(){
        return "Go to your home or I will punch you";
    }

   @GetMapping("/courses")
   public List<Course> getCourses(){
      return this.courseService.getCourses();
   }

   @GetMapping("/courses/{courseId}")
   public Course getCourse(@PathVariable long courseId){
        return this.courseService.getcourse(courseId);
   }

   @PostMapping("/courses")
   public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
   }

   @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return  this.courseService.updateCourse(course);
   }

   @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable long courseId){
        return this.courseService.deleteCourse(courseId);
   }
}
