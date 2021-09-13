package com.college.managment.collegemanagment.repository;

import com.college.managment.collegemanagment.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long> {
}
