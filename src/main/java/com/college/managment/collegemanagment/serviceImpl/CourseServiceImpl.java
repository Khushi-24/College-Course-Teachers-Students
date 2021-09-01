package com.college.managment.collegemanagment.serviceImpl;

import com.college.managment.collegemanagment.dao.CourseDao;
import com.college.managment.collegemanagment.entities.Course;
import com.college.managment.collegemanagment.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseDao courseDao;
    //List<Course> list;

    public CourseServiceImpl(CourseDao courseDao){
        this.courseDao = courseDao;
    }
//    public CourseServiceImpl(){
////        list = new ArrayList<>();
////
////        list.add(new Course(1, "Java", "In this subject you will learn about core concepts of Java.", "Dharmesh Tank", "Raj Sharma" ));
////        list.add(new Course(218,"SpringBoot", "Rest APIs", "Siddharth Trevedi","Ravi Parmar"));
//
//    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getcourse(long courseId) {
/*
        Course c= null;
        for(Course course : list){
            if(course.getId() == courseId){
                c= course;
                break;
            }
        }
        return c;
*/
        return courseDao.getById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        /*
        list.add(course);
        return course;
         */
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

        /*
        Course updated_course = null;
            for(Course c : list){
            if(c.getId() == course.getId()){
               c.setCourse_name(course.getCourse_name());
               c.setCourse_description(course.getCourse_description());
               c.setProfessor_name(course.getProfessor_name());
               c.setStudent(course.getStudent());
               updated_course = c;
               break;
            }
        }
        return updated_course;
        */
        courseDao.save(course);
        return course;
    }


    @Override
    public Course deleteCourse(long courseId) {

        /*
        Course c = null;
        for(Course course : list)
        {
            if(course.getId() == courseId){
                list.remove(course);
                c= course;
                break;
            }
        }
        return c;
         */

        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
        return null;
    }
}
