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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author nandani
 */

@Entity
@Table(name="instructor_detail")
public class InstructorDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="youtube_channel")
    private String youtubechannel;
    
    @Column(name="hobby")
    private String hobby;
    
    @OneToOne(mappedBy = "instructorDetails",cascade = CascadeType.ALL)
    private Instructor instructor;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public InstructorDetails() {
    }

    public InstructorDetails(String youtubechannel, String hobby) {
        this.youtubechannel = youtubechannel;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutubechannel() {
        return youtubechannel;
    }

    public void setYoutubechannel(String youtubechannel) {
        this.youtubechannel = youtubechannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetails{" + "id=" + id + ", youtubechannel=" + youtubechannel + ", hobby=" + hobby + '}';
    }
    
    
    
}
