package com.college.managment.collegemanagment.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Students {

    @Id
    private long enrollment_no;
    private String name;
    private String division;

    @JsonIgnore
    @ManyToMany(targetEntity = Course.class, cascade = CascadeType.ALL, mappedBy = "studentsList")

    private List<Course> courseList;
}

//@GeneratedValue(strategy = GenerationType.AUTO)
//