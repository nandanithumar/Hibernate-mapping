/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nandani.hibernate.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandani
 */
@Entity
@Table(name="instructor")
public class Instructor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="email")
    private String email;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "instructor_detail_id")
    private InstructorDetails instructorDetails;
    
    
//    @OneToMany(mappedBy = "instuctor")
//    private List<Course> course;

    public Instructor() {
    }

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InstructorDetails getInstructorDetails() {
        return instructorDetails;
    }

    public void setInstructorDetails(InstructorDetails instructorDetails) {
        this.instructorDetails = instructorDetails;
    }

//    public List<Course> getCourse() {
//        return course;
//    }
//
//    public void setCourse(List<Course> course) {
//        this.course = course;
//    }
    @Override
    public String toString() {
        return "Instructor{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", instructorDetails=" + instructorDetails + '}';
    }
    
//    public void add(Course c){
//    
//    if(course==null){
//        course=new ArrayList<>();
//    }
//    
//    
//    course.add(c);
//    
//    c.setInstructor(firstName);
//    
//    }
//    
//    
    
}
