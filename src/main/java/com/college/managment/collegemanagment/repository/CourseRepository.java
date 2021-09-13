package com.college.managment.collegemanagment.repository;

import com.college.managment.collegemanagment.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
