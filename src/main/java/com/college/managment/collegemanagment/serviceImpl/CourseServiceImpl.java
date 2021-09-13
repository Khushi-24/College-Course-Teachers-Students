package com.college.managment.collegemanagment.serviceImpl;

import com.college.managment.collegemanagment.dto.CourseRequest;
import com.college.managment.collegemanagment.repository.CourseRepository;
import com.college.managment.collegemanagment.entities.Course;
import com.college.managment.collegemanagment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private  CourseRepository courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getcourse(long courseId) {

        Course entity = courseDao.getOne(courseId);
        //System.out.println(entity);
        return entity;
    }

//    @Override
//    public Course updateCourse(Course course) {
//
//        courseDao.save(course);
//        return course;
//    }


    @Override
    public Course deleteCourse(long courseId) {

        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
        return null;
    }

    @Override
    public Course addCourses(CourseRequest request) {
        courseDao.save(request.getCourse());
        return request.getCourse();
    }

    @Override
    public Course updateCourse(CourseRequest courseRequest) {
        courseDao.save(courseRequest.getCourse());
        return courseRequest.getCourse();
    }
}




/*
   //List<Course> list;

//    public CourseServiceImpl(CourseRepository courseDao){
//        this.courseDao = courseDao;
//    }
//    public CourseServiceImpl(){
////        list = new ArrayList<>();
////
////        list.add(new Course(1, "Java", "In this subject you will learn about core concepts of Java.", "Dharmesh Tank", "Raj Sharma" ));
////        list.add(new Course(218,"SpringBoot", "Rest APIs", "Siddharth Trevedi","Ravi Parmar"));
//
//    }

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
    /*
        list.add(course);
        return course;
         */

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
