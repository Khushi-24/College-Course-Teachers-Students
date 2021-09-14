package com.college.managment.collegemanagment.controller;

import com.college.managment.collegemanagment.dto.CourseRequest;
import com.college.managment.collegemanagment.entities.Course;
import com.college.managment.collegemanagment.repository.StudentRepository;
import com.college.managment.collegemanagment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
   public ResponseEntity<List<Course>> getCourses(){

       List<Course> courses = courseService.getCourses();
       if(courses.size() <= 0){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
      return ResponseEntity.of(Optional.of(courses));
   }

   @GetMapping("/courses/{courseId}")
   public ResponseEntity<Course> getCourse(@PathVariable long courseId){
        Course course = courseService.getcourse(courseId);
        if(course == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(course));
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
