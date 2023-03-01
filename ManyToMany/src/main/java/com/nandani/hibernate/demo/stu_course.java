package com.nandani.hibernate.demo;

import com.nandani.hibernate.demo.entity.Course;
import com.nandani.hibernate.demo.entity.Instructor;
import com.nandani.hibernate.demo.entity.InstructorDetails;
import com.nandani.hibernate.demo.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class stu_course {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetails.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            Course tempcourse = new Course("pacman");
            session.save(tempcourse);

            Student tempstudent1 = new Student("nandani", "patel", "nnupatel2232@gmail.com");
            tempcourse.addStudent(tempstudent1);
            session.save(tempstudent1);

            System.out.println(tempcourse.getStudents());

            session.getTransaction().commit();
            System.out.println("done!!!!");

        } finally {
            factory.close();
        }
    }

}
