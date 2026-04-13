public class Q3 {

    public double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Cannot calculate average. " + 
                "Number of subjects cannot be zero.");
        }
        double average = (double) totalMarks / numberOfSubjects;
        return average;
    }

    public static void main(String[] args) {

        Student s = new Student();

        // Test 1 - Valid data
        System.out.println("--- Test 1: Valid Data ---");
        try {
            double avg = s.calculateAverage(450, 5);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2 - Zero subjects
        System.out.println("\n--- Test 2: Zero Subjects ---");
        try {
            double avg = s.calculateAverage(450, 0);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3 - Zero marks
        System.out.println("\n--- Test 3: Zero Marks ---");
        try {
            double avg = s.calculateAverage(0, 5);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
