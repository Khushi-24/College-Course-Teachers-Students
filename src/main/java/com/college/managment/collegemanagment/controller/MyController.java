package com.college.managment.collegemanagment.controller;

import com.college.managment.collegemanagment.dto.CourseRequest;
import com.college.managment.collegemanagment.entities.Course;
import com.college.managment.collegemanagment.repository.StudentRepository;
import com.college.managment.collegemanagment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

//    private CourseService courseService;
//    public MyController(CourseService courseService) {
//        this.courseService = courseService;
//    }

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseService courseService;

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
   public Course addCourses(@RequestBody CourseRequest request){
        return  this.courseService.addCourses(request);
   }

   @PutMapping("/courses")
   public Course updateCourse(@RequestBody CourseRequest courseRequest){
        return  this.courseService.updateCourse(courseRequest);
    }

   @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable long courseId){
        return this.courseService.deleteCourse(courseId);
   }


}
