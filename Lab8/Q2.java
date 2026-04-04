// Step 1: Define the Interface
interface Series {
    int getNext();       // returns next number in series
    void reset();        // restarts the series
    void setStart(int x); // sets the starting value
}

// Step 2: ByTwos class implements Series
class ByTwos implements Series {
    int start;   // starting value
    int current; // current value in the series

    ByTwos() {
        start = 0;
        current = 0;
    }

    @Override
    public int getNext() {
        current += 2;      // each number is 2 greater than previous
        return current;
    }

    @Override
    public void reset() {
        current = start;   // go back to starting value
    }

    @Override
    public void setStart(int x) {
        start = x;
        current = x;       // reset current to new start
    }
}

// Step 3: Main class using Interface reference
class SeriesDemo {
    public static void main(String[] args) {

        Series s = new ByTwos(); // interface reference pointing to ByTwos object

        System.out.println("--- Default series starting from 0 ---");
        for (int i = 0; i < 5; i++) {
            System.out.println(s.getNext());
        }

        System.out.println("\n--- After reset ---");
        s.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println(s.getNext());
        }

        System.out.println("\n--- After setStart(10) ---");
        s.setStart(10);
        for (int i = 0; i < 5; i++) {
            System.out.println(s.getNext());
        }
    }
}
