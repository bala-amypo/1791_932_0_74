package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;
}
public StudentEntity(Long Id,String name,String email,float cgpa)
this.Id=Id;
this.name=name;
this

public void setName(stringname){
    this.name=name;

}
public string getname(){
    return this.name;
}
public void SetEmail(StringEmail){
    return.this.email;
}
public void SetEmail(){
    return.this.email;
}