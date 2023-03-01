/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nandani.hibernate.demo;
import com.nandani.hibernate.demo.entity.Instructor;
import com.nandani.hibernate.demo.entity.InstructorDetails;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author nandani
 */
public class GetInstructorDetailDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).
                addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();
            
            int theId=2;
            InstructorDetails i= session.get(InstructorDetails.class, theId);
            
            System.out.println(i);
            System.out.println(i.getInstructor());
            
            session.getTransaction().commit();
            System.out.println("done!!!!");

        } finally {
            factory.close();
        }
    }

}
