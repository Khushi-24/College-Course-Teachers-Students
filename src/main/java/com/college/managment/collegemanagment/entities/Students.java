package com.college.managment.collegemanagment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}

//@GeneratedValue(strategy = GenerationType.AUTO)
//