package com.example.crud.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee_details")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "age")
    private String age;

}
