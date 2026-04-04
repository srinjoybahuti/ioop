// Step 1: Student base class
class Student {
    int rollNum;
    int marks;

    // read roll number
    void getRollNum(int r) {
        rollNum = r;
    }

    // display roll number
    void putRollNum() {
        System.out.println("Roll Number : " + rollNum);
    }

    // read marks
    void getMarks(int m) {
        marks = m;
    }

    // display marks
    void putMarks() {
        System.out.println("Marks       : " + marks);
    }
}

// Step 2: Sports interface
interface Sports {
    void putSportsScore(int score); // sets sports score
}

// Step 3: Result extends Student AND implements Sports
class Result extends Student implements Sports {
    int sportsScore;

    @Override
    public void putSportsScore(int score) {
        sportsScore = score;
    }

    // calculates and displays final result
    void displayResult() {
        int total = marks + sportsScore;
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Total Score : " + total);

        if (total >= 50)
            System.out.println("Result      : PASS");
        else
            System.out.println("Result      : FAIL");
    }
}

// Step 4: Main class
class ResultDemo {
    public static void main(String[] args) {

        Result r = new Result();

        r.getRollNum(101);
        r.getMarks(72);
        r.putSportsScore(18);

        System.out.println("---------- Student Result ----------");
        r.putRollNum();
        r.putMarks();
        r.displayResult();
    }
}
