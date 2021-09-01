package com.college.managment.collegemanagment.dao;

import com.college.managment.collegemanagment.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {
}
