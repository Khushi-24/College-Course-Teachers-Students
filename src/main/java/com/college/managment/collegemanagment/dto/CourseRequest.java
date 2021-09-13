package com.college.managment.collegemanagment.dto;

import com.college.managment.collegemanagment.entities.Course;
import com.college.managment.collegemanagment.entities.Students;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseRequest {

    private Course course;
}
