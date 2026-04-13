package edu.manipal.mit.registration;

import edu.manipal.mit.student.Student;
import edu.manipal.mit.course.Course;

public class Registration {

    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void registerStudent() {
        System.out.println("===== Student Registration Successful =====");
        System.out.println("---- Student Details ----");
        System.out.println("Name       : " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Department : " + student.getDepartment());
        System.out.println("GPA        : " + student.gpa);
        System.out.println("---- Course Details ----");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Instructor : " + course.getInstructor());
        System.out.println("Credits    : " + course.credits);
        System.out.println("===========================================");
    }
}
