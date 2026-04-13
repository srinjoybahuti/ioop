// Custom exception class inside same file
class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

// Course class inside same file
class Course {

    private String courseName;
    private int capacity;
    private int enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public void enrollStudent(String studentName) throws CourseFullException {
        if (enrolledStudents >= capacity) {
            throw new CourseFullException("Course " + courseName + 
                " is full! Maximum capacity is " + capacity + ".");
        }
        enrolledStudents++;
        System.out.println(studentName + " enrolled successfully in " + 
            courseName + ". Enrolled: " + enrolledStudents + "/" + capacity);
    }
}

// Main class
public class Q2 {

    public static void main(String[] args) {

        Course c = new Course("Java OOP", 2);

        String[] students = {"Srinjoy", "Rahul", "Arun"};

        for (String student : students) {
            try {
                c.enrollStudent(student);
            } catch (CourseFullException e) {
                System.out.println("Enrollment Failed: " + e.getMessage());
            }
        }
    }
}
