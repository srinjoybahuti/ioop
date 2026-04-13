public class Q1 {

    private String name;
    private int age;

    public void registerStudent(String name, int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("Invalid age: " + age + 
                ". Age must be between 18 and 60.");
        }
        this.name = name;
        this.age = age;
        System.out.println("Student registered successfully!");
        System.out.println("Name: " + this.name);
        System.out.println("Age : " + this.age);
    }

    public static void main(String[] args) {

        Student s = new Student();

        // Test 1 - Valid age
        System.out.println("--- Test 1: Valid Age ---");
        try {
            s.registerStudent("Srinjoy", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2 - Invalid age too low
        System.out.println("\n--- Test 2: Age Too Low ---");
        try {
            s.registerStudent("Rahul", 15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3 - Invalid age too high
        System.out.println("\n--- Test 3: Age Too High ---");
        try {
            s.registerStudent("Arun", 65);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
