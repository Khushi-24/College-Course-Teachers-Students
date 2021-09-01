package com.college.managment.collegemanagment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String course_name;
    private String course_description;
    private String professor_name;
    private String student;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                ", course_description='" + course_description + '\'' +
                ", professor_name='" + professor_name + '\'' +
                ", student='" + student + '\'' +
                '}';
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getProfessor_name() {
        return professor_name;
    }

    public void setProfessor_name(String professor_name) {
        this.professor_name = professor_name;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Course() {
        super();
    }

    public Course(long id, String course_name, String course_description, String professor_name, String student) {
        super();
        this.id = id;
        this.course_name = course_name;
        this.course_description = course_description;
        this.professor_name = professor_name;
        this.student = student;
    }


}
