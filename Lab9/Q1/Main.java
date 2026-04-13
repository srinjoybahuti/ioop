package edu.manipal.mit.main;

import edu.manipal.mit.student.Student;
import edu.manipal.mit.course.Course;
import edu.manipal.mit.registration.Registration;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Srinjoy", 230911, "CSE", 9.2);
        Course c1 = new Course("Java OOP", "Prof. Sharma", 4);
        Registration reg = new Registration(s1, c1);
        reg.registerStudent();
    }
}
