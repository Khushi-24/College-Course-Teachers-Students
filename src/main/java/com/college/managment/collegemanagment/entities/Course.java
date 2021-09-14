package com.college.managment.collegemanagment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Course {

    @Id
    private long id;
    private String course_name;
    private String course_description;
    private String professor_name;
    //private Students student;

//    @OneToMany(targetEntity = Students.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "courseName_fk", referencedColumnName = "id")

    @ManyToMany(targetEntity = Students.class, cascade = CascadeType.ALL)
    @JoinTable(name = "Student_Enrolled",
               joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "enrollment_no"))

    private List<Students> studentsList;

}


/*
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

    public String getStudent(Students s) {
        this.student = s;
        return String.valueOf(student);
    }

    public void setStudent(Students student) {
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

    public Course(long id, String course_name, String course_description, String professor_name, Students student) {
        super();
        this.id = id;
        this.course_name = course_name;
        this.course_description = course_description;
        this.professor_name = professor_name;
        this.student = student;
    }

*/